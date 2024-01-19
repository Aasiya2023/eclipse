
package JavaAssignment;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int t=num;
		int rev=0;
		int rem;
		while(t>0)
		{
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		if (rev==num)		
{
			System.out.println("The entered number is palindrome");
			
}
		else
		{
			System.out.println("The entered number is not palindrome");
		}
	}
	}


