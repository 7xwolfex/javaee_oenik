package com.sportsbetting.domain;

import java.time.LocalDateTime;
import java.util.List;

public class SportEvent {
    String title;
    LocalDateTime startDate, endDate;
    Result result;
    List<Bet> bets;

}
