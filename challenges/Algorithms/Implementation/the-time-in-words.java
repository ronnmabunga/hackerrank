import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        if(m==0)
            return hrString(h) + " o' clock";
        if(m>30){
            h++;
            m=60-m;
            if(m == 15)
                return "quarter to " + hrString(h);
            return minString(m) + " to " + hrString(h);
        }else{
            if(m == 15)
                return "quarter past " + hrString(h);
            if(m == 30)
                return "half past " + hrString(h);
            return minString(m) + " past " + hrString(h);

        }
    }
    static String hrString(int hr){
        switch(hr){
            case 1:{return "one";}
            case 2:{return "two";}
            case 3:{return "three";}
            case 4:{return "four";}
            case 5:{return "five";}
            case 6:{return "six";}
            case 7:{return "seven";}
            case 8:{return "eight";}
            case 9:{return "nine";}
            case 10:{return "ten";}
            case 11:{return "eleven";}
            case 12:{return "twelve";}
            default: return "";
        }
    }
    static String minString(int min){
        switch(min){
            case 1:{return "one minute";}
            case 2:{return "two minutes";}
            case 3:{return "three minutes";}
            case 4:{return "four minutes";}
            case 5:{return "five minutes";}
            case 6:{return "six minutes";}
            case 7:{return "seven minutes";}
            case 8:{return "eight minutes";}
            case 9:{return "nine minutes";}
            case 10:{return "ten minutes";}
            case 11:{return "eleven minutes";}
            case 12:{return "twelve minutes";}
            case 13:{return "thirteen minutes";}
            case 14:{return "fourteen minutes";}
            case 16:{return "sixteen minutes";}
            case 17:{return "seventeen minutes";}
            case 18:{return "eighteen minutes";}
            case 19:{return "nineteen minutes";}
            case 20:{return "twenty minutes";}
            case 21:{return "twenty one minutes";}
            case 22:{return "twenty two minutes";}
            case 23:{return "twenty three minutes";}
            case 24:{return "twenty four minutes";}
            case 25:{return "twenty five minutes";}
            case 26:{return "twenty six minutes";}
            case 27:{return "twenty seven minutes";}
            case 28:{return "twenty eight minutes";}
            case 29:{return "twenty nine minutes";}
            default: return "";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
