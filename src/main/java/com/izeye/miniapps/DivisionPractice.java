package com.izeye.miniapps;

import com.izeye.miniapps.util.RandomUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Application for practicing division.
 *
 * @author Johnny Lim
 */
public class DivisionPractice {

    private static final int NUMBER_OF_QUESTIONS = 10;

    public static void main(String[] args) {
        List<String> questions = new ArrayList<>();
        List<Integer> quotients = new ArrayList<>();
        List<Integer> remainders = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = RandomUtils.generateNumber(100, 999);
            int number2 = RandomUtils.generateNumber(10, 99);
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

}
