package com.sportsbetting.domain;

import java.time.LocalDateTime;
import java.util.List;

public class TennisSportEvent extends SportEvent {
    public TennisSportEvent(String title, LocalDateTime startDate, LocalDateTime endDate, Result result, List<Bet> bets) {
        super(title, startDate, endDate, result, bets);
    }
}
