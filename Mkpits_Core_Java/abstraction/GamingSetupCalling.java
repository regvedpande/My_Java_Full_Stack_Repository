package com.mkpits.abstraction;

public class GamingSetupCalling {
    public static void main(String[] args) {
        GamingSetup gamingSetup = new GamingConsole();
        gamingSetup.powerOn();
        gamingSetup.playGame();
        gamingSetup.powerOff();

        DisplayDevice displayDevice = new GamingMonitor();
        displayDevice.displayContent("Welcome to the game!");

        InputDevice inputDevice = new GamingController();
        inputDevice.getUserInput();
    }
}
