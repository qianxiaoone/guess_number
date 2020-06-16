package com.twschool.practice;

import java.util.HashSet;

public class CheckInputFormat implements GuessInputConstant{
    public static String checkInput(String input) {
        if (!input.replace(" ", "").matches("[0-9]+")) {
            return "Wrong Input，Input again";
        }
        String[] inputs = input.trim().split(" ");
        if (inputs.length != NUMOFCHARACTER || cheakIsRepeat(inputs)) {
            return "Wrong Input，Input again";
        }
        for (int i = 0; i < inputs.length - 1; i++) {
            for (int j = i + 1; j < inputs.length; j++) {
                if (inputs[i] == inputs[j]) {
                    return "Wrong Input，Input again";
                }
            }
        }
        for (int i = 0; i < inputs.length; i++) {
            if (Integer.parseInt(inputs[0]) < 0 || Integer.parseInt(inputs[0]) > 9) {
                return "Wrong Input，Input again";
            }
        }
        return "input normal";

    }

    public static boolean cheakIsRepeat(String[] array) {
        HashSet<String> hashSet = new HashSet<String>();
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
        if (hashSet.size() == array.length) {
            return false;
        } else {
            return true;
        }
    }
}
