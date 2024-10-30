import java.util.*;
import java.security.*;

class Solution {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            // String s=???; Complete this line below
            int m = n;
            String s = "";
            if (m < 0) {
                m = -m;
                while (m > 0) {
                    s = (char) ((m % 10) + '0') + s;
                    m = m / 10;
                }
                s = "-" + s;
            } else if (m == 0) {
                s = "0";
            } else {
                while (m > 0) {
                    s = (char) ((m % 10) + '0') + s;
                    m = m / 10;
                }
            }
            // int m = Integer.parseInt(s);
            // System.out.println(m);
            // System.out.println(s);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
