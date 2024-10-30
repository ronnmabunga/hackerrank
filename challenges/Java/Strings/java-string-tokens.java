import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] tokens = s.split(" |!|,|\\?|\\.|_|'|@");
        int tokenslength = tokens.length;
        for(String token:tokens){
            if(token.equals(""))
                tokenslength--;
        }
        System.out.println(tokenslength);

        for(String token:tokens){
            if(!token.equals(""))
                System.out.println(token);
        }
        scan.close();
    }
}

