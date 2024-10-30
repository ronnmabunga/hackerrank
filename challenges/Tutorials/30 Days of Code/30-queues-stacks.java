import java.util.*;

class Solution {
    // Write your code here.
    LinkedList<Character> stack = new LinkedList();
    LinkedList<Character> queue = new LinkedList();

    void pushCharacter(Character c) {
        stack.add(c);
    }

    void enqueueCharacter(Character c) {
        queue.add(c);
    }

    Character popCharacter() {
        Character last = null;
        try {
            last = queue.peekLast();
            queue.removeLast();
        } catch (Exception e) {

        }
        return last;
    }

    Character dequeueCharacter() {
        Character first = null;
        try {
            first = queue.get(0);
            queue.removeFirst();
        } catch (Exception e) {

        }
        return first;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}