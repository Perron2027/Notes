package com.Revature.UI;

public class Solution {

    public int sumOfTwoNums(int a, int b) {
        return a + b;
    }

    public String isEven(int c){
        if(c % 2 == 0){
            return "Even";
        }else {
            return "Uneven";
        }
    }

    public String finalBoss(String input){
        if(input.length() <= 10){
            return input;
        }
        int length = input.length();
        char firstChar;
        char lastChar;

        firstChar = input.charAt(0);
        lastChar = input.charAt(length - 1);
        int betweenNumber = length - 2;

        return firstChar + Integer.toString(betweenNumber) + lastChar;

    }
}
