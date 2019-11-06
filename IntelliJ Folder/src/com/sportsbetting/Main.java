package com.sportsbetting;

import com.sportsbetting.service.SportsBettingService;
import com.sportsbetting.view.View;

public class Main {
    public static void main(String[] args) {
        App app = new App(new SportsBettingService(), new View());
        app.play();
    }
}
