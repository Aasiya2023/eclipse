package Defaultpackage;

import java.util.Scanner;

public class Twodimensinalarray {

	public static void main(String[] args) {
		String arr[] [] =new String[3][2];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter ur name");
		for(int i=0;i<3;i++)
		{
			 for (int j=0;j<2;j++)
			 {
				 arr[i][j]=sc.next();
				 
			 }
		}
     System.out.println("entered values");
     for(int i=0;i<3;i++)
     {
    	 for (int j=0;j<3;j++)
    	 {
    		 System.out.print(arr[i][j]+" "); 
    	 }
    		 
    			 System.out.println();	 
    		 }
     }
	}
