package com.icarros.questao1;

public class FizzBuzz {

    public static String checkIfIsMultiple(int value){
        if (value% 3 == 0 && value % 5 == 0){
            return "FizzBuzz";
        }
        else if (value % 3 == 0){
            return "Fizz";
        }
        else if(value % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(value);
    }
}
