package com.andy.votingApp.controller;

import com.andy.votingApp.service.VotingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VotingController {

    private final VotingService votingService;

    public VotingController(VotingService votingService) {
        this.votingService = votingService;
    }

    @RequestMapping({"/", "/index"})
    public String votingIndex(Model model) {
        model.addAttribute("votings", votingService.findAll());
        return "index";
    }

    @RequestMapping("createVoting")
    public String createVoting() {
        return "voting";
    }

    @RequestMapping("startVoting")
    public String startVoting() {
        return "votingPage";
    }

    @RequestMapping("closeVoting")
    public String closeVoting() {
        return "index";
    }
}
