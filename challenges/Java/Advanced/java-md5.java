import java.util.*;
import java.math.*;
import java.security.*;

class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] sMD = md.digest(s.getBytes());
        BigInteger sBI = new BigInteger(1, sMD);
        String hashed = sBI.toString(16);
        while (hashed.length() < 32)
            hashed = "0" + hashed;
        System.out.println(hashed);
        in.close();
    }
}
