import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Question{

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    public CheckBox(String text, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers){
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
