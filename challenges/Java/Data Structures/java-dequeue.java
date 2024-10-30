    import java.util.*;
    import java.io.*;
    public class test {
        public static void main(String[] args) throws IOException{
            Scanner in = new Scanner(System.in);
            LinkedList<Integer> deque = new LinkedList();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int i = 0;
            st = new StringTokenizer(br.readLine());
            while(i++<m)
                deque.add(Integer.parseInt(st.nextToken()));
            HashSet<Integer> set = new HashSet();
            set.addAll(deque);
            int max = set.size();
            int temp = max;
            Integer tempVal;
            while(st.hasMoreTokens()){
                tempVal = deque.pollFirst();
                if(deque.indexOf(tempVal)==-1)
                    temp--;
                tempVal = Integer.parseInt(st.nextToken());
                if(deque.indexOf(tempVal)==-1)
                    temp++;
                deque.add(tempVal);
                max = (temp>max?temp:max);
            }
            System.out.println(max);

        }
    }



