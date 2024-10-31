import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String line = inp.nextLine();
        int x = inp.nextInt();
        String shifted = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                shifted += (char) ((line.charAt(i) - 'A' + x) % 26 + 'A');
            } else if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                shifted += (char) ((line.charAt(i) - 'a' + x) % 26 + 'a');
            } else {
                shifted += line.charAt(i);
            }
        }
        System.out.println(shifted);
    }
}