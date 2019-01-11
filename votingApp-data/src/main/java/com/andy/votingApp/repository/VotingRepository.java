package com.andy.votingApp.repository;

import com.andy.votingApp.model.Voting;
import org.springframework.data.repository.CrudRepository;

public interface VotingRepository extends CrudRepository<Voting, Long> {
}
