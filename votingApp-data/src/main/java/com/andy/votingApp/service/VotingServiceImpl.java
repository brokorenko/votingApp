package com.andy.votingApp.service;

import com.andy.votingApp.model.Voting;
import com.andy.votingApp.repository.VotingRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VotingServiceImpl implements VotingService {

    private final VotingRepository votingRepository;

    public VotingServiceImpl(VotingRepository votingRepository) {
        this.votingRepository = votingRepository;
    }

    @Override
    public Set<Voting> findAll() {
        Set<Voting> votings = new HashSet<>();
        votingRepository.findAll().forEach(votings::add);
        return votings;
    }

    @Override
    public Long save(Voting voting) {
        return votingRepository.save(voting).getId();
    }
}
