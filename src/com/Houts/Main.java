package com.Houts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean validSelection = false;
        int selection;
        DragonCave dragonCave = new DragonCave();

        System.out.println(dragonCave.getIntro());

        System.out.println(dragonCave.getCaveSelection());

        // Takes user input and continues to prompt until
        // A valid selection is entered. Using Strings to avoid adding
        // additional code to handle exceptions such as user entering a character
        // if using sc.nextInt().
        while (!validSelection) {
            try {
                selection = sc.nextInt();
                if(selection == 1 || selection == 2) {
                    validSelection = true;
                }
                else {
                    System.out.println(dragonCave.getCaveValidSelection());
                }
                switch(selection) {
                    case 1:
                        System.out.println(dragonCave.badDragon());
                        break;
                    case 2:
                        System.out.println(dragonCave.goodDragon());
                        break;
                    default:
                        break;
                }
            }
            catch(Exception e) {
                System.out.println(dragonCave.getCaveValidSelection());
                sc.nextLine();
            }
        }
    }
}
