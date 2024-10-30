import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Scanner inp = new Scanner(System.in);
    public static int B = inp.nextInt();
    public static int H = inp.nextInt();
    public static boolean flag = B>0 && H>0;
    static {
        if(!flag){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }

    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

