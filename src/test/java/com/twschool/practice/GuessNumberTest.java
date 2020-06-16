package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals("输入错误，再次输入",output);
    }
}
