package com.icarros.questao4;

public class WeAreTheChampions {



    public int getWinnerTeam(int [] wins, int[] ties){
        int winner = 0;
        int index = 0;
        for (int i = 0; i < wins.length; i++) {
            if (totalPoints(wins[i], ties[i]) > winner){
                winner = totalPoints(wins[i], ties[i]);
                index = i;
            }
        }
        return index;
    }

    protected int totalPoints(int win, int ties){
        return (win * 3) + ties;
    }
}
