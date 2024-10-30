import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
class Priorities{
    List<Student> getStudents(List<String> events){
        StringTokenizer st; String name; double cgpa; int id;
        PriorityQueue<Student> studentqueue = new PriorityQueue<>(new StudentComparator());
        List<Student> students = new LinkedList();
        for(String event:events){
            if(event.equals("SERVED")){
                studentqueue.poll();
            }else{
                st = new StringTokenizer(event);
                name = st.nextToken();name = st.nextToken();
                cgpa = Double.parseDouble(st.nextToken());
                id = Integer.parseInt(st.nextToken());
                studentqueue.add(new Student(id,name,cgpa));
            }
        }
        while(!studentqueue.isEmpty())
            students.add(studentqueue.poll());
        return students;
    }
}
class StudentComparator implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.getCGPA()==b.getCGPA()){
            if(a.getName().equals(b.getName()))
                return a.getID() - b.getID();
            else
                return a.getName().compareTo(b.getName());
        }
        else
            return (a.getCGPA() < b.getCGPA()?1:-1);
    }
}
class Student{
    int id;
    String name;
    double cgpa;
    Student(int id, String name, double cgpa){
        this.id = id; this.name=name; this.cgpa=cgpa;
    }
    int getID(){return id;}
    String getName(){return name;}
    double getCGPA(){return cgpa;}
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}