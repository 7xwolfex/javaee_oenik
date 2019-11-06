package com.sportsbetting.view;

import com.sportsbetting.builders.PlayerBuilder;
import com.sportsbetting.domain.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class View {
    public Player readPlayerData(){//this is where the user inputs the info into the console, then returns a myPlayer
        //into createPlayer, in which it is returned to savePlayer(Player):void (which save into a file maybe?)
        PlayerBuilder PB = new PlayerBuilder();
        Player myPlayer = PB
                .SetName("Joe")
                .SetAccountNumber(453234)
                .SetBalance(BigDecimal.valueOf(100_000))
                .SetBirth(LocalDate.of(1998,1,21))
                .SetCurrency(Currency.HUF)
                .GetPlayer();
        return myPlayer;
    }
    public void printWelcomeMessage(Player player) {
        StringBuilder SB = new StringBuilder();
        SB.append("Welcome ").append(player.getName()).append(" !");
        System.out.println(SB.toString());
    }
    public void printBalance(Player player){
        StringBuilder SB = new StringBuilder();
        SB.append("Your balance is ")
                .append(NumberFormat.getNumberInstance(Locale.FRENCH).format(player.getBalance())).append(" "+ player.getCurrency());
        System.out.println(SB.toString());
    }
    public void printOutcomeOdds(List<SportEvent> sportEventList){
        int i = 0;
        for (SportEvent event : sportEventList){
            i++;
        }
    }
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
