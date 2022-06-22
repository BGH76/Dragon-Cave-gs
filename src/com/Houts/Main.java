package com.Houts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean validSelection = false;
        String selection = null;

        System.out.println("You are in a land full of dragons. \n" +
                "In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                "The other dragon is greedy and hungry and will eat you on sight.\n");

        System.out.println("Which cave will you go into? (1 or 2)\n");

        // Takes user input and continues to prompt until
        // A valid selection is entered. Using Strings to avoid adding
        // additional code to handle exceptions such as user entering a character
        // if using sc.nextInt().
        while (!validSelection) {
            selection = sc.nextLine();
            if(selection.equals("1") || selection.equals("2")) {
                validSelection = true;
            }
            else {
                System.out.println("Please enter a valid selection. (1 or 2)");
            }
        }

        switch(selection) {
            case "1":
                System.out.println("You approach the cave...\n" +
                        "It is dark and spooky...\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                        "Gobbles you down in one bite!");
                break;
            case "2":
                System.out.println("You approach the cave...\n" +
                        "It is dark and spooky...\n" +
                        "Unsure what lies ahead, you slowly creep inside.\n" +
                        "From behind a pile of rocks jumps the good dragon and welcomes you inside.\n" +
                        "Please with the visit, he offers to share his treasure with you.");
                break;
            default:
                break;
        }
    }
}
