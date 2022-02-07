package com.company;

import java.util.Arrays;

public class Question {
    private Answer[] answers;
    private int correct;
    private String text;

    public Question(String text,Answer[] answers, int correct) {
        this.answers = answers;
        this.correct = correct;
        this.text = text;
    }

    @Override
    public String toString() {
        String oput = "\n" + this.text + "\n";
        for (int i=0; i < answers.length; i++){
                oput = oput + (i+1) + ") " + this.answers[i].getText() + "\n";
        }
        return oput;
    }

    public boolean check_answer(String user){
        return user.equals(String.valueOf(this.correct));
    }
}
