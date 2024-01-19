package classwork;

class Monkey 
{
	public void jump()
	{
		System.out.println("jump");
		
	}
	public void bite()
	{
		System.out.println("bite");	
	}
}
	
	
class Human extends Monkey implements BasicAnimal {
    
    public void speak() 
    {
        System.out.println("speak");
    }

	@Override
	public void cat() 
	{
		
		 System.out.println("cat");
	}

	@Override
	public void sleep() 
	{
		 System.out.println("sleep");
	}

    
    }


interface BasicAnimal
{
	public void cat();
	public void sleep();
}

public class InterfaceClass2 {
    public static void main(String[] args) {
       
        Human h = new Human();
       

       
        h.bite(); 
        h.cat(); 
        h.jump(); 
        h.sleep(); 
        h.speak();
       
    }






	}


