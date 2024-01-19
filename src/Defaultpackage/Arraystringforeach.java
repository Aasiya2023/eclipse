package Defaultpackage;

import java.util.Scanner;

public class Arraystringforeach {

	public static void main(String[] args) {
		String arr[] = new String[4];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ur names:");
		for(int i=0;i<4;i++)
		{
			arr[i] = sc.next();
			
		}
		System.out.println("the name is");
		for(String s:arr) //for(datatype v:arrayname)
		{
			System.out.println(s);
		}
	}

}
