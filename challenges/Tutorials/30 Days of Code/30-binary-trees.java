import java.util.*;
import java.io.*;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    static void levelOrder(Node root) {
        // Write your code here
        LinkedList<Node> print = new LinkedList();
        print.add(root);
        while (print.size() > 0) {
            addChildsOfNode(print, print.getFirst());
        }
        System.out.println();
    }

    static void addChildsOfNode(LinkedList<Node> print, Node root) {
        System.out.print(root.data + " ");
        print.remove(root);
        if (root.left != null) {
            print.add(root.left);
        }
        if (root.right != null) {
            print.add(root.right);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}