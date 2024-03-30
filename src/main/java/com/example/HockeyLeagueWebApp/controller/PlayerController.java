//package com.example.HockeyLeagueWebApp.controller;
//
//import com.example.HockeyLeagueWebApp.model.Player;
//import com.example.hockeyleaguewebapp.service.PlayerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/player")
//public class PlayerController {
//
//    @Autowired
//    private PlayerService playerService;
//
//    @GetMapping("/list")
//    public String listPlayers(Model model) {
//        List<Player> players = playerService.getAllPlayers();
//        model.addAttribute("players", players);
//        return "player/list";
//    }
//
//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("player", new Player());
//        return "player/add-form";
//    }
//
//    @PostMapping("/add")
//    public String addPlayer(@ModelAttribute("player") Player player) {
//        playerService.addPlayer(player);
//        return "redirect:/player/list";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable("id") int id, Model model) {
//        Player player = playerService.getPlayerById(id);
//        model.addAttribute("player", player);
//        return "player/edit-form";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String updatePlayer(@PathVariable("id") int id, @ModelAttribute("player") Player player) {
//        player.setId(id);
//        playerService.updatePlayer(player);
//        return "redirect:/player/list";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deletePlayer(@PathVariable("id") int id) {
//        playerService.deletePlayer(id);
//        return "redirect:/player/list";
//    }
//}
//
//package com.example.HockeyLeagueWebApp.controller;
//
//import com.example.HockeyLeagueWebApp.model.Player;
//import com.example.HockeyLeagueWebApp.service.PlayerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/player")
//public class PlayerController {
//
//    @Autowired
//    private PlayerService playerService;
//
//    @GetMapping("/list")
//    public String listPlayers(Model model) {
//        List<Player> players = playerService.getAllPlayers();
//        model.addAttribute("players", players);
//        return "player/list";
//    }
//
//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("player", new Player());
//        return "player/addPlayer";
//    }
//
//    @PostMapping("/add")
//    public String addPlayer(@ModelAttribute("player") Player player) {
//        playerService.addPlayer(player);
//        return "redirect:/player/list";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable("id") int id, Model model) {
//        Player player = playerService.getPlayerById(id);
//        model.addAttribute("player", player);
//        return "player/editPlayer";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String updatePlayer(@PathVariable("id") int id, @ModelAttribute("player") Player player) {
//        player.setId(id);
//        playerService.updatePlayer(player);
//        return "redirect:/player/list";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deletePlayer(@PathVariable("id") int id) {
//        playerService.deletePlayer(id);
//        return "redirect:/player/list";
//    }
//}
package com.example.HockeyLeagueWebApp.controller;

import com.example.HockeyLeagueWebApp.model.Player;
import com.example.HockeyLeagueWebApp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/chooseTeam")
    public String chooseTeam(@RequestParam("team") int team, Model model) {
        // Retrieve team players dynamically
        model.addAttribute("team", team);
        model.addAttribute("players", playerRepository.findByTeamId(team));
        return "teamList";
    }

    @GetMapping("/getAllPlayers")
    public String getAllPlayers(Model model) {
        model.addAttribute("player", new Player());
        return "addPlayer";
    }

    @PostMapping("/savePlayer")
    public String savePlayer(@ModelAttribute Player player) {
        playerRepository.save(player);
        return "redirect:/chooseTeam?team=" + player.getTeamId();
    }

    @GetMapping("/editPlayer/{id}")
    public String editPlayer(@PathVariable int id, Model model) {
        Player player = playerRepository.findById(id).orElse(null);
        model.addAttribute("player", player);
        return "editPlayer";
    }

    @PostMapping("/updatePlayer")
    public String updatePlayer(@ModelAttribute Player player) {
        playerRepository.save(player);
        return "redirect:/chooseTeam?team=" + player.getTeamId();
    }

    @GetMapping("/deletePlayer/{id}")
    public String showDeleteConfirmation(@PathVariable int id, Model model) {
        Player player = playerRepository.findById(id).orElse(null);
        model.addAttribute("player", player);
        return "deletePlayer";
    }

    @PostMapping("/deletePlayerConfirmed")
    public String deletePlayerConfirmed(@RequestParam("id") int id) {
        Player player = playerRepository.findById(id).orElse(null);
        if (player != null) {
            int team = player.getTeamId();
            playerRepository.deleteById(id);
            return "redirect:/chooseTeam?team=" + team;
        }
        return "redirect:/getAllPlayers";
    }
}
