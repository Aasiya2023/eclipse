package Exam;
class Student {
    private String studentName;
    private int marks;
    
    public Student(String studentName, int marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
    }
}
class Teacher extends Student implements Principal {
    private String department;

    public Teacher(String studentName, int marks, String department) {
        super(studentName, marks);
        this.department = department;
    }

    public void displayTeacherDetails() {
        super.displayStudentDetails();
        System.out.println("Department: " + department);
    }
    
    @Override
    public void join() {
        System.out.println("Teacher joined as Principal");
    }

    @Override
    public void resign() {
        System.out.println("Teacher resigned as Principal");
    }
}

interface Principal {
    void join();
    void resign();
}

public class Question3 {

	public static void main(String[] args) {
Teacher teacher = new Teacher("Amrutha", 35, "Math");
        
       
        teacher.displayTeacherDetails();

        
        teacher.join();
        teacher.resign();
    }


	}


