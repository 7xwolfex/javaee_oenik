package com.sportsbetting.domain;
import java.util.ArrayList;
import java.util.List;

public class Result {// a result is just a list of outcomes
    List<Outcome> winnerOutcomes = new ArrayList<>();

    public List<Outcome> getWinnerOutcomes() {
        return winnerOutcomes;
    }

    public void setWinnerOutcomes(List<Outcome> winnerOutcomes) {
        this.winnerOutcomes = winnerOutcomes;
    }

    public Result(List<Outcome> winnerOutcomes) {
        this.winnerOutcomes = winnerOutcomes;
    }

    @Override
    public String toString() {
        return winnerOutcomes.toString();
    }
}
