package classwork;
class Member 
{
	
		String name;
	    int age;
	  String address;
	 int salary;
	 
	 public void printDetails() 
	 {
	     System.out.println("Name: " + name);
	     System.out.println("Age: " + age);
	     System.out.println("Address: " + address);
	     System.out.println("Salary: " + salary);
	 }
}
	 class Worker extends Member
	 {
	     String specialization;
	   
	 }
	 class Manager extends Member
	 {
		

	    String department;
	    
	 }	    	
public class Classwork {

	public static void main(String[] args) {
			Worker w= new Worker() ;
	     w.name="Aasiya";
	    w.age=23;
	     w.address="Home";
	     w.salary=20000;
	     w.printDetails();
	    w.specialization="automation";
	     System.out.println("specialization"+w.specialization);
	     
	  Manager m=new Manager();
	     m.name="hanna";
	    m.age=20;
	   m.address="Earth";
	     m.salary=30000;
	    m.printDetails();
	     m.department="IT";
	     System.out.println("department"+m.department);
	}

}
