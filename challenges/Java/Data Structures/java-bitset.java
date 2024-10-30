import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        
        
        /*      INPUTS      */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        //br.readLine();
        //if(st.hasMoreTokens())
        //    st.nextToken();
        String [] operators = new String[b];
        int [] x = new int[b];
        int [] y = new int[b]; 
        for(int i = 0; i < b; i ++){
            st = new StringTokenizer(br.readLine());
            operators[i] = st.nextToken();
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        /*      SOLUTION    */
        BitSet bs1 = new BitSet(a);
        BitSet bs2 = new BitSet(a);
        for(int i = 0; i < b; i ++){
            if(operators[i].equals("AND")){
                if(x[i]==1) bs1.and(bs2); else bs2.and(bs1);
            }else if(operators[i].equals("SET")){
                if(x[i]==1) bs1.set(y[i]); else bs2.set(y[i]);
            }else if(operators[i].equals("FLIP")){
                if(x[i]==1) bs1.flip(y[i]); else bs2.flip(y[i]);
            }else if(operators[i].equals("OR")){
                if(x[i]==1) bs1.or(bs2); else bs2.or(bs1);
            }else{
                if(x[i]==1) bs1.xor(bs2); else bs2.xor(bs1);
            }
            bw.write(String.valueOf(bs1.cardinality())+" "+String.valueOf(bs2.cardinality()));
            bw.newLine();
        }

        /*      OUTPUTS     */
        
        //bw.write(stringResult);
        //bw.newLine();
        //bw.write(String.valueOf(primitiveResult));
        bw.close();
    }
}
