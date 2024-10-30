import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int c = 0;
        int ht = 0;
        boolean inValley = false;
        //UDDDUDUU
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) =='U'){
                ht++;
                if(inValley && ht==0){
                    c++;
                    inValley = false;
                }
            }
            if(s.charAt(i) =='D'){
                ht--;
                if(!inValley && ht==-1){
                    inValley = true;
                }
            }
        }
        return c;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
