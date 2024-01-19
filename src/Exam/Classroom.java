package Exam;

public class Classroom {
	
	    
	    private int rollNumber;
	    private String name;
	    private double marks;

	    
	    public void store(int rollNumber, String name, double marks) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.marks = marks;
	    }

	  
	    public void display() {
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	    }

	    public static void main(String[] args) {
	        
	        Classroom student = new Classroom();

	        
	        student.store(101, "Amrutha", 95.5);

	        
	        student.display();
	    }
	
	
	}


