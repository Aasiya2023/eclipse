package Defaultpackage;

public class Stringpgrm {



	public static void main(String[] args) {
		
		//length of a string
		String s ="welcome";
		System.out.println(s.length());
		
	int w=	s.length();
	System.out.println("length is"+w);
		
		// for joining  2 string
    String s1 ="hello";
    String s2 ="world";
    System.out.println(s1.concat(s2));
    System.out.println(1+2+s1);
   System.out.println(s1+1+2);
	
   
   String s5 ="LUMINAR123";
   System.out.println(s5.toLowerCase());
   System.out.println(s5.toUpperCase());
   System.out.println(s5.toUpperCase());
   System.out.println(s5.endsWith("3"));
   System.out.println(s5.startsWith("3"));
   
   // compare two strings
   String a ="abc";
   String b="Abc";
   System.out.println(a.equals(b));
   System.out.println(a.equalsIgnoreCase(b));
	
   //trim
   String q=" hello ";
   System.out.println(q);
   System.out.println(q.trim());
   
   //extract portion
   String y= "Welcome";
   System.out.println(y.substring(3));
   System.out.println(y.substring(0,4));
   
   // words or char is present or not
   
   String x="Welcome to Luminar";
   System.out.println(x.contains("Luminar"));
   
   //replace
   System.out.println(x.replace("el", "xy"));
   
   //to display a particular character
   
   String z ="welcome";
System.out.println(z.charAt(4));
   
//split
String w1="welcome to luminar";
String[] words =w1.split(" ");
for (String l: words)
{
	System.out.println(l);
}
	
		   
 // to char array
String t ="hello";
char[] c1=t.toCharArray();
for(char v1:c1);
{
	System.out.println(c1);
}
	}
}

