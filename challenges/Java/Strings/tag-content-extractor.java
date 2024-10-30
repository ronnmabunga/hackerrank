import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		String regex = "\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
            Pattern p = Pattern.compile(regex);
			String line = in.nextLine();
            boolean result = false;
			Matcher m = p.matcher(line);
          	while (m.find()) {
                System.out.println(m.group(2));
                result = true;
            }
            if(!result)
                System.out.println("None");
    
			testCases--;
		}
	}
}



