package com.company;

public class Main {

    public static void main(String[] args) {

        double myFirstDouble = 20.00;
        double mySecondDouble = 80.00;
        double myDoubleTotal = (myFirstDouble + mySecondDouble) * 100.00;
        System.out.println("myDoubleTotal = " + myDoubleTotal);

        double myRemainder = myDoubleTotal % 40.00;
        System.out.println("myRemainder = " + myRemainder);

        boolean myRemainderBoolean = (myRemainder == 0) ? true : false;
        System.out.println("myRemainderBoolean = " + myRemainderBoolean);

        if (!myRemainderBoolean)
            System.out.println("Got some remainder!");
    }
}
