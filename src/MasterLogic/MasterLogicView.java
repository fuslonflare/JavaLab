package MasterLogic;

/**
 * Created by Phuwarin on 5/6/2017.
 */
class MasterLogicView {


    MasterLogicView() {
        // default constructor
    }

    void initView() {
        logln("Welcome to Master Logic !");
        logln("Guess 0-9 only.");
        logln("Caution ! You can play 20 times only.");
    }

    void showRound(int round) {
        log("Round " + round + " >> ");
    }

    void summaryEachRound(RoundDao round) {
        logln("Position: " + round.getCorrectPosition() +
                "  Color: " + round.getCorrectColor());
    }

    void showAnswer() {
        logln(CorrectAnswer.getInstance().getCorrectAnswer());
    }

    private void logln(Object message) {
        System.out.println(String.valueOf(message));
    }

    private void log(Object message) {
        System.out.print(String.valueOf(message));
    }
}

