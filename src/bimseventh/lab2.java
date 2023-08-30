package bimseventh;
public class lab2{
    private int teacherID;
    private String fullName, email;
    private Double salary;
    lab2(int id, String f, String e, double s){
        teacherID=id;
        fullName=f;
        email=e;
        salary=s;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    
    public lab2(int teacherID, String fullName, String email, Double salary) {
        this.teacherID = teacherID;
        this.fullName = fullName;
        this.email = email;
        this.salary = salary;
    }

    public lab2 setTeacher(lab2 object){
        lab2 reference;
        reference=object;
        return object;
    }
   public  lab2() {
    
}
}