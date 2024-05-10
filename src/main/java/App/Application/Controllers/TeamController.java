package App.Application.Controllers;

import java.util.List;

import App.Domain.PlayerName;
import App.Domain.Team;
import App.Infrastructure.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/Team")

public class TeamController {

        @Autowired
        private JdbcTemplate databaseConnection;

        private TeamRepository teamRepository;

        public TeamController(){
            this.teamRepository = new TeamRepository();
        }

        @GetMapping("/")
        @ResponseStatus(HttpStatus.OK)
        public List<Team> get(){
            this.teamRepository.setDatabaseConnection(this.databaseConnection);
            return this.teamRepository.get();
        }

        @GetMapping("/{name}")
        @ResponseStatus(HttpStatus.OK)
        public List<Team> get(@PathVariable("name") String name) {
            this.teamRepository.setDatabaseConnection(this.databaseConnection);
            return this.teamRepository.get(name);
        }
    }

