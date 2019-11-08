package com.sportsbetting;

import com.sportsbetting.domain.Player;
import com.sportsbetting.domain.SportEvent;
import com.sportsbetting.domain.Wager;
import com.sportsbetting.service.SportsBettingService;
import com.sportsbetting.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class App {
    SportsBettingService sportsBettingService;
    View view;

    public App(SportsBettingService sportsBettingService, View view) {
        this.sportsBettingService = sportsBettingService;
        this.view = view;
    }

    public void play() throws IOException {
        createPlayer();
        doBetting();//what do you want to bet on, what amount (can bet on multiple matches)
        calculateResults();
        printResults();
    }

    public void createPlayer() throws IOException {
        Player player = view.readPlayerData();
        view.printWelcomeMessage(player);
        view.printBalance(player);
    }
    public void doBetting() throws IOException {
        System.out.println("Which bet do you want to bet on? (choose a number or type 'Q' to quit) ");
        List<SportEvent> events = sportsBettingService.findAllSportEvents();
        List<Wager> wagers = sportsBettingService.findAllWagers();
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        int i=0;
        for(SportEvent event : events) {
            i++;
            sb
                    .append(i+": ")
                    .append(event.toString());
        }
        sb.append("\nType in the number of your bet: ");
        System.out.print(sb.toString());
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String chosenBetNumberStr = br.readLine();
        int chosenBetNumber = Integer.valueOf(chosenBetNumberStr);
    }
    public void calculateResults(){}
    public void printResults(){}
}
