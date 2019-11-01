package com.sportsbetting.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Player extends User{
    String name;
    Integer accountNumber;
    BigDecimal balance;
    LocalDate birth;
    Currency currency;
}
