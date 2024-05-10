package App.Application.Controllers;

import java.util.List;

import App.Domain.Prize;
import App.Infrastructure.PrizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/Prize")
public class PrizeController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private PrizeRepository prizeRepository;

    public PrizeController(){
        this.prizeRepository = new PrizeRepository();
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Prize> get(){
        this.prizeRepository.setDatabaseConnection(this.databaseConnection);
        return this.prizeRepository.get();
    }

    @GetMapping("/{medal}")
    @ResponseStatus(HttpStatus.OK)
    public List<Prize> get(@PathVariable("medal") String name) {
        this.prizeRepository.setDatabaseConnection(this.databaseConnection);
        return this.prizeRepository.getString(name);
    }
}


