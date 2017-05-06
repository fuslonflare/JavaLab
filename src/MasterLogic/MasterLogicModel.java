package MasterLogic;

import java.util.Random;

/**
 * Created by Phuwarin on 5/6/2017.
 */
class MasterLogicModel {

    private MasterLogicController controller;
    private MasterLogicView view;

    private int[] puzzle, guess, countPuzzle, countGuess;
    private RoundDao[] round;

    private static final int ROUND = 20;
    private static final int COLOR = 10;
    private static final int DIGIT = 4;

    MasterLogicModel() {
        // default constructor
        init();
    }

    private void init() {
        controller = new MasterLogicController();
        view = new MasterLogicView();

        puzzle = new int[DIGIT];
        guess = new int[DIGIT];
        countPuzzle = new int[COLOR];
        countGuess = new int[COLOR];
        round = new RoundDao[ROUND];

    }

    void startGame() {
        generateNumber();
        //view.showAnswer();

        for (int i = 0; i < ROUND; i++) {
            view.showRound(i);
            round[i] = new RoundDao(i, controller.getNumber(), 0, 0);
            clearCountGuess();

            if (!checkNumberGuess(round[i].getGuessNumber())) return;
            for (int j = 0; j < DIGIT; j++) {
                guess[j] = Integer.parseInt(round[i].getGuessNumber().substring(j, j + 1));
            }
            countNumberEachDigit(countGuess, guess);

            setCorrectPosition(round[i].getRound());
            setCorrectColor(round[i].getRound());

            view.summaryEachRound(round[i]);
        }
    }

    private void clearCountGuess() {
        for (int i = 0; i < COLOR; i++) {
            countGuess[i] = 0;
        }
    }

    private void setCorrectColor(int index) {
        for (int i = 0; i < COLOR; i++) {
            if (countPuzzle[i] < countGuess[i]) {
                round[index].setCorrectColor(round[index].getCorrectColor() + countPuzzle[i]);
            } else {
                round[index].setCorrectColor(round[index].getCorrectColor() + countGuess[i]);
            }
        }
    }

    private void setCorrectPosition(int index) {
        for (int i = 0; i < DIGIT; i++) {
            if (puzzle[i] == guess[i]) {
                round[index].setCorrectPosition(round[index].getCorrectPosition() + 1);
            }
        }
    }

    private void generateNumber() {
        Random generate = new Random();
        CorrectAnswer.getInstance().setCorrectAnswer(generate.nextInt(10000));
        exportToArray(CorrectAnswer.getInstance().getCorrectAnswer(), puzzle);
        countNumberEachDigit(countPuzzle, puzzle);
    }

    private void countNumberEachDigit(int[] countArray,
                                      int[] numberArray) {
        for (int i = 0; i < DIGIT; i++) {
            countArray[numberArray[i]]++;
        }
    }

    private void exportToArray(int number,
                               int[] targetArray) {
        int tempNumber = number;

        for (int i = DIGIT - 1; i > -1; i--) {
            int digit = (int) (tempNumber / Math.pow(10, i));
            targetArray[DIGIT - 1 - i] = digit;
            tempNumber %= Math.pow(10, i);
        }
    }

    private boolean checkNumberGuess(String guessNumber) {
        return guessNumber.length() == DIGIT;
    }
}
