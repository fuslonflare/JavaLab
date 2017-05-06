package MasterLogic;

/**
 * Created by Phuwarin on 5/7/2017.
 */
public class RoundDao {

    private int round;
    private String guessNumber;
    private int correctPosition;
    private int correctColor;

    RoundDao(int round, String guessNumber, int correctPosition, int correctColor) {
        this.round = round;
        this.guessNumber = guessNumber;
        this.correctPosition = correctPosition;
        this.correctColor = correctColor;
    }

    int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    String getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(String guessNumber) {
        this.guessNumber = guessNumber;
    }

    int getCorrectPosition() {
        return correctPosition;
    }

    void setCorrectPosition(int correctPosition) {
        this.correctPosition = correctPosition;
    }

    int getCorrectColor() {
        return correctColor;
    }

    void setCorrectColor(int correctColor) {
        this.correctColor = correctColor;
    }
}
