package com.sportsbetting.domain;

public class Outcome {
    String description;
    Bet bet;

    public Outcome(String description, Bet bet) {
        this.description = description;
        this.bet = bet;
    }
}
