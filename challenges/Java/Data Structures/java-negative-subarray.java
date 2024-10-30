import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList();
        while(st.hasMoreTokens())
            arr.add(Integer.parseInt(st.nextToken()));
        int count = 0;
        int total;
        for(int i = 0; i < n; i ++){
            total = 0;
            for(int j = i; j < n; j ++){
                total+=arr.get(j);
                if(total<0){
                    //System.out.println(i+":"+j+":"+total);
                    count++;
                }
                //System.out.println(i+":"+j+":"+total);
            }
        }
        System.out.println(count);
    }
}
