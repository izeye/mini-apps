package com.izeye.miniapps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Application for practicing division.
 *
 * @author Johnny Lim
 */
public class DivisionPractice {

    private static final int NUMBER_OF_QUESTIONS = 10;

    private static final Random random = new Random();

    public static void main(String[] args) {
        List<String> questions = new ArrayList<>();
        List<Integer> quotients = new ArrayList<>();
        List<Integer> remainders = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = generateNumber(100, 999);
            int number2 = generateNumber(10, 99);
            questions.add(number1 + " / " + number2 + " = ");
            quotients.add(number1 / number2);
            remainders.add(number1 % number2);
        }

        System.out.println("Questions");
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println((i + 1) + ": " + questions.get(i));
        }
        System.out.println();

        System.out.println("Answers");
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println((i + 1) + ": " + questions.get(i) + quotients.get(i) + " ... " + remainders.get(i));
        }
    }

    private static int generateNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

}
