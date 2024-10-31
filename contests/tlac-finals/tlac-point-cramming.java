import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     * 1. INTEGER time
     * 2. INTEGER requiredPoints
     * 3. INTEGER_ARRAY eventTime
     * 4. INTEGER_ARRAY eventPoints
     */

    public static int solve(int currentPts, int time, List<Integer> eventTime, List<Integer> eventPoints, int n) {
        if (eventTime.isEmpty() || time == 0) {
            return currentPts;
        }
        int currmax = currentPts;
        for (int i = 0; i < n; i++) {
            LinkedList<Integer> eventTimeNew = new LinkedList();
            LinkedList<Integer> eventPointsNew = new LinkedList();
            if (time - eventTime.get(i) >= 0) {
                eventTimeNew.addAll(eventTime);
                eventPointsNew.addAll(eventPoints);
                eventTimeNew.remove(i);
                eventPointsNew.remove(i);
                Integer sol = solve(currentPts + eventPoints.get(i), time - eventTime.get(i), eventTimeNew,
                        eventPointsNew, n - 1);
                if (sol > currmax) {
                    currmax = sol;
                }
            } else {
                continue;
            }
        }
        return currmax;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int time = Integer.parseInt(firstMultipleInput[0]);

        int requiredPoints = Integer.parseInt(firstMultipleInput[1]);

        int arraySize = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> eventTime = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> eventPoints = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Integer sol = Result.solve(0, time, eventTime, eventPoints, arraySize);
        System.out.print(sol);
        if (sol >= requiredPoints) {
            System.out.println(" true");
        } else {
            System.out.println(" false");
        }
        bufferedReader.close();
    }
}
