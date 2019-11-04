package com.sportsbetting.builders;

import com.sportsbetting.domain.Currency;
import com.sportsbetting.domain.Player;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PlayerBuilder {
    String name = "NAME_NOT_SET";
    Integer accountNumber = Integer.MIN_VALUE;
    BigDecimal balance = BigDecimal.valueOf(Long.MIN_VALUE);
    LocalDate birth = LocalDate.MIN;
    Currency currency = Currency.EUR;

    public PlayerBuilder SetName(String name){
        this.name = name;
        return this;
    }

    public PlayerBuilder SetAccountNumber(Integer accountNumber){
        this.accountNumber = accountNumber;
        return this;
    }

    public PlayerBuilder SetBalance(BigDecimal balance){
        this.balance = balance;
        return this;
    }
    public PlayerBuilder SetBirth(LocalDate birth){
        this.birth = birth;
        return this;
    }
    public PlayerBuilder SetCurrency(Currency currency){
        this.currency = currency;
        return this;
    }

    public Player GetPlayer(){
        return new Player(name, accountNumber, balance, birth, currency);
    }

    public PlayerBuilder Reset(){
        name = "NAME_NOT_SET";
        accountNumber = Integer.MIN_VALUE;
        balance = BigDecimal.valueOf(Long.MIN_VALUE);
        birth = LocalDate.MIN;
        currency = Currency.EUR;
        return this;
    }

    @Override
    public String toString() {
        return new Player(name, accountNumber, balance, birth, currency).toString();
    }
}

