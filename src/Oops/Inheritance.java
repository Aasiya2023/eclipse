package Oops;

//single inheritance
class Dog
{
	public void barking()
	{
	System.out.println("dog is barking");
}
}
	class Cat extends Dog
	{
		public void sleeping()
		{
		System.out.println("cat is sleeping");
	}
	}

public class Inheritance {
	public static void main (String[] args)

{
 Cat c=new Cat();
 c.sleeping();
 c.barking();
}
}
	

	



