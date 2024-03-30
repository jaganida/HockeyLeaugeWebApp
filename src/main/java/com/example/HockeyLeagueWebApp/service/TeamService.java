package com.example.HockeyLeagueWebApp.service;

import com.example.HockeyLeagueWebApp.model.Team;
import com.example.HockeyLeagueWebApp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return (List<Team>) teamRepository.findAll();
    }

    public Team getTeamById(int id) {
        return teamRepository.findById(id).orElse(null);
    }

    public void addTeam(Team team) {
        teamRepository.save(team);
    }

    public void updateTeam(Team team) {
        teamRepository.save(team);
    }

    public void deleteTeam(int id) {
        teamRepository.deleteById(id);
    }
}
