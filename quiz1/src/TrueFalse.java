import java.util.Scanner;

public class TrueFalse extends Question {

    private boolean isCorrect;

    public TrueFalse(String text, boolean isCorrect) {
        super(text);
        this.isCorrect = isCorrect;

    }

    public void printQuestion() {
        System.out.println(getText() + "\n" + "T/F" + "\n");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
    }
}
