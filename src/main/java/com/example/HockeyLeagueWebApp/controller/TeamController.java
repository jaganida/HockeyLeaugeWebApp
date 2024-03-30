//package com.example.HockeyLeagueWebApp.controller;
//
//import com.example.HockeyLeagueWebApp.model.Team;
//import com.example.hockeyleaguewebapp.service.TeamService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/team")
//public class TeamController {
//
//    @Autowired
//    private TeamService teamService;
//
//    @GetMapping("/list")
//    public String listTeams(Model model) {
//        List<Team> teams = teamService.getAllTeams();
//        model.addAttribute("teams", teams);
//        return "team/list";
//    }
//
//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("team", new Team());
//        return "team/add-form";
//    }
//
//    @PostMapping("/add")
//    public String addTeam(@ModelAttribute("team") Team team) {
//        teamService.addTeam(team);
//        return "redirect:/team/list";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable("id") int id, Model model) {
//        Team team = teamService.getTeamById(id);
//        model.addAttribute("team", team);
//        return "team/edit-form";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String updateTeam(@PathVariable("id") int id, @ModelAttribute("team") Team team) {
//        team.setId(id);
//        teamService.updateTeam(team);
//        return "redirect:/team/list";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteTeam(@PathVariable("id") int id) {
//        teamService.deleteTeam(id);
//        return "redirect:/team/list";
//    }
//}
//package com.example.HockeyLeagueWebApp.controller;
//
//import com.example.HockeyLeagueWebApp.model.Team;
//import com.example.HockeyLeagueWebApp.repository.TeamRepository;
//import com.example.HockeyLeagueWebApp.service.TeamService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;

//@Controller
//@RequestMapping("/team")
//public class TeamController {
//
//    @Autowired
//    private TeamService teamService;
//
//    @GetMapping("/teamList")
//    public String teamList(Model model) {
//        List<Team> teams = teamService.getAllTeams();
//        model.addAttribute("teams", teams);
//        return "teamList";
//    }
//
//    @GetMapping("/teams/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("team", new Team());
//        return "addTeam";
//    }
//
//    @PostMapping("/teams/add")
//    public String addTeam(@ModelAttribute("team") Team team) {
//        teamService.addTeam(team);
//        return "redirect:/teamList";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable("id") int id, Model model) {
//        Team team = teamService.getTeamById(id);
//        model.addAttribute("team", team);
//        return "editTeam";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String updateTeam(@PathVariable("id") int id, @ModelAttribute("team") Team team) {
//        team.setId(id);
//        teamService.updateTeam(team);
//        return "redirect:/teamList";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteTeam(@PathVariable("id") int id) {
//        teamService.deleteTeam(id);
//        return "redirect:/teamList";
//    }
//}
//@Controller
//@RequestMapping("/team")
//public class TeamController {
//
//    @Autowired
//    private TeamService teamService;
//
//    @GetMapping("/list")
//    public String teamList(Model model) {
//        List<Team> teams = teamService.getAllTeams();
//        model.addAttribute("teams", teams);
//        return "teamList";
//    }
//
//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("team", new Team());
//        return "addTeam";
//    }
//
//    @PostMapping("/add")
//    public String addTeam(@ModelAttribute("team") Team team) {
//        teamService.addTeam(team);
//        return "redirect:/teams/list"; // Redirect to /teams/list
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable("id") int id, Model model) {
//        Team team = teamService.getTeamById(id);
//        model.addAttribute("team", team);
//        return "editTeam";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String updateTeam(@PathVariable("id") int id, @ModelAttribute("team") Team team) {
//        team.setId(id);
//        teamService.updateTeam(team);
//        return "redirect:/list"; // Redirect to /teams/list
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteTeam(@PathVariable("id") int id) {
//        teamService.deleteTeam(id);
//        return "redirect:/list"; // Redirect to /teams/list
//    }
//
//    @GetMapping("/{id}")
//    public String viewTeam(@PathVariable("id") int id, Model model) {
//        Team team = teamService.getTeamById(id);
//        model.addAttribute("team", team);
//        return "viewTeam";
//    }
//}

//package com.example.HockeyLeagueWebApp.controller;
//
//import com.example.HockeyLeagueWebApp.model.Team;
//import com.example.HockeyLeagueWebApp.service.TeamService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/team")
//public class TeamController {
//
//    @Autowired
//    private TeamService teamService;
//
//    @GetMapping("/list")
//    public String teamList(Model model) {
//        List<Team> teams = teamService.getAllTeams();
//        model.addAttribute("teams", teams);
//        return "team/teamList";
//    }
//
//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("team", new Team());
//        return "team/addTeam";
//    }
//
//    @PostMapping("/add")
//    public String addTeam(@ModelAttribute("team") Team team) {
//        teamService.addTeam(team);
//        return "redirect:/team/list";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable("id") int id, Model model) {
//        Team team = teamService.getTeamById(id);
//        model.addAttribute("team", team);
//        return "team/editTeam";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String updateTeam(@PathVariable("id") int id, @ModelAttribute("team") Team team) {
//        team.setId(id);
//        teamService.updateTeam(team);
//        return "redirect:/team/list";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteTeam(@PathVariable("id") int id) {
//        teamService.deleteTeam(id);
//        return "redirect:/team/list";
//    }
//
//    @GetMapping("/{id}")
//    public String viewTeam(@PathVariable("id") int id, Model model) {
//        Team team = teamService.getTeamById(id);
//        model.addAttribute("team", team);
//        return "team/viewTeam";
//    }
//}

package com.example.HockeyLeagueWebApp.controller;

import com.example.HockeyLeagueWebApp.model.Team;
import com.example.HockeyLeagueWebApp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/getTeamList")
    public String getTeamList(Model model) {
        // Retrieve all teams dynamically
        model.addAttribute("teams", teamRepository.findAll());
        return "teamList";
    }

    @GetMapping("/addTeamForm")
    public String addTeamForm(Model model) {
        model.addAttribute("team", new Team());
        return "/addTeam";
    }

    @PostMapping("/addTeam")
    public String addTeam(@ModelAttribute Team team) {
        teamRepository.save(team);
        return "redirect:/getTeamList";
    }
}
