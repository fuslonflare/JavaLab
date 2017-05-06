package MasterLogic;

/**
 * Created by Phuwarin on 5/7/2017.
 */
class CorrectAnswer {
    private static CorrectAnswer ourInstance = new CorrectAnswer();
    private int correctAnswer;

    private CorrectAnswer() {
    }

    static CorrectAnswer getInstance() {
        return ourInstance;
    }

    int getCorrectAnswer() {
        return correctAnswer;
    }

    void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
