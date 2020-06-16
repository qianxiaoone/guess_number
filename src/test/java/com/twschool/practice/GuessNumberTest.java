package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GuessNumberTest {
    @Test
    public void should_return_true_when_CheckInputFormat_then_input_1234(){
        //given
        String input = "1 2 3 4";
        //when
        String output = CheckInputFormat.checkInput(input);
        //then
        Assert.assertEquals("input normal",output);
    }
    @Test
    public void should_return_false_when_CheckInputFormat_then_input_1234(){
        //given
        String input = "1 2 3 1";
        //when
        String output = CheckInputFormat.checkInput(input);
        //then
        Assert.assertEquals("Wrong Input，Input again",output);
    }
    @Test
    public void should_return_fourNumber_when_GenerateGameAnswer(){
        //when
        List<Integer> output = GenerateGameAnswer.GenerateNum();
        //then
        Assert.assertEquals(4,output.size());
    }
    @Test
    public void should_return_fourDiffNumber_when_GenerateGameAnswer(){
        //when
        List<Integer> output = GenerateGameAnswer.GenerateNum();
        Set result = new HashSet(output);
        //then
        Assert.assertEquals(4,result.size());
    }
    @Test
    public void should_return_win_when_CountGuessResult_given_1234_answer_1234() throws IOException {
        //given
        String[] input={"1","2","3","4"};
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        //when
        String result = CountGuessResult.CountResult(input,answer);
        //then
        Assert.assertEquals("4A0B win, all correct",result);
    }
    @Test
    public void should_return_allwrong_when_CountGuessResult_given_5678_answer_1234() throws IOException {
        //given
        String[] input={"5","6","7","8"};
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        //when
        String result = CountGuessResult.CountResult(input,answer);
        //then
        Assert.assertEquals("0A0B all wrong",result);
    }
    @Test
    public void should_return_2A2B_when_CountGuessResult_given_1243_answer_1234() throws IOException {
        //given
        String[] input={"1","2","4","3"};
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        //when
        String result = CountGuessResult.CountResult(input,answer);
        //then
        Assert.assertEquals("2A2B 1and2correct，4and3wrong position",result);
    }
}
