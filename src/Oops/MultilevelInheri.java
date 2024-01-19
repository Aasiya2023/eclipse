package Oops;
//multilevel inheritance

	class Dogm
	{
		public void eating()
		{
		System.out.println("dog is eating");
	}
	}
		class Catm extends Dogm
		{
			public void sleeping()
			{
			System.out.println("cat is sleeping");
		}
		}
		
class Tigerm extends Catm
{
	public void running()
	{
	System.out.println("lion is running");	
}
}
	public class MultilevelInheri {
	public static void main(String[] args) 
	{
		
		Tigerm t =new Tigerm();
		t.eating();
		t.running();
		t.sleeping();
		

	}

}
