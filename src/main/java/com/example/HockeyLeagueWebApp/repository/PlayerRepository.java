/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.HockeyLeagueWebApp.repository;

import com.example.HockeyLeagueWebApp.model.Player;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Darshan
 */

public interface PlayerRepository extends
        CrudRepository<Player, Integer> {
    
    List<Player> findByTeamId(int team);

}
