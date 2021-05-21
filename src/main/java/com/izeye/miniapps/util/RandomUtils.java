package com.izeye.miniapps.util;

import java.util.Random;

/**
 * Utilities for random generation.
 *
 * @author Johnny Lim
 */
public final class RandomUtils {

    private static final Random random = new Random();

    public static int generateNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

}
