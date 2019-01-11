package com.andy.votingApp.model;

import javax.persistence.*;

@Entity
@Table(name = "voting")
public class Voting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "voting_object")
    private String votingObject;

    @Column(name = "reference")
    private String reference;

    @Column(name = "after")
    private Long after;

    @Column(name = "against")
    private Long against;

    public Long getId() {
        return id;
    }

    public String getVotingObject() {
        return votingObject;
    }

    public void setVotingObject(String votingObject) {
        this.votingObject = votingObject;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getAfter() {
        return after;
    }

    public void setAfter(Long after) {
        this.after = after;
    }

    public Long getAgainst() {
        return against;
    }

    public void setAgainst(Long against) {
        this.against = against;
    }
}
