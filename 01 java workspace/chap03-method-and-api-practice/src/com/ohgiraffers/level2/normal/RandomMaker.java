package com.ohgiraffers.level2.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        Random random = new Random();
        int randomCount = ((max-min)+1);
        int random1 = random.nextInt(randomCount) + min;

        return random1;
    }
//    public static String randomUpperAlpabet(int length) {
//
//    }
//    public static String rockPaperScissors() {
//
//    }
//    public static String tossCoin() {
//
//    }
}
