package org.example;

import org.example.beans.BasketBallCoach;
import org.example.beans.CricketCoach;
import org.example.beans.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;


public class App 
{
    public static void main( String[] args )
    {
        Logger logger= Logger.getLogger("org.example.App");
        try {
            logger.log(Level.INFO,"Before context");
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach cricketCoach = context.getBean("theCricketCoach", CricketCoach.class);
            logger.log(Level.INFO,"Going  to get the input from Cricket Coach");
            logger.log(Level.INFO,"Your daily Work out =" + cricketCoach.getDailyWorkout());
            logger.log(Level.INFO,"Your daily Luck=" + cricketCoach.getDailyFortune());
            logger.log(Level.INFO,"Done");
            logger.log(Level.INFO,"Going  to get the input from BasketBall Coach");
            Coach basketCoach = context.getBean("theBasketBallCoach", BasketBallCoach.class);
            logger.log(Level.INFO,"Going  to get the input");
            logger.log(Level.INFO,"Your daily Work out =" + basketCoach.getDailyWorkout());
            logger.log(Level.INFO,"Your daily Luck=" + basketCoach.getDailyFortune());
            logger.log(Level.INFO,"Done");
        }catch(Exception e){
            logger.log(Level.WARNING ,e.getMessage());

        }
    }
}
