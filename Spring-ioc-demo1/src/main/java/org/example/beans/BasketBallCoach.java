package org.example.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BasketBallCoach implements Coach{
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout(){
        return "Jump  for 1 hour.";
    }
    @Override
    public String getDailyFortune(){
        return fortuneService.getDailyFortune();
    }
}
