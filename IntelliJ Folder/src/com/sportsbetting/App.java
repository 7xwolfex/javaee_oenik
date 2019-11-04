package com.sportsbetting;

import com.sportsbetting.builders.PlayerBuilder;
import com.sportsbetting.domain.Currency;
import com.sportsbetting.domain.Player;/////////////////////////////
import com.sportsbetting.service.SportsBettingService;
import com.sportsbetting.view.View;

import java.math.BigDecimal;
import java.time.LocalDate;

public class App {
    SportsBettingService sportsBettingService;
    View view;

    public App(SportsBettingService sportsBettingService, View view) {
        this.sportsBettingService = sportsBettingService;
        this.view = view;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!\nYour new players are:");
        createPlayer();
    }

    public void play(){}
    public static void createPlayer(){
        PlayerBuilder PB = new PlayerBuilder();
        Player myPlayer = PB
                .SetName("Joe")
                .SetAccountNumber(453234)
                .SetBalance(BigDecimal.valueOf(100_000))
                .SetBirth(LocalDate.of(1998,1,21))
                .SetCurrency(Currency.HUF)
                .GetPlayer();
        StringBuilder sb = new StringBuilder();
        sb.append(PB.toString()).append(System.lineSeparator());
        PB.Reset();
        sb.append(PB.toString());
        System.out.println(sb.toString());
    }
    public void doBetting(){}
    public void calculateResults(){}
    public void printResults(){}
}
