package com.sportsbetting.view;

import com.sportsbetting.builders.PlayerBuilder;
import com.sportsbetting.domain.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class View {
    public Player readPlayerData() throws IOException {//this is where the user inputs the info into the console, then returns a myPlayer
        //into createPlayer, in which it is returned to savePlayer(Player):void (which save into a file maybe?)

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.print("What is your name?: ");
        String inputName = br.readLine();
        System.out.print("How much is your available balance?: ");
        String inputBalance = br.readLine();
        System.out.print("What currency do you use? (EUR, HUF, USD)?: ");
        String inputCurrencyStr = br.readLine();
        if ( !(    inputCurrencyStr.contains("EUR")
                || inputCurrencyStr.contains("HUF")
                || inputCurrencyStr.contains("USD")) ){
            inputCurrencyStr = "EUR";//if the user chooses an incorrect currency, just default it to EUR
        }

        PlayerBuilder PB = new PlayerBuilder();
        Player myPlayer = PB
                .SetName(inputName)
                .SetAccountNumber(12345)
                .SetBalance(new BigDecimal(inputBalance))
                .SetBirth(LocalDate.of(1998,1,21))
                .SetCurrency(Currency.valueOf(inputCurrencyStr.toUpperCase()))
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
