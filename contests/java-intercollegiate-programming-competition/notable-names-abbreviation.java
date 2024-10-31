import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        if (!(name.charAt(0) == '-'))
            System.out.print(name.charAt(0));
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) == '-') {
                System.out.print(name.charAt(i + 1));
            }
        }
    }
}