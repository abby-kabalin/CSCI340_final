package App.Domain;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface ITeamRepository extends IRepository<Team> {
    int update(int standing, Team team);

    boolean delete(String name);

    List<PlayerName> getName(String playerName);

    List<PlayerName> getAllNames();

    List<PlayerNum> getNum(String playerNum);

    void setDatabaseConnection(JdbcTemplate databaseConnection);
}
