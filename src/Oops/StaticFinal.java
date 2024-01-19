package Oops;
class SchoolDetails
{
	final String Schoolname="Luminar";
	static String department="English";
}
public class StaticFinal {

	public static void main(String[] args) {
		System.out.println(SchoolDetails.department);	
		
		System.out.println(SchoolDetails.department="Malayalam");
		System.out.println(SchoolDetails.department);
		//System.out.println(SchoolDetails);
		//SchoolDetails ob =new SchoolDetsails();
		//System.out.println(ob.Schoolname);
		//System.out.println(ob.Schoolname="bc");;

}
}
