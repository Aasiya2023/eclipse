package classwork;

import java.util.Scanner;

public class Tocountallvowelsinastring {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		int v=0;
		for (int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
		{
			v=v+1;
		}
		}
		System.out.println("total no. of vowels are:"+v);
		}
}
				




