package com.company;

public class Main {

    public static void main(String[] args) {
	int switchValue = 6;
	switch(switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;

        case 3: case 4: case 5:
            System.out.println("Value was a 3, or a 4, or a 5");
            break;

        default:
            System.out.println("Was not 1,2,3, 4, or a 5");
            break;
    }

    char character = 'j';

    switch(character) {
        case 'A': case 'B': case 'C': case 'D': case 'E':
            System.out.println("Found a " + character);

        default:
            System.out.println("not found");
    }
    }
}
