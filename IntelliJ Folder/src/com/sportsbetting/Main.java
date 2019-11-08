package com.sportsbetting;

import com.sportsbetting.service.SportsBettingService;
import com.sportsbetting.view.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        App app = new App(new SportsBettingService(), new View());
        app.play();
    }
}
