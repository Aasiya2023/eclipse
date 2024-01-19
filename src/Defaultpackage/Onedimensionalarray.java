package Defaultpackage;

import java.util.Scanner;

public class Onedimensionalarray {

	public static void main(String[] args) {
		
		int a []=new int[6];//declare array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your numbers:");
		
		for(int i=0;i<6;i++) //i=index no// to read numbers
			
		{
			a[i] = sc.nextInt(); // store values to array
			
		}
		System.out.println("entered no's are:");
		for(int i=0;i<6;i++) // to print the numbers
		{
		System.out.println(a[i]);

}
	}

}
