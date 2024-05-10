
package App.Infrastructure;


import App.Domain.*;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class WorkTeamRepository implements IWorkTeamRepository {
    private JdbcTemplate databaseConnection;

    @Override
    public WorkTeam create(WorkTeam team) {
        String sql = "INSERT INTO TOURNAMENT.WORKTEAM\n" +
                "VALUES ('"
                + team.getName() + "', '"
                + team.getClub()  + "', '"
                + team.getPlayerNames() + "', '"
                + team.getPlayerNums() + "', '";
        this.databaseConnection.execute(sql);
        return team;
    }

    @Override
    public int update(WorkTeam team) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public WorkTeam get(int id) throws Exception {
        return null;
    }

    @Override
    public WorkTeam getString(String name) throws Exception {
        return null;
    }

    @Override
    public List<WorkTeam> get() {
        return List.of();
    }

    public int update(String name, String club, WorkTeam team){
        String sql = "UPDATE TOURNAMENT.WORKTEAM SET name = '" + team.getName() + "',"
                + "Club  = '" + team.getClub() + "'," +
                "WHERE Team = '" + name + "' AND Club = '" + club + "';";
        int rows = this.databaseConnection.update(sql);
        return rows;
    }

    @Override
    public boolean delete(String name) {
        return false;
    }

    public boolean delete(String name, String club){
        String sql = "DELETE FROM TOURNAMENT.WORKTEAM" +
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

    @Override
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
