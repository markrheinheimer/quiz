import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{


    private ArrayList<String> possibleAnswers;
    private int correctAnswers;

    public MultipleChoice(String text, ArrayList<String> possibleAnswers, int correctAnswers){
        super(text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    public void printQuestion() {
        System.out.println(getText() + "\n" + String.join("", possibleAnswers));
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
    }
}
