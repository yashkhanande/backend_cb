package com.chitalebandhu.chitalebandhu.controller;

import com.chitalebandhu.chitalebandhu.entity.Team;
import com.chitalebandhu.chitalebandhu.services.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("team")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("all")
    public List<Team> getAllTeam(){
        return teamService.getAllTeam();
    }

    @PostMapping("add")
    public void addTeam(@RequestBody Team team){
        teamService.addTeam(team);
    }

    @PutMapping("update/{teamId}")
    public ResponseEntity<Team> updateTeam(@PathVariable String teamId, @RequestBody Team newTeam){
        Team team = teamService.updateTeam(teamId, newTeam);
        if(team != null){
            return new ResponseEntity<>(team, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
