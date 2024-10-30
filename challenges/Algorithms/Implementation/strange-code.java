import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static Map <Long, Long> f = new HashMap();
    static {
        Long time = 1L;
        Long value = 3L;
        do{
            f.put(time,value);
            time+=value;
            value*=2L;
        }while(time<=10000000000000L);
        f.put(time,value);
        //System.out.println(f.toString());
    }

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        Object [] keys = f.keySet().toArray();
        Arrays.sort(keys);
        for(int i = 0; i < keys.length; i ++){
            if(t==(Long)keys[i])
                return f.get((Long)keys[i]);
            else if((Long)keys[i] > t){
                return f.get((Long)keys[i-1]) - (t-(Long)keys[i-1]);
            }
        }
        return 0L;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
