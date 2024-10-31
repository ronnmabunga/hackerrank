import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        inp.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = inp.nextLine();
        }
        for (int i = 0; i < N; i++) {
            divProc(S[i]);
        }
        inp.close();
    }

    static void divProc(String input) {
        if (input.length() % 2 == 0) {
            System.out.println(
                    proc(input.substring(0, input.length() / 2), input.substring(input.length() / 2, input.length())));
        } else {
            System.out.println(-1);
        }
        // int left = proc(input.substring(0, (input.length()+1)/2),
        // input.substring((input.length()+1)/2, input.length()));
        // int right = proc(input.substring(0, (input.length()-1)/2),
        // input.substring((input.length()-1)/2, input.length()));
    }

    static int proc(String a, String b) {
        // System.out.println(a);
        // System.out.println(b);
        int count = 0;
        while (a.length() > 0) {
            if (b.indexOf(a.charAt(0)) == -1) {
                a = removeCharAt(0, a);
                count++;
            } else {
                b = removeCharAt(b.indexOf(a.charAt(0)), b);
                a = removeCharAt(0, a);
            }
        }
        return count;
    }

    static String removeCharAt(int a, String str) {
        if (a == 0) {
            return str.substring(1, str.length());
        }
        if (a == str.length() - 1) {
            return str.substring(0, str.length() - 1);
        }
        return str.substring(0, a) + str.substring(a + 1, str.length());
    }
}