import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        int i = 0;
        while(inp.hasNext()){
            System.out.println(++i + " " + inp.nextLine());
        }
    }
}

