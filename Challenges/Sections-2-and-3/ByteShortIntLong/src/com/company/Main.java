package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        int myMaxIntText = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Minimum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Minimum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Minimum Value = " + myMaxLongValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        // Primitive Types Challenge
        byte challengeByteValue = 100;
        short challengeShortValue = 2500;
        int challengeIntValue = 100000;
        long challengeLongValue = 50000L + (10L * (challengeByteValue + challengeShortValue + challengeIntValue));
        System.out.println(challengeLongValue);
    }
}
