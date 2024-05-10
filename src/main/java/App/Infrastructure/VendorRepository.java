package App.Infrastructure;

import App.Domain.Vendor;
import App.Domain.IVendorRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class VendorRepository implements IVendorRepository {
    private JdbcTemplate databaseConnection;

    @Override
    public Vendor create(Vendor vendor) {
        String sql = "INSERT INTO AK171762.VENDOR\n" +
                "VALUES ('"
                + vendor.getName() + "', '"
                + vendor.getType()  + "', '"
                + "');";
        this.databaseConnection.execute(sql);
        return vendor;
    }

    @Override
    public int update(Vendor vendor) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Vendor get(int id) throws Exception {
        return null;
    }

    @Override
    public Vendor getString(String name) throws Exception {
        return null;
    }

    @Override
    public List<Vendor> get() {
        return List.of();
    }


    @Override
    public int update(String type, Vendor vendor) {
        return 0;
    }

    public int update(String name, String type, Vendor vendor){
        String sql = "UPDATE AK171762.VENDOR SET name = '" + vendor.getName() + "',"
                + "Type  = '" + vendor.getType() + "',"
                +
                "WHERE Vendor = '" + name + "' AND Type = '" + type + "';";
        int rows = this.databaseConnection.update(sql);
        return rows;
    }

    @Override
    public boolean delete(String name) {
        return false;
    }

    public boolean delete(String name, String type){
        String sql = "DELETE FROM AK171762.VENDOR" +
                "WHERE Vendor = '" + name + "' AND Type = '" + type + "';";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public List<Vendor> getName(String name) {
        String sql = "SELECT * FROM AK171762.VENDOR WHERE Name = '" + name + "';";
        List<Vendor> names = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Vendor.class));
        return names;
    }

    @Override
    public List<Vendor> getAllNames() {
        String sql = "SELECT * FROM AK171762.VENDOR;";
        List<Vendor> names = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Vendor.class));
        return names;
    }

    @Override
    public List<Vendor> getType(String type) {
        String sql = "SELECT * FROM AK171762.VENDOR WHERE Type = '" + type + "';";
        List<Vendor> types = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Vendor.class));
        return types;
    }

    public List<Vendor> getAllTypes() {
        String sql = "SELECT * FROM AK171762.VENDOR ;";
        List<Vendor> types = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Vendor.class));
        return types;
    }

    @Override
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
}

