package com.icarros;

import com.icarros.questao2.Marvin;
import com.icarros.questao3.CreepyHour;
import com.icarros.questao4.WeAreTheChampions;

import static com.icarros.questao1.FizzBuzz.checkIfIsMultiple;

public class Main {

    public static void main(String[] args) {
//        FizzBuzz Question1
        System.out.println("-------------Question 1-----------------");
        for (int i = 0; i <=100; i++) {
            String value = checkIfIsMultiple(i);
            System.out.println(value);
        }

        System.out.println("--------------Question 2-----------------");
        // Marvin Question2
        Marvin question2 = new Marvin();
        String[] phases = {"*--", "*-*", "***","---","--*"};
        int allStars = question2.marvinStars(phases);
        System.out.println(allStars);
        System.out.println("--------------Question 3----------------");

        // CreepyHour

        CreepyHour creepyHour = new CreepyHour();
        String[] moments = {"11:00","13:13","10:00","00:00", "11:12", "11:11"};
        int hours =  creepyHour.creepyHourTotal(moments);
        System.out.println(hours);
        System.out.println("-------------Question 5-----------------");

        // We are the champions
        int[] wins = {1,0,3}, ties = {2, 2, 0};
        WeAreTheChampions weAreTheChampions = new WeAreTheChampions();
        int winner = weAreTheChampions.getWinnerTeam(wins, ties);
        System.out.println("The winning time was: "+ winner);
        System.out.println("---------------------------------------");
    }

}
