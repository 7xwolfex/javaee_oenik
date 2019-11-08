package com.sportsbetting.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
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
        DateTimeFormatterBuilder fm = new DateTimeFormatterBuilder();
        StringBuilder sb = new StringBuilder();
        sb
                .append(title + " ")

                .append("From: "+startDate.toLocalDate()+ " " )
                .append(""+startDate.toLocalTime().withNano(0) + " " )

                .append("To: "+endDate.toLocalDate()+ " " )
                .append(""+endDate.toLocalTime().withNano(0) + " " )

                .append("Result: "+result + " ")
                .append("Bets: "+bets+"\n\n");
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Result getResult() {
        return result;
    }

    public List<Bet> getBets() {
        return bets;
    }
}
