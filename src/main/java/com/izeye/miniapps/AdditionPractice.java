package com.izeye.miniapps;

import com.izeye.miniapps.util.RandomUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Application for practicing addition.
 *
 * @author Johnny Lim
 */
public class AdditionPractice {

    private static final int NUMBER_OF_QUESTIONS = 10;

    public static void main(String[] args) {
        List<String> questions = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = RandomUtils.generateNumber(100, 999);
            int number2 = RandomUtils.generateNumber(1000, 9999);
            questions.add(number1 + " + " + number2 + " = ");
            answers.add(number1 + number2);
        }

        System.out.println("Questions");
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println((i + 1) + ": " + questions.get(i));
        }
        System.out.println();

        System.out.println("Answers");
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println((i + 1) + ": " + questions.get(i) + answers.get(i));
        }
    }

}
