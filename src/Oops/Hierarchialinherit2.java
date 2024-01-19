package Oops;
class Bank
{
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void deposit()
	{
		System.out.println("deposit");
	}
}

class Sbi extends Bank
{
	public void sbiinterest()
	{
		System.out.println("sbiinterest");	
	}
}

class Hdfc extends Bank
{
	public void loan()
	{
		System.out.println("hdfc loan");
	}
}
public class Hierarchialinherit2 {

	public static void main(String[] args) {
		Sbi obj=new Sbi();
				obj.deposit();
				obj.sbiinterest();
				Hdfc obj1=new Hdfc();
				obj1.deposit();
				obj1.withdraw();
				obj1.loan();

	}

}
