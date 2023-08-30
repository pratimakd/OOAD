
package bimseventh;
class Person{
    String firstName,lastName;
    int age;  
    Person(String firstName, String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        
}
    void showInfo(){
        System.out.println("firstName:"+firstName);
        System.out.println("lastName:"+lastName);
        System.out.println("Age:"+age);
    }
    void showInfo(int id) {
        System.out.println("Id:"+id);
        
        
    }
}
class Student extends Person{
    String faculty;
    Student(String firstName,String lastName,int age,String faculty){
        super(firstName,lastName,age);
        this.faculty=faculty;
        
    }   
    void showInfo(int id){
         System.out.println("Id:"+id);
    }
   
    }

class Teacher extends Person{
    double salary;
    Teacher(String firstName,String lastName,int age,double salary){
        super(firstName,lastName,age);
        this.salary=salary;
    }
    void showInfo(){
        super.showInfo();
        System.out.println("salary"+salary);
    }
}
public class inheritance{
    public static void main(String[] args) {
        Student ob=new Student("Hari","karki",22,"bim");
        Teacher ob1=new Teacher("Ram","shrestha",40,25000);
       
        ob1.showInfo();
        ob1.id(1);
    }
}