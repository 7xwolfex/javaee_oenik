package com.sportsbetting.domain;

import java.time.LocalDateTime;
import java.util.List;

public class SportEvent {
    String title;
    LocalDateTime startDate, endDate;
    Result result;
    List<Bet> bets;

    public SportEvent(String title, LocalDateTime startDate, LocalDateTime endDate, Result result, List<Bet> bets) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.result = result;
        this.bets = bets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(title + " ")
                .append("From: "+startDate+" ")
                .append("To: "+endDate + " " )
                .append("Result: "+result + " ")
                .append("Bets: "+bets+"\n\n");
        return sb.toString();
    }
}
