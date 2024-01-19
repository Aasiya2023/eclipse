package Oops;

class A
{
	void m1()
	{
		int a=10;
		System.out.println(a);
	}
}

class B extends A
{
	void m1()
	{
		int a=20;
		System.out.println(a);
	}
}
public class PolyMethOverriding {

	public static void main(String[] args) {
		B obj=new B();
		obj.m1();
	}

}
