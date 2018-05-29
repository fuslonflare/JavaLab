/**
 * Created by Phuwarin on 4/29/2017.
 */
public class MainLauncher {
    public static void main(String[] args) {
        Thread worker1 = new Thread(() -> {
            for (int i = 0; i < 20; ++i) {
                try {
                    testCommand(i);
                    logln("");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread worker2 = new Thread(() -> {
            for (int i = 0; i < 20; ++i) {
                try {
                    testCommand2(i);
                    Thread.sleep(10);
                    logln("");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        worker1.start();
        worker2.start();
    }

    private static void testCommand(int i) {
        long start = System.nanoTime();
        boolean a = true, b = true, c = false;
        if (a || b || c) {
            //log("Something");
        }
        long stop = System.nanoTime();
        log("[Round " + i + "]Command1 : " + (stop - start) + " nanosec | ");
    }

    private static void testCommand2(int i) {
        long start = System.nanoTime();
        boolean a = true, b = true, c = false;
        if (a) {
            //log("Something");
        } else if (b) {
            //log("Something");
        } else if (c) {
            //log("Something");
        } else {

        }
        long stop = System.nanoTime();
        log("[Round " + i + "] Command2 : " + (stop - start) + " nanosec | ");
    }

    private static boolean z() {
        log("z");
        return true;
    }

    private static void log(String message) {
        System.out.print(message);
    }

    private static void logln(String message) {
        System.out.println(message);
    }
}
