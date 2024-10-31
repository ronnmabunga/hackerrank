import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     * 1. INTEGER row
     * 2. INTEGER col
     * 3. 2D_BOOLEAN_ARRAY artArray
     */

    public static void solve(int row, int col, List<List<Boolean>> artArray) {
        // Don't forget to enter your name and student ID here:
        // 201720045 Ronn Michael I. Mabunga
        // Use the standard IO to print the answer. Enter code here:

        char[][] map = new char[row][col];
        for (int i = 0; i < row; i++) {
            Arrays.fill(map[i], ' ');
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int value = 0;
                if (!artArray.get(i).get(j)) {
                    System.out.print(" ");
                    continue;
                }
                try {
                    if (artArray.get(i - 1).get(j)) { // N - 1
                        value += 1;
                    }
                } catch (Exception ex) {
                }
                try {
                    if (artArray.get(i + 1).get(j)) { // S - 2
                        value += 2;
                    }
                } catch (Exception e) {
                }
                try {
                    if (artArray.get(i).get(j + 1)) { // E - 4
                        value += 4;
                    }
                } catch (Exception ex) {
                }
                try {
                    if (artArray.get(i).get(j - 1)) { // W - 8
                        value += 8;
                    }
                } catch (Exception ex) {
                }
                if (value == 0 || value == 1 || value == 2 || value == 4 || value == 8) {
                    map[i][j] = '.';
                } else if (value == 13) {
                    map[i][j] = '_';
                } else if (value == 14 || value == 12) {
                    map[i][j] = '-';
                } else if (value == 3 || value == 7 || value == 11) {
                    map[i][j] = '|';
                } else if (value == 5 || value == 10) {
                    map[i][j] = '\\';
                } else if (value == 9 || value == 6) {
                    map[i][j] = '/';
                }
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        HashMap<String, ArrayList<Integer>> neighbors = new HashMap();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Second part
                if (map[i][j] == ' ') {
                    continue;
                }
                String currname = (i) + "-" + (j);
                String topname = (i - 1) + "-" + (j);
                String leftname = (i) + "-" + (j - 1);
                int minnid = -2;
                int minsid = -2;
                int mineid = -2;
                int minwid = -2;
                if (neighbors.containsKey(topname)) {
                    mineid = neighbors.get(topname).get(2);
                    minwid = neighbors.get(topname).get(3);
                }
                if (neighbors.containsKey(leftname)) {
                    minnid = neighbors.get(leftname).get(0);
                    minsid = neighbors.get(leftname).get(1);
                }
                try {
                    if (!artArray.get(i - 1).get(j)) {
                        if (minnid == -2)
                            minnid = i * col + j;
                    } else {
                        minnid = -2;
                    }
                } catch (Exception e) {
                    if (minnid == -2)
                        minnid = i * col + j;
                }

                try {
                    if (!artArray.get(i).get(j - 1)) {
                        if (minwid == -2)
                            minwid = i * col + j;
                    } else {
                        minwid = -2;
                    }
                } catch (Exception e) {
                    if (minwid == -2)
                        minwid = i * col + j;
                }

                try {
                    if (!artArray.get(i + 1).get(j)) {
                        if (minsid == -2)
                            minsid = i * col + j;
                    } else {
                        minsid = -2;
                    }
                } catch (Exception e) {
                    if (minsid == -2)
                        minsid = i * col + j;
                }

                try {
                    if (!artArray.get(i).get(j + 1)) {
                        if (mineid == -2)
                            mineid = i * col + j;
                    } else {
                        mineid = -2;
                    }
                } catch (Exception e) {
                    if (mineid == -2)
                        mineid = i * col + j;
                }

                ArrayList<Integer> coords = new ArrayList();
                coords.add(minnid);
                coords.add(minsid);
                coords.add(mineid);
                coords.add(minwid);
                neighbors.put(currname, coords);
                if (minnid == -2)
                    minnid = 0;
                if (minsid == -2)
                    minsid = 0;
                if (mineid == -2)
                    mineid = 0;
                if (minwid == -2)
                    minwid = 0;
                System.out.println(minnid + " " + minsid + " " + mineid + " " + minwid);
            }
        }
        // System.out.println(neighbors);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int row = Integer.parseInt(firstMultipleInput[0]);

        int col = Integer.parseInt(firstMultipleInput[1]);

        List<List<Boolean>> artArray = new ArrayList<>();

        IntStream.range(0, row).forEach(i -> {
            try {
                artArray.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(e -> Integer.parseInt(e) != 0)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Result.solve(row, col, artArray);

        bufferedReader.close();
    }
}
