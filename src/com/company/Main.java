package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Question[] questions = new Question[5];
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        // Question 1
        String text = "Which country is the biggest?";
        Answer ans1 = new Answer("Denmark");
        Answer ans2 = new Answer("Mexico");
        Answer ans3 = new Answer("Indonesia");
        Answer[] answers = new Answer[3];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        Question question1 = new Question(text, answers, 1);
        questions[0] = question1;

        // Question 2
        text = "The capital of which country is Niamey?";
        ans1 = new Answer("Ethiopia");
        ans2 = new Answer("Chad");
        ans3 = new Answer("Niger");
        Answer[] answers2 = new Answer[3];
        answers2[0] = ans1;
        answers2[1] = ans2;
        answers2[2] = ans3;
        Question question2 = new Question(text, answers2, 3);
        questions[1] = question2;

        // Question 3
        text = "Which country did not participate in WW2?";
        ans1 = new Answer("Spain");
        ans2 = new Answer("USSR");
        ans3 = new Answer("Denmark");
        Answer[] answers3 = new Answer[3];
        answers3[0] = ans1;
        answers3[1] = ans2;
        answers3[2] = ans3;
        Question question3 = new Question(text, answers3, 1);
        questions[2] = question3;

        // Question 4
        text = "Which country does not have a death penalty?";
        ans1 = new Answer("USA");
        ans2 = new Answer("China");
        ans3 = new Answer("Turkey");
        Answer[] answers4 = new Answer[3];
        answers4[0] = ans1;
        answers4[1] = ans2;
        answers4[2] = ans3;
        Question question4 = new Question(text, answers4, 3);
        questions[3] = question4;

        // Question 5
        text = "Which country is not a current monarchy?";
        ans1 = new Answer("Monaco");
        ans2 = new Answer("Canada");
        ans3 = new Answer("Italy");
        Answer[] answers5 = new Answer[3];
        answers5[0] = ans1;
        answers5[1] = ans2;
        answers5[2] = ans3;
        Question question5 = new Question(text, answers5, 2);
        questions[4] = question5;

        Game game1 = new Game(questions);

        game1.introduction();
        for (int i=0; i < questions.length; i++) {
            boolean an = questions[i].check_answer(scanner.nextLine());
            System.out.println(an);
            if (an)
                result = result + 1;
            try{
            System.out.println(questions[i+1].toString());}
            catch (Exception e){
                game1.conclusion(result);
            }
        }

    }

}
