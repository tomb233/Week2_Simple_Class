package com.company;

/**
 * Created by Tom on 24/09/2015.
 */

public class Main {

    public static void main(String[] args) {
        TwoNumbers a = new TwoNumbers(12,18);
        TwoNumbers b = new TwoNumbers(17,17);
        System.out.println(a.toString());
        System.out.println(b.toString());

        a.addNumbers(5, 14);
        System.out.println(a.toString());
        b.addObject(a);
        System.out.println(b.toString());
        TwoNumbers c = a.Sum(b);
        System.out.println(b.toString());
    }
}
