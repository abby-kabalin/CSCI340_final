package App.Domain;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface IWorkTeamRepository extends IRepository<WorkTeam>{
    boolean delete(String name);

    List<PlayerName> getName(String playerName);

    List<PlayerName> getAllNames();

    List<PlayerNum> getNum(String playerNum);

    List<PlayerNum> getAllNums();

    void setDatabaseConnection(JdbcTemplate databaseConnection);
}
