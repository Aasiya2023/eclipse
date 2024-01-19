package Oops;


class Dogb
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}
	class Cath extends Dogb
	{
		public void sleeping()
		{
			System.out.println("cat is sleeping");
		}
	}
	class Lionb extends Dogb
	{
		public void running()
		{
			System.out.println("Lion is running");
		}
	}

public class HierarchialInheri {

	public static void main(String[] args) {
		Cath ob=new Cath();
		ob.sleeping();
		ob.barking();
		Lionb li=new Lionb();
		li.barking();
		li.running();
		
		
		//ob.eating();
		//ob.sleeping();
		
		//li.eating();
		//li.running();
		//li.sleeping();
		
		
	}

}
