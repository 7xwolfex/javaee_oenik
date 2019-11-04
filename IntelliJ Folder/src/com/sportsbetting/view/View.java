package com.sportsbetting.view;

import com.sportsbetting.domain.OutcomeOdd;
import com.sportsbetting.domain.Player;
import com.sportsbetting.domain.SportEvent;
import com.sportsbetting.domain.Wager;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigDecimal;
import java.util.List;

public class View {
    public Player readPlayerData(){
        //Player player = new Player();
        throw new NotImplementedException();

    }
    public void printWelcomeMessage(Player player) {}
    public void printBalance(Player player){}
    public void printOutcomeOdds(List<SportEvent> sportEventList){}
    public OutcomeOdd selectOutcomeOdd(List<SportEvent> sportEventList){
        throw new NotImplementedException();
    }
    public BigDecimal readWagerAmount(){
        throw new NotImplementedException();
    }
    public void printWagerSaved(){}
    public void printNotEnoughBalance(Player player){}
    public void printResults(Player player, List<Wager> wagerList){}
}
