package com.icarros.questao3;

public class CreepyHour {

    public int creepyHourTotal(String[] moments){
        int count = 0;
        for (String moment : moments) {
            count += verifyCreepyHourExist(moment.toCharArray());
        }
        return count;
    }

    protected int verifyCreepyHourExist(char[] value){
        if ((value[0] == value[3]) && (value[1] == value[4]) )
            return 1;
        else if((value[0] == value[1]) && (value[3] == value[4]))
            return 1;
        else if((value[0] == value[4]) && (value[1] == value[3]))
            return 1;
        else
            return 0;
    }
}
