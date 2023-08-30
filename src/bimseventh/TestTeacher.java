package bimseventh;
import java.util.*;
public class TestTeacher {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter teacherID, fullName, email, salary ");
        int teacherID = ob.nextInt();
        //ob.nextLine();///to clear buffer before reading
        String fullName = ob.next();
          String email = ob.next();
        double salary = ob.nextDouble();
        //ob.nextLine();
      
        
        
        teacher t = new teacher(teacherID, fullName, email, salary);
        t.setTeacherID(teacherID);
        t.setFullName(fullName);
        t.setEmail(email);
        t.setSalary(salary);
        System.out.println("Id:" + t.getTeacherID());
        System.out.println("Fullname:" + t.getFullName());
        System.out.println("Email:" + t.getEmail());
        System.out.println("Salary:" + t.getSalary());
    }
}