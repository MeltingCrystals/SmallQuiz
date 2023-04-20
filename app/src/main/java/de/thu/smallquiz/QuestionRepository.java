package de.thu.smallquiz;

import java.util.ArrayList;
import java.util.Random;

public class QuestionRepository {
    public Question first;
    public Question second;
    public Question third;
    public Question fourth;
    public Question fifth;

    private Random random;

    public ArrayList<Question> questions = new ArrayList<Question>();

    public QuestionRepository(Question q, Question m, Question z, Question p, Question g) {

        this.first = q;
        this.second = m;
        this.third = z;
        this.fourth = p;
        this.fifth = g;


        questions.add(first);
        questions.add(second);
        questions.add(third);
        questions.add(fourth);
        questions.add(fifth);

        random = new Random();
    }

    Question randomQuestion(){

        if (questions.isEmpty()){
            return null;
        }
        int index = random.nextInt(questions.size());
        Question randomQuestion = questions.get(index);

        questions.remove(index);

        return randomQuestion;
    }
}
