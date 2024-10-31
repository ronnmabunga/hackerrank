import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Stack stack = new Stack();
        ArrayList<String> arr = new ArrayList();
        while (inp.hasNext()) {
            arr.add(inp.next());
        }
        for (int i = 0; i < arr.size(); i++) {
            if ("mul".equals(arr.get(i))) {
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                stack.push(a * b);
            } else if ("add".equals(arr.get(i))) {
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                stack.push(a + b);
            } else if ("sub".equals(arr.get(i))) {
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                stack.push(b - a);
            } else if ("mod".equals(arr.get(i))) {
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                stack.push(b % a);
            } else if ("div".equals(arr.get(i))) {
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                stack.push(b / a);
            } else if ("sqrt".equals(arr.get(i))) {
                int a = (int) stack.pop();
                stack.push((int) Math.sqrt(a));
            } else {
                int num = Integer.parseInt(arr.get(i));
                stack.push(num);
            }
        }
        System.out.println("" + (int) stack.pop());
    }
}