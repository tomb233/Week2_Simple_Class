package com.company;

/**
 * Created by Tom on 24/09/2015.
 */
public class TwoNumbers {
    private int int1 = 0;
    private int int2 = 0;

    public TwoNumbers(int x, int y){
        int1 = x;
        int2 = y;
    }
    public int first(){
        return int1;
    }
    public int second(){
        return int2;
    }
    public int max(){
        if(int1 > int2){
            return int1;
        }else if(int2 > int1){
            return int2;
        }else{
            return int1;
        }
    }
    public boolean equal(){
        if(int1 == int2){
            return true;
        } else {
            return false;
        }
    }
    public int gcd(){
        int answer = 0;
        int x = int1;
        int y = int2;
        while(x!=0 && y!=0)
        {
            int z = y;
            y = x%y;
            x = z;
        }
        return x+y;
    }
    public void addNumbers(int x, int y){
        int1 = int1  + x;
        int2 = int2 + y;
    }

    public void addObject(TwoNumbers x){
        int1 = int1 + x.int1;
        int2 = int2 + x.int2;
    }

    public TwoNumbers Sum(TwoNumbers x){
        TwoNumbers y = new TwoNumbers(0,0);
        y.int1 = int1 + x.int1;
        y.int2 = int2 + x.int2;
        return y;

    }

    public String toString(){
        String x = "";
        int a = max();
        boolean b = equal();
        int c = gcd();
        x = "\nFirst Number = " + int1 + "\nSecond Number: " + int2 + "\nMax: " + a + "\nEqual: "+b + "\nGCD: "+c ;
        return x;
    }

}
