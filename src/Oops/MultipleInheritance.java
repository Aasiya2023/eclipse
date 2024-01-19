package Oops;
interface Bank1
{
	void deposit();
	void withdraw();
	
}

interface Bank2
{
	void interestrate();
	void balancedetails();
}

class ICICI implements Bank1,Bank2
{

	@Override
	public void interestrate() {
		System.out.println("interestrate");
	}

	@Override
	public void balancedetails() {
		
		System.out.println("balancedetails");
	}

	@Override
	public void deposit() {
		
		System.out.println("deposit");
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		ICICI OB=new ICICI();
		OB.balancedetails();
		OB.deposit();
		OB.interestrate();
		OB.withdraw();


	}

}
