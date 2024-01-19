package classwork;

import java.util.Scanner;

public class ToprintFibnacciSeries {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a+"");
		
		System.out.print(b+"");
		for(int i=3;i<=n;i++)
		{
			int c=a+b;
			System.out.println(c+"");
			a=b;
			b=c;
		}
	}
}
