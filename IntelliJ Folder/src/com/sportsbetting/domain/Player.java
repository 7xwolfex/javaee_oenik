package com.sportsbetting.domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Player extends User{
    String name;
    Integer accountNumber;
    BigDecimal balance;
    LocalDate birth;
    Currency currency;

    public Player(String name, Integer accountNumber, BigDecimal balance, LocalDate birth, Currency currency) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.birth = birth;
        this.currency = currency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb
                .append("Name: ").append(name + System.lineSeparator())
                .append("Birth date: ").append(birth + System.lineSeparator())
                .append("Account number: ").append(accountNumber + System.lineSeparator())
                .append("Balance: ")
                .append(NumberFormat.getNumberInstance(Locale.FRENCH).format(balance) + " ")
                .append(currency.name())
                .append(System.lineSeparator())
                .toString();
    }

    public String getName() {
        return name;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Currency getCurrency() {
        return currency;
    }
}
