package Oops;

//default constructor
public class Empconstructor {
//define class variables
	
	int empid;
	int salary;
	String designation;
	
	//constructor
	
	public Empconstructor()
	
	{
		empid=4;
		salary=10000;
		designation="developer";
		
	}
	




//public void employee()

public static void main (String[] args) {
	Empconstructor ob=new Empconstructor(); //cfeate object to invoke constructor
	System.out.println(ob.empid);
	System.out.println(ob.salary);
	System.out.println(ob.designation);	
}
}