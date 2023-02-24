package org.example;


import java.util.Scanner;

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerName;

        System.out.print("What's your name? ");
        playerName = input.nextLine();

        System.out.println("Welcome, " + playerName + "! You are about to embark on an adventure. Follow the prompts to make your choices and see where they take you.");

        System.out.print("You find yourself at a crossroads. Which way do you go? (left or right) ");
        String choice = input.nextLine();

        if (choice.equals("left")) {
            System.out.print("You see a dark cave ahead. Do you enter it? (yes or no) ");
            choice = input.nextLine();

            if (choice.equals("yes")) {
                System.out.println("You enter the cave and find a treasure chest! You win!");
            } else {
                System.out.println("You decide not to enter the cave and continue on your journey. You come across a friendly village and decide to stay there for a while.");
            }
        } else {
            System.out.print("You come across a river. Do you swim across it? (yes or no) ");
            choice = input.nextLine();

            if (choice.equals("yes")) {
                System.out.println("You get swept away by the current and end up downstream. You lose!");
            } else {
                System.out.println("You follow the river and come across a bridge. You cross it and continue on your journey.");
            }
        }
    }
}

