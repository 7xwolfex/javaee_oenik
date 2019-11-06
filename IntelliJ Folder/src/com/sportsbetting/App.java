package com.sportsbetting;

import com.sportsbetting.domain.Player;
import com.sportsbetting.domain.SportEvent;
import com.sportsbetting.service.SportsBettingService;
import com.sportsbetting.view.View;

import java.util.List;

public class App {
    SportsBettingService sportsBettingService;
    View view;

    public App(SportsBettingService sportsBettingService, View view) {
        this.sportsBettingService = sportsBettingService;
        this.view = view;
    }

    public void play(){
        createPlayer();
        doBetting();//what do you want to bet on, what amount (can bet on multiple matches)
        calculateResults();
        printResults();
    }

    public void createPlayer(){
        Player player = view.readPlayerData();
        view.printWelcomeMessage(player);
        view.printBalance(player);
    }
    public void doBetting(){
        List<SportEvent> events = sportsBettingService.findAllSportEvents();
        String outputString = events.toString();
        System.out.println(outputString);
    }
    public void calculateResults(){}
    public void printResults(){}
}
