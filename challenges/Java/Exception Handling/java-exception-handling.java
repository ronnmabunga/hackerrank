import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a/b);
        }catch(java.util.InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
