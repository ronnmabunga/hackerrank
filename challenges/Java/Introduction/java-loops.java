import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a[] = new int[t];
        int b[] = new int[t];
        int n[] = new int[t];
        for(int i=0;i<t;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            n[i] = in.nextInt();
        }
        int val;
        for(int i = 0; i<t; i++){
            val = a[i];
            for(int j = 0; j < n[i]; j++){
                val += b[i]*Math.pow(2,j);
                System.out.print(val+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}

