package com.twschool.practice;

import java.util.List;

public class CountGuessResult {
    public static String CountResult(String[] inputs, List<Integer> gameAnswer) {
        int a = 0;
        int b = 0;
        String as = "";
        String bs = "";
        String result = "";
        for (int i = 0; i < inputs.length; i++) {
            if (gameAnswer.get(i).equals(Integer.valueOf(inputs[i]))) {
                a++;
                as = as + inputs[i] + "and";
            }else if (gameAnswer.contains(Integer.valueOf(inputs[i]))) {
                b++;
                bs = bs + inputs[i] + "and";
            }//s = s.Substring(0,s.Length - 1)
        }
        if (a == 4) {
            result = "win, all correct";

        }else if (b == 4) {
            result = "4 numbers position wrong";
        }else if(a == 0 && b == 0) {
            result = "all wrong";
        }else if(a == 0 && b != 0){
            result = bs.substring(0,bs.length() - 1) + "wrong position";
        }else if (b == 0 && a != 0) {
            result = as.substring(0,as.length() - 1) + "correct";
        }else{
            result = as.substring(0,as.length() - 1) + "correct" + "，" + bs.substring(0,bs.length() - 1) + "wrong position";
        }
        return a+"A"+b+"B"+" "+result;

    }
}
