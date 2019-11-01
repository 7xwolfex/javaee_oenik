package com.sportsbetting.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Wager {
    BigDecimal amount;
    LocalDateTime timestampCreated;
    boolean processed, win;

    OutcomeOdd odd;
    Player player;
    Currency currency;
}
