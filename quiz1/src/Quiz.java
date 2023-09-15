import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;

    public void addQuestion(Question newQuestion) {
        questions.add(newQuestion);
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

}
