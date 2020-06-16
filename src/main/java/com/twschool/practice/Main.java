package com.twschool.practice;

import java.util.List;

public class Main implements GuessInputConstant {
    public static void main(String[] args) throws Exception {
        String output = "";
        String result = "";
        String strCheckInput = "";
        String strCountGuess = "";
        List<Integer> gameAnswer = GenerateGameAnswer.GenerateNum();
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            strCheckInput = CheckInputFormat.checkInput(input);
            if(INPUT_NORMAL.equals(strCheckInput)) {
                String[] inputs = input.trim().split(" ");
                strCountGuess = CountGuessResult.CountResult(inputs, gameAnswer);
                result = strCountGuess;
            }else {
                result = strCheckInput;
            }
            output =output + input + " " +result + "\r\n";
            System.out.println(output.substring(0,output.length()-2));
        }
    }
}
