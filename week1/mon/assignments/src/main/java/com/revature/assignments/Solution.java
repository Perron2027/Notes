package com.revature.assignments;

public class Solution {
    public int sumOfTwoNum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public String evenOdd(int a){

        if (a % 2 == 0) {
            return "EVEN";
        } else {
           return "ODD";
        }
    }
    public String abr(String s){
        char[] stringArray = s.toCharArray();
        int length = stringArray.length;
        int lengthMinusTwo = length - 2;
        char lastChar = stringArray[stringArray.length-1];
           if (length > 10) {
            String phrase = String.format("%c%d%c", stringArray[0], lengthMinusTwo, lastChar);
            return phrase;
        } else {
            return s;
        }
    }
}