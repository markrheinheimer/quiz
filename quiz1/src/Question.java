public class Question {

    private String text;

    private int numberCorrect = 0;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public int getNumberCorrect() {
        return numberCorrect;
    }

    public void setNumberCorrect() {
        this.numberCorrect++;
    }
}
