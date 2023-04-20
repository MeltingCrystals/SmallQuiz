package de.thu.smallquiz;

public class Question {
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    private int correct_answer;

    Question(String question, String answer1, String answer2, String answer3, String answer4, int correct_answer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correct_answer=correct_answer;
    }

    void set_question(String question){
        this.question = question;
    }

    String get_question (){
        return this.question;
    }

    void set_answer1(String answer1){
        this.answer1 = answer1;
    }

    String get_answer1 (){
        return this.answer1;
    }

    void set_answer2(String answer2){
        this.answer2 = answer2;
    }

    String get_answer2 (){
        return this.answer2;
    }

    void set_answer3(String answer3){
        this.answer3 = answer3;
    }

    String get_answer3 (){
        return this.answer3;
    }

    void set_answer4(String answer4){
        this.answer4 = answer4;
    }

    String get_answer4 (){
        return this.answer4;
    }

    void set_correct_answer (int correct_answer){
        this.answer1 = answer1;
    }

    int get_correct_answer (){
        return this.correct_answer;
    }

    
}
