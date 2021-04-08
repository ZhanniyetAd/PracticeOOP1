
public class Student {
    public int id;
    public String name;
    public String surname;
    public double gpa;
    public Student(){ }
    public Student(int id,String name,String surname,double gpa){

        this.id=id;

        this.name=name;

        this.surname=surname;

        this.gpa=gpa;
    }
    public String getStudentData(){
        return "ID: "+id+"\nName: "+name+"\nSurname: "+surname+"\nGPA: "+gpa;
    }
}