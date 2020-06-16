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
                as = as + inputs[i] + "和";
            }else if (gameAnswer.contains(Integer.valueOf(inputs[i]))) {
                b++;
                bs = bs + inputs[i] + "和";
            }//s = s.Substring(0,s.Length - 1)
        }
        if (a == 4) {
            result = "胜利，一切正确";

        }else if (b == 4) {
            result = "4个数字位置错误";
        }else if(a == 0 && b == 0) {
            result = "都错了";
        }else if(a == 0 && b != 0){
            result = bs.substring(0,bs.length() - 1) + "错误的位置";
        }else if (b == 0 && a != 0) {
            result = as.substring(0,as.length() - 1) + "正确";
        }else{
            result = as.substring(0,as.length() - 1) + "正确" + "，" + bs.substring(0,bs.length() - 1) + "错误的位置";
        }
        return a+"A"+b+"B"+" "+result;

    }
}
