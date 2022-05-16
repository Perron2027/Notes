package com.revature.assignments;

public class Solutions {

    public Solutions()
    {

    }
    public int Easy(int a, int b)
    {
        return a+b;
    }
    public String Medium(int a)
    {
        if (a%2 != 0)
        {
            return "NO!";
        }
        else
            return "YES!";
    }
    public String FinalBoss(String c)
    {
        if (c.length() >10)
        {
            return c.charAt(0)+ String.valueOf(c.length()-2)+c.charAt(c.length()-1);
        }
        else
            return c;
    }
}
