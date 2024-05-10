package App.Application.Controllers;

import App.Domain.Vendor;
import App.Infrastructure.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/Vendor")

public class VendorController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private VendorRepository vendorRepository;

    public VendorController(){
        this.vendorRepository = new VendorRepository();
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Vendor> get(){
        this.vendorRepository.setDatabaseConnection(this.databaseConnection);
        return this.vendorRepository.get();
    }

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Vendor> get(@PathVariable("name") String name) {
        this.vendorRepository.setDatabaseConnection(this.databaseConnection);
        return this.vendorRepository.getName(name);
    }
}

