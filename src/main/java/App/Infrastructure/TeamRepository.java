package App.Infrastructure;


import App.Domain.PlayerName;
import App.Domain.PlayerNum;
import App.Domain.Team;
import App.Domain.ITeamRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TeamRepository implements ITeamRepository {
    private JdbcTemplate databaseConnection;

    @Override
    public Team create(Team team) {
        String sql = "INSERT INTO TOURNAMENT.TEAM\n" +
                "VALUES ('"
                + team.getName() + "', '"
                + team.getClub()  + "', '"
                + team.getPlayerNames() + "', '"
                + team.getPlayerNums() + "' , '"
                + team.getStanding() + "');";
        this.databaseConnection.execute(sql);
        return team;
    }

    @Override
    public int update(Team team) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Team get(int id) throws Exception {
        return null;
    }

    @Override
    public Team getString(String name) throws Exception {
        return null;
    }

    @Override
    public List<Team> get() {
        return List.of();
    }


    @Override
    public int update(int standing, Team team) {
        return 0;
    }

    public int update(String name, String club, Team team){
        String sql = "UPDATE TOURNAMENT.TEAM SET name = '" + team.getName() + "',"
                + "Club  = '" + team.getClub() + "',"
                + "Standing = '" + team.getStanding() + "' " +
                "WHERE Team = '" + name + "' AND Club = '" + club + "';";
        int rows = this.databaseConnection.update(sql);
        return rows;
    }

    @Override
    public boolean delete(String name) {
        return false;
    }

    public boolean delete(String name, String club){
        String sql = "DELETE FROM TOURNAMENT.TEAM" +
                "WHERE Team = '" + name + "' AND Club = '" + club + "';";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public List<PlayerName> getName(String playerName) {
        String sql = "SELECT * FROM TOURNAMENT.TEAM WHERE PlayerName = '" + playerName + "';";
        List<PlayerName> names = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(PlayerName.class));
        return names;
    }

    @Override
    public List<PlayerName> getAllNames() {
        String sql = "SELECT * FROM TOURNAMENT.TEAM;";
        List<PlayerName> names = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(PlayerName.class));
        return names;
    }

    @Override
    public List<PlayerNum> getNum(String playerNum) {
        String sql = "SELECT * FROM TOURNAMENT.TEAM WHERE PlayerNum = '" + playerNum + "';";
        List<PlayerNum> nums = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(PlayerNum.class));
        return nums;
    }

    public List<PlayerNum> getAllNums() {
        String sql = "SELECT * FROM TOURNAMENT.TEAM;";
        List<PlayerNum> nums = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(PlayerNum.class));
        return nums;
    }

    @Override
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
}
