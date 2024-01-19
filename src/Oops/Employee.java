package Oops;

public class Employee {
int empid;
int salary;
String empname;
int deptno;


public void display ()  //method
{
	System.out.println(empid);
	System.out.println(salary);
	System.out.println(empname);
	System.out.println(deptno);
}


public static void main (String[] args) {  //main method
	
	Employee emp =new Employee();
	emp.deptno=2;
	emp.empid=1;
	emp.empname="Anu";
	emp.salary=70000;
	emp.display();
}
}
