import java.util.*;
import java.util.regex.*;

class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        LinkedList<String> gmails = new LinkedList();
        String myRegExString = "^(\\w|[\\.-])+@gmail.com$";
        Pattern p = Pattern.compile(myRegExString);

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                gmails.add(firstName);
            }
        }
        Collections.sort(gmails);
        for (String s : gmails) {
            System.out.println(s);
        }

        scanner.close();
    }
}
