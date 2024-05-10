package App.Domain;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface IVendorRepository extends IRepository<Vendor> {

    int update(String type, Vendor vendor);

    boolean delete(String name);

    List<Vendor> getName(String name);

    List<Vendor> getAllNames();

    List<Vendor> getType(String type);

    void setDatabaseConnection(JdbcTemplate databaseConnection);
}
