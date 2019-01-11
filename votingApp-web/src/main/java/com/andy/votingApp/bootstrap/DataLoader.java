package com.andy.votingApp.bootstrap;

import com.andy.votingApp.model.Voting;
import com.andy.votingApp.service.VotingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VotingService votingService;

    public DataLoader(VotingService votingService) {
        this.votingService = votingService;
    }

    @Override
    public void run(String... args) {
        int count = votingService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        Voting voting = new Voting();
        voting.setVotingObject("first");
        voting.setAfter(0L);
        voting.setAgainst(0L);
        voting.setReference("/voting/1");
        votingService.save(voting);

        Voting voting1 = new Voting();
        voting1.setVotingObject("second");
        voting1.setAfter(0L);
        voting1.setAgainst(0L);
        voting1.setReference("/voting/2");
        votingService.save(voting1);

        Voting voting2 = new Voting();
        voting2.setVotingObject("third");
        voting2.setAfter(0L);
        voting2.setAgainst(0L);
        voting2.setReference("/voting/3");
        votingService.save(voting2);

    }
}
