package com.icarros;

import com.icarros.questao2.Marvin;

import static com.icarros.questao1.FizzBuzz.checkIfIsMultiple;

public class Main {

    public static void main(String[] args) {
//        FizzBuzz Question1
        for (int i = 0; i <=100; i++) {
            String value = checkIfIsMultiple(i);
            System.out.println(value);
        }

        // Marvin Question2
        Marvin question2 = new Marvin();
        String[] phases = {"*--", "*-*", "***","---","--*"};
        int allStars = question2.marvinStars(phases);
        System.out.println(allStars);
    }
}
