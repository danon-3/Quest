package com.company;

import java.util.Scanner;

public class Game {
    //introduction, ending, phrases
    private String name;
    public Question[] quest;
    public Game(Question[] questions) {
        this.quest = questions;
    }

    public void introduction() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        System.out.println("Hello, " + this.name + "! Let's play The Game!");
        System.out.println(this.quest[0].toString());
    }

    public void conclusion(int correct){
        System.out.println("\n" + "Thank you for the game in The Game, " + this.name + "! \n" +
                "You tackled " + correct + "/" + quest.length + " questions! An awesome score! \nSee you soon!");
    }

}
