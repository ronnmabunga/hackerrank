import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
   PerformOperation isOdd(){
       PerformOperation oddCheck = (int num) -> (num%2==1);
       return oddCheck;
   }
   PerformOperation isPrime(){
       int [] i = {2};
       PerformOperation primeCheck = (int num) -> {
           for(; i[0] < num/2; i[0]++){
               if(num%i[0]==0) return false;
           }
           return true;
       };
       return primeCheck;
   }
   PerformOperation isPalindrome(){
       String [] s = {""};
       int [] i = {0};
       PerformOperation palindromeCheck = (int num) -> {
           s[0] = String.valueOf(num);
           for(; i[0] < s[0].length()/2 + 1; i[0]++){
                if(s[0].charAt(i[0]) != s[0].charAt(s[0].length() - 1 - i[0]))
                    return false;
           }
           return true;
       };
       return palindromeCheck;
   }
}

   // Write your code here

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
