package App.Application.Controllers;

import java.util.List;

import App.Domain.PlayerName;
import App.Domain.WorkTeam;
import App.Infrastructure.WorkTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/WorkTeam")

public class WorkTeamController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private WorkTeamRepository workTeamRepository;

    public WorkTeamController(){
        this.workTeamRepository = new WorkTeamRepository();
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<WorkTeam> get(){
        this.workTeamRepository.setDatabaseConnection(this.databaseConnection);
        return this.workTeamRepository.get();
    }

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<PlayerName> get(@PathVariable("name") String name){
        this.workTeamRepository.setDatabaseConnection(this.databaseConnection);
        return this.workTeamRepository.getName(name);
    }
}

