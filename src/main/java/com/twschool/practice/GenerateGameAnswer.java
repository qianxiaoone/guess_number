package com.twschool.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateGameAnswer implements GuessInputConstant {
    public static List<Integer> GenerateNum() {
        List<Integer> result = new ArrayList<Integer>();
        int num = new Random().nextInt(10);
        result.add(num);
        for (int i = 0; i < NUMOFCHARACTER - 1; i++) {
            while (true) {
                num = new Random().nextInt(10);
                if (!result.contains(num)) {
                    result.add(num);
                    break;
                }
            }
        }
        return result;
    }
}
