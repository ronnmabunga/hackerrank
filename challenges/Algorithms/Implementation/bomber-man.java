import java.io.*;
import java.util.*;

class Solution {

    // Complete the bomberMan function below.
    static String[] bomberMan(int n, String[] grid) {
        if (n == 1) {
            return grid;
        } else if (n % 2 == 0) {
            String bombedstring = grid[0].replaceAll(".", "O");
            for (int i = 0; i < grid.length; i++) {
                grid[i] = bombedstring;
            }
            return grid;
        } else if (n % 4 == 1) {
            char[][] g = new char[grid.length][grid[0].length()];
            char[][] h = new char[grid.length][grid[0].length()];
            for (int i = 0; i < g.length; i++) {
                g[i] = grid[i].toCharArray();
            }
            int m = 0;
            while (m++ < 5) {
                for (int i = 0; i < g.length; i++) {
                    Arrays.fill(h[i], 'O');
                }
                for (int i = 0; i < g.length; i++) {
                    for (int j = 0; j < g[i].length; j++) {
                        if (m != 0 && m % 2 == 0 && g[i][j] == '.') {
                            g[i][j] = 'O';
                            continue;
                        }
                        if (g[i][j] == 'O')
                            g[i][j] = '2';
                        else if (g[i][j] == '2')
                            g[i][j] = '1';
                        else if (g[i][j] == '1') {
                            h[i][j] = '.';
                            if (j == 0) {
                                try {
                                    h[i][j + 1] = '.';
                                } catch (Exception e) {
                                }
                            } else if (j == g[i].length - 1) {
                                try {
                                    h[i][j - 1] = '.';
                                } catch (Exception e) {
                                }
                            } else {
                                try {
                                    h[i][j + 1] = '.';
                                } catch (Exception e) {
                                }
                                try {
                                    h[i][j - 1] = '.';
                                } catch (Exception e) {
                                }
                            }
                            if (i == 0) {
                                try {
                                    h[i + 1][j] = '.';
                                } catch (Exception e) {
                                }
                            } else if (i == g.length - 1) {
                                try {
                                    h[i - 1][j] = '.';
                                } catch (Exception e) {
                                }
                            } else {
                                try {
                                    h[i - 1][j] = '.';
                                } catch (Exception e) {
                                }
                                try {
                                    h[i + 1][j] = '.';
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
                for (int i = 0; i < g.length; i++) {
                    for (int j = 0; j < g[i].length; j++) {
                        if (h[i][j] == '.')
                            g[i][j] = '.';
                    }
                }
            }
            for (int i = 0; i < g.length; i++) {
                for (int j = 0; j < g[i].length; j++) {
                    if (g[i][j] != '.') {
                        g[i][j] = 'O';
                    }
                }
            }
            for (int i = 0; i < g.length; i++) {
                grid[i] = new String(g[i]);
            }
            return grid;

        } else if (n % 4 == 3) {
            char[][] g = new char[grid.length][grid[0].length()];
            for (int i = 0; i < g.length; i++) {
                Arrays.fill(g[i], 'O');
            }
            for (int i = 0; i < g.length; i++) {
                for (int j = 0; j < g[i].length; j++) {
                    if (grid[i].charAt(j) == 'O') {
                        g[i][j] = '.';
                        if (j == 0) {
                            try {
                                g[i][j + 1] = '.';
                            } catch (Exception e) {
                            }
                        } else if (j == g[i].length - 1) {
                            try {
                                g[i][j - 1] = '.';
                            } catch (Exception e) {
                            }
                        } else {
                            try {
                                g[i][j + 1] = '.';
                            } catch (Exception e) {
                            }
                            try {
                                g[i][j - 1] = '.';
                            } catch (Exception e) {
                            }
                        }
                        if (i == 0) {
                            try {
                                g[i + 1][j] = '.';
                            } catch (Exception e) {
                            }
                        } else if (i == g.length - 1) {
                            try {
                                g[i - 1][j] = '.';
                            } catch (Exception e) {
                            }
                        } else {
                            try {
                                g[i - 1][j] = '.';
                            } catch (Exception e) {
                            }
                            try {
                                g[i + 1][j] = '.';
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < g.length; i++) {
                grid[i] = new String(g[i]);
            }
            return grid;
        }
        return grid;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] rcn = scanner.nextLine().split(" ");

        int r = Integer.parseInt(rcn[0]);

        int c = Integer.parseInt(rcn[1]);

        int n = Integer.parseInt(rcn[2]);

        String[] grid = new String[r];

        for (int i = 0; i < r; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = bomberMan(n, grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
