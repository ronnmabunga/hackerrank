import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B="";
        for(char x:A.toCharArray()){
            B = x+B;
        }
        if(B.equals(A))
            System.out.print("Yes");
            else
            System.out.print("No");
            
    }
}

