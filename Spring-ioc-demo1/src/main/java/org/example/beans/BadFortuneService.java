package org.example.beans;

public class BadFortuneService implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "Be aware of your friends today.";
    }
}
