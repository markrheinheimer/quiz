import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        ArrayList<String> question2possible = new ArrayList<>(Arrays.asList("1) Dog \n", "2) Fork \n", "3) Cat"));
        ArrayList<Integer> question2correct = new ArrayList<>(Arrays.asList(1, 3));
        ArrayList<String> question3possible = new ArrayList<>(Arrays.asList("1) 5 \n", "2) 18 \n", "3) 12"));


        TrueFalse question1 = new TrueFalse("Is the sky blue?", true);
        CheckBox question2 = new CheckBox("Which of these are animals?", question2possible, question2correct);
        MultipleChoice question3 = new MultipleChoice("How many are in a dozen?", question3possible, 3);




        question1.printQuestion();
        question2.printQuestion();
        question3.printQuestion();

        Quiz quiz1 = new Quiz();

        quiz1.addQuestion(question1);
        quiz1.addQuestion(question2);
        quiz1.addQuestion(question3);

        System.out.println(quiz1.getQuestions());


    }
}