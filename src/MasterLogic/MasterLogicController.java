package MasterLogic;

import java.util.Scanner;

/**
 * Created by Phuwarin on 5/6/2017.
 */
class MasterLogicController {

    void startApplication() {
        MasterLogicView view = new MasterLogicView();
        MasterLogicModel model = new MasterLogicModel();

        view.initView();
        model.startGame();
    }

    String getNumber() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
