import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import java.nio.charset.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        md.update(s.getBytes(StandardCharsets.UTF_8));
        for (byte i : md.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();
    }
}
