package basics;

public class Logicaloperator {

	
	public static void main(String[] args) {
		
		 boolean x=true;
		
		 boolean y=false;
		 
		 System.out.println(x&&y);
		 System.out.println(x||y);
		 System.out.println(!x);
		 System.out.println(!y);
		 
		 String username="abc";
		 String password="abcd";
		 System.out.println(username=="abc"&&password=="abcd");
		 System.out.println(username=="abc"||password=="abcd");
		 System.out.println(!(username=="abc"));
	}

}
