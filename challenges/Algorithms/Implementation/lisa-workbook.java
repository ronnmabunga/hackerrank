import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
        int page = 1;
        int sp = 0;
        int lastindex,min;
        for(int i = 0; i < arr.length; i ++){
            lastindex = 1;
            while(arr[i]!=0){
                min = (k<arr[i]?k:arr[i]);
                System.out.println("page:"+page+" sp:"+sp+" arr[i]:"+arr[i]+" lastindex:"+lastindex+" min:"+min);
                if(lastindex <= page && page < lastindex+min)
                    sp++;
                page++;lastindex+=min; arr[i]-=min;
            }
        }
        return sp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
