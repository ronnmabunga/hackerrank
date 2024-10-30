import java.io.*;
import java.util.*;

class Solution {

    // Complete the beautifulPairs function below.
    static int beautifulPairs(int[] A, int[] B) {
        HashSet<String> a = new HashSet();
        HashSet<String> b = new HashSet();
        HashSet<String> c = new HashSet();
        for (int As : A) {
            int i = 0;
            while (true) {
                if (a.contains(As + "-" + i)) {
                    i++;
                } else {
                    a.add(As + "-" + i);
                    break;
                }
            }
        }
        for (int Bs : B) {
            int i = 0;
            while (true) {
                if (b.contains(Bs + "-" + i)) {
                    i++;
                } else {
                    b.add(Bs + "-" + i);
                    c.add(Bs + "-" + i);
                    break;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
        int bsize = b.size();
        b.removeAll(a); // meron kay B na wala kay A
        a.removeAll(c); // meron kay A na wala kay B
        System.out.println(a);
        System.out.println(b);
        int count = bsize - b.size();
        System.out.println(count);
        if (bsize == B.length && a.size() <= 0) {
            count--;
        }
        System.out.println(count);
        if (b.size() > 0 && a.size() > 0) {
            count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int AItem = Integer.parseInt(AItems[i]);
            A[i] = AItem;
        }

        int[] B = new int[n];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        int result = beautifulPairs(A, B);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
