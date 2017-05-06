import java.util.HashMap;
import java.util.Map;

/**
 * Created by Phuwarin on 4/29/2017.
 */
public class MainLauncher {
    public static void main(String[] args) {
        testCommand();
    }

    private static void testCommand() {
        Map<String, String> memberList = new HashMap<>();
        memberList.put("759199790902847", "Phuwarin Janaporn");
        memberList.put("4", "Mark Zuckerberg");
    }

    private static void log(String message) {
        System.out.println(message);
    }
}
