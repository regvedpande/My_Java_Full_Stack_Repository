package com.mkpits.abstraction;

abstract class GamingSetup {
    abstract void powerOn();
    abstract void powerOff();
    abstract void playGame();
}

class GamingConsole extends GamingSetup {
    @Override
    void powerOn() {
        System.out.println("Gaming console is powered on.");
    }

    @Override
    void powerOff() {
        System.out.println("Gaming console is powered off.");
    }

    @Override
    void playGame() {
        System.out.println("Playing a game on the gaming console.");
    }
}

abstract class DisplayDevice {
    abstract void displayContent(String content);
}

class GamingMonitor extends DisplayDevice {
    @Override
    void displayContent(String content) {
        System.out.println("Displaying on the gaming monitor: " + content);
    }
}

abstract class InputDevice {
    abstract void getUserInput();
}

class GamingController extends InputDevice {
    @Override
    void getUserInput() {
        System.out.println("Receiving input from the gaming controller.");
    }
}

