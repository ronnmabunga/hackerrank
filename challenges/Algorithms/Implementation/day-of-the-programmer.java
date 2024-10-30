import java.io.*;
import java.text.*;
import java.util.*;

class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String oldDate = "01.01." + year;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(oldDate));
        } catch (ParseException e) {
        }
        if (year < 1918) {
            if (year % 100 == 0 && year % 400 != 0)
                c.add(Calendar.DATE, 254);
            else
                c.add(Calendar.DATE, 255);
        } else if (year == 1918)
            c.add(Calendar.DATE, 268);
        else
            c.add(Calendar.DATE, 255);

        String newDate = sdf.format(c.getTime());
        return newDate;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
