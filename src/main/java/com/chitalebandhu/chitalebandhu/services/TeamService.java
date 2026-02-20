package com.chitalebandhu.chitalebandhu.services;

import com.chitalebandhu.chitalebandhu.entity.Team;
import com.chitalebandhu.chitalebandhu.repository.TeamRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeam(){
        return teamRepository.findAll();
    }

    public void addTeam(Team team){
        teamRepository.save(team);
    }

    public void deleteTeam(String teamId){
        teamRepository.deleteById(teamId);
    }

    public Team updateTeam(String teamId, Team newTeam){
        Optional<Team> existingTeam = teamRepository.findById(teamId);

        if(existingTeam.isEmpty()){
            return null;
        }

        if(newTeam.getName() != null && !newTeam.getName().trim().isEmpty()){
            existingTeam.get().setName(newTeam.getName());
        }

        if(newTeam.getTeamMember() != null){
            existingTeam.get().setTeamMember(newTeam.getTeamMember());
        }

        return teamRepository.save(existingTeam.get());
    }
}
