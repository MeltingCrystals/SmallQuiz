package de.thu.smallquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Question first = new Question("what's up?", "the sky",
            "prices", "the elevator", "the bird", 4);

    Question second = new Question("who is rafaello?", "candy",
            " a painter", "a spy", "a turtle", 2);

    Question third = new Question("do you like the color purple?", "yes",
            "sometimes", "no", "it's a color of schizo", 4);
    Question fourth = new Question("who is donald trump?", "a man",
            "a president", "yo mama", "a woman", 1);

    Question fifth = new Question("what is katakana?", "an ice-ring",
            "japanese alphabet", "a type of cat", "korean soda", 2);


    QuestionRepository repository;
    TextView questionTextView;
    Button answerButton1;
    Button answerButton2;
    Button answerButton3;
    Button answerButton4;

    private Question currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository = new QuestionRepository(first, second, third, fourth, fifth) ;

        Question randomQuestion = repository.randomQuestion();

        questionTextView = findViewById(R.id.question);    //find text view and set its text to a random question

        answerButton1 = findViewById(R.id.answer1);

        answerButton2 = findViewById(R.id.answer2);

        answerButton3 = findViewById(R.id.answer3);

        answerButton4 = findViewById(R.id.answer4);

        updateQuestion();

    }

    private void updateQuestion(){

        currentQuestion = repository.randomQuestion();

        // Handle the case when there are no more questions left
        // e.g., show a message or navigate to another activity
        if(currentQuestion == null){
            return;
        }

        questionTextView.setText(currentQuestion.get_question());

        answerButton1.setText(currentQuestion.get_answer1());

        answerButton2.setText(currentQuestion.get_answer2());

        answerButton3.setText(currentQuestion.get_answer3());

        answerButton4.setText(currentQuestion.get_answer4());

        answerButton1.setEnabled(true);
        answerButton2.setEnabled(true);
        answerButton3.setEnabled(true);
        answerButton4.setEnabled(true);

    }

    public void onAnswerButtonClick(View view) {
        int clickedButtonIndex = 0;

        if (view.getId() == R.id.answer1) {
            clickedButtonIndex = 1;
        } else if (view.getId() == R.id.answer2) {
            clickedButtonIndex = 2;
        } else if (view.getId() == R.id.answer3) {
            clickedButtonIndex = 3;
        } else if (view.getId() == R.id.answer4) {
            clickedButtonIndex = 4;
        }

        if (clickedButtonIndex == currentQuestion.get_correct_answer()) {
            // Correct answer selected
            updateQuestion();
        } else {
            // Wrong answer selected, disable the button
            view.setEnabled(false);
        }
    }
}