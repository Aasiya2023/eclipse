package Oops;

class Parent
{
	public void phone()
	{
		System.out.println("nokia");
	}
}

class Child extends Parent
{
	public void phone()
	{
		System.out.println("iphone");
		super.phone();  //use keyword 'super' to inherit parent class
	}
}
public class PolyMethOverriding2 {

	public static void main(String[] args) {
		Child obj =new Child();
		obj.phone();

	}

}
