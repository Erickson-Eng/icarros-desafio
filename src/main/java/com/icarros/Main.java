package com.icarros;

import static com.icarros.questao1.FizzBuzz.checkIfIsMultiple;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <=100; i++) {
            String value = checkIfIsMultiple(i);
            System.out.println(value);
        }
    }
}
