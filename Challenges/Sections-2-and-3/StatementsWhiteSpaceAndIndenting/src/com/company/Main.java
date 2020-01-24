package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println(myVariable);

        System.out.println("This is" +
                "another" +
                "test."); // allows multiline expressions

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one."); // allows multiple expressions on the same line. Important thing is the semicolon
    }
}
