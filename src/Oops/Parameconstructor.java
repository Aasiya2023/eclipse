package Oops;
//passing values to variables using constructor
public class Parameconstructor {
	int empid;
	int salary;
	String designation;
	public Parameconstructor(int id,int sal,String desig) //constructor passing args(empid ,sakary,designation
	{
		empid=id;                //this.empid=empid;to refer we use this pointer
		salary=sal;
		designation="desig";
	}
	public static void main (String[] args) {
		Parameconstructor ob1=new Parameconstructor(112,30000,"Developer");
		System.out.println(ob1.empid);
		System.out.println(ob1.salary);
		System.out.println(ob1.designation);	
	}
	}
		
