import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        Map<Integer, LinkedList<Integer>> histogram = new HashMap();
        for(int i = 0; i < a.length; i ++){
            LinkedList<Integer> forAdd;
            if(histogram.containsKey(a[i])){
                forAdd = histogram.get(a[i]);
                forAdd.add(i);
                histogram.put(a[i],forAdd);
            }else{
                forAdd = new LinkedList();
                forAdd.add(i);
                histogram.put(a[i],forAdd);
            }
        }
        Integer mindistance = -1;
        for(Integer i:histogram.keySet()){
            LinkedList<Integer> entry = histogram.get(i);
            if(entry.size()>1){
                Integer obtainedMin = minDist(entry);
                if(obtainedMin < mindistance || mindistance == -1)
                    mindistance = obtainedMin;
            }
            if(mindistance==1)
                return 1;
        }
        return mindistance;
    }

    static int minDist(LinkedList<Integer> entry){
        Object [] entries = entry.toArray();
        int temp;
        int minDistance = (Integer)entries[1]-(Integer)entries[0];
        for(int i = 0; i < entries.length-1; i ++){
            for(int j = i+1; j < entries.length; j ++){
                temp = (Integer)entries[j]-(Integer)entries[i];
                if(temp == 1)
                    return 1;
                if(temp < minDistance){
                    minDistance = temp;
                }
                    
            }
        }
        return minDistance;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
