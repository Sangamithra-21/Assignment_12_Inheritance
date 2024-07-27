package Assignment_12_Inheritance;

class Student {
    int studentId;
    String name;
    int age;

    Student(int studentId)
    {
        this.studentId=studentId;

    }
    Student(int studentId,String name)
    {
        this.studentId=studentId;
        this.name=name;
    }
    Student(int studentId,String name,int age)
    {
        this.studentId=studentId;
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Student Id  : "+studentId);
    }
}
class ZSGSStudent extends Student{
    int batch;
    ZSGSStudent(int batch,int studentId)
    {
        super(studentId);
        this.batch=batch;
    }
    ZSGSStudent(int batch,int studentId,String name)
    {
        super(studentId,name);
        this.batch=batch;
    }
    ZSGSStudent(int batch,int studentId,String name,int age)
    {
        super(studentId,name,age);
        this.batch=batch;
    }
    void displayId()
    {
        super.display();
        System.out.println("Batch : "+batch);
    }
    void displayName()
    {
        super.display();
        System.out.println("Name  : "+name);
        System.out.println("Batch : "+batch);
    }
    void displaydetails()
    {
        super.display();
        System.out.println("Name  : "+name);
        System.out.println("Age   : "+age);
        System.out.println("Batch : "+batch);
    }



}
public class StudentsHierarchy {
    public static void main(String[] args) {
        Student s1=new Student(1);
        s1.display();
        System.out.println("------------------------------------------------------");
        ZSGSStudent s2=new ZSGSStudent(1,2,"Abi",23);
        s2.displaydetails();

    }

}
