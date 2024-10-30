import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
            return false;
        else{
            char [] a2CA = a.toUpperCase().toCharArray();
            char [] b2CA = b.toUpperCase().toCharArray();
            java.util.Arrays.sort(a2CA);
            java.util.Arrays.sort(b2CA);
            if(String.valueOf(a2CA).equals(String.valueOf(b2CA)))
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}