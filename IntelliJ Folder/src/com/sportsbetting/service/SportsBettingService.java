package com.sportsbetting.service;

import com.sportsbetting.builders.PlayerBuilder;
import com.sportsbetting.builders.SportEventBuilder;
import com.sportsbetting.domain.Player;
import com.sportsbetting.domain.Result;
import com.sportsbetting.domain.SportEvent;
import com.sportsbetting.domain.Wager;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SportsBettingService {
    public void savePlayer(Player player){
        //saved into a LIST
    }

    public Player findPlayer(){
        PlayerBuilder PB = new PlayerBuilder();
        return PB.GetPlayer();//finds the player in the LIST
    }

    public List<SportEvent> findAllSportEvents(){
        List<SportEvent> sportEvents = new ArrayList<>();
        String[] teams = {"Barcelona", "Arsenal", "Chelsea", "Real Madrid"};
        Random r = new Random();

        for (int i=0; i<4; i++) {
            SportEventBuilder seb = new SportEventBuilder();
            StringBuilder sb = new StringBuilder();
            int team1=-1 , team2 = -1;

            do{
                team1 = r.nextInt(4);
                team2 = r.nextInt(4);
            }while (team1 == team2);//finds two teams that are not the same

            sb.append(teams[team1]).append(" - ").append(teams[team2]);//creates a "TEAM1 - TEAM2" title

            seb
                    .SetTitle(sb.toString())
                    .SetBets(new ArrayList<>())
                    .SetEndDateTime(LocalDateTime.now().plusDays(1).plusHours(2))
                    .SetResult(new Result(new ArrayList<>()))
                    .SetStartDateTime(LocalDateTime.now().plusDays(1));//builds a single sport event

            sportEvents.add(seb.GetSportEvent());
        }
        return sportEvents;
    }

    public void saveWager(Wager wager){
        //saves into a LIST
    }

    public List<Wager> findAllWagers(){
        return new ArrayList<>();
    }

    public void calculateResults(){

    }
}
