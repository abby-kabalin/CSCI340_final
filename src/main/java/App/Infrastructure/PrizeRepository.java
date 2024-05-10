package App.Infrastructure;

import App.Domain.IPrizeRepository;
import App.Domain.Prize;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PrizeRepository implements IPrizeRepository {
    @Override
    public Prize create(Prize prize) {
        return null;
    }

    @Override
    public int update(Prize prize) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Prize get(int id) throws Exception {
        return null;
    }

    @Override
    public Prize getString(String name) throws Exception {
        return null;
    }

    @Override
    public List<Prize> get() {
        return List.of();
    }

    public void setDatabaseConnection(JdbcTemplate databaseConnection) {

    }
}
