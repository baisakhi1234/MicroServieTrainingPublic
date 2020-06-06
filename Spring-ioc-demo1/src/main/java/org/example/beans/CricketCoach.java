package org.example.beans;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout(){
        return "Run 5 Km.";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getDailyFortune();
    }
}
