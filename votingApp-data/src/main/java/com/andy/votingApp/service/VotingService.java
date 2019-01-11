package com.andy.votingApp.service;

import com.andy.votingApp.model.Voting;

import java.util.Set;

public interface VotingService {
    Set<Voting> findAll();
    Long save(Voting voting);
}
