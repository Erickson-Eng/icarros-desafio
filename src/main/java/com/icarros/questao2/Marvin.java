package com.icarros.questao2;

public class Marvin {

    public int marvinStars(String[] phaseVector){
        int allPhaseStars = 0;
        char search = '*';
        for (String s : phaseVector) {
            allPhaseStars += characterCounter(s, search);
        }
        return allPhaseStars;
    }

    protected int characterCounter(String value, char search){
        int count = 0;
        for (int i = 0; i < value.length() ; i++) {
            if (value.charAt(i) == search){
                count++;
            }
        }
        return count;
    }

}
