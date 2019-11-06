package com.sportsbetting.builders;

import com.sportsbetting.domain.Bet;
import com.sportsbetting.domain.Result;
import com.sportsbetting.domain.SportEvent;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SportEventBuilder {
    String title = "NOT_SET - NOT_SET";
    LocalDateTime startDate, endDate = LocalDateTime.now();
    Result result = new Result(new ArrayList<>());//a result is just the list of outcomes
    List<Bet> bets = new ArrayList<>();

    public SportEvent GetSportEvent(){
        return new SportEvent(title, startDate, endDate, result, bets);
    }

    public SportEventBuilder SetTitle(String title){
        this.title = title;
        return this;
    }
    public SportEventBuilder SetStartDateTime(LocalDateTime startDate){
        this.startDate = startDate;
        return this;
    }
    public SportEventBuilder SetEndDateTime(LocalDateTime endDate){
        this.endDate = endDate;
        return this;
    }

    public SportEventBuilder SetResult(Result result){
        this.result = result;
        return this;
    }

    public SportEventBuilder SetBets(List<Bet> bets){
        this.bets = bets;
        return this;
    }

    public SportEventBuilder Reset(){
        title = "NOT_SET - NOT_SET";
        startDate = endDate = LocalDateTime.now();
        endDate = LocalDateTime.now();
        Result result = new Result(new ArrayList<>());//a result is just the list of outcomes
        bets = new ArrayList<>();
        return this;
    }

    @Override
    public String toString() {
        return new SportEvent(title, startDate, endDate, result, bets).toString();
    }
}
