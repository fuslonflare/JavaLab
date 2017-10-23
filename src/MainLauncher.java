/**
 * Created by Phuwarin on 4/29/2017.
 */
public class MainLauncher {
    public static void main(String[] args) {
        testCommand();
        testCommand2();
    }

    private static void testCommand() {
        long start = System.nanoTime();
        boolean a = true, b = true, c = false;
        if (a || b || c) {
            log("Something");
        }
        long stop = System.nanoTime();
        log("Command1 : " + (stop - start) + " nanosec");
    }

    private static void testCommand2() {
        long start = System.nanoTime();
        boolean a = true, b = true, c = false;
        if (a) {
            log("Something");
        } else if (b) {
            log("Something");
        } else if (c) {
            log("Something");
        } else {

        }
        long stop = System.nanoTime();
        log("Command2 : " + (stop - start) + " nanosec");
    }

    private static boolean z() {
        log("z");
        return true;
    }

    private static void log(String message) {
        System.out.println(message);
    }
}
