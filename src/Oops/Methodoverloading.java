package Oops;
//same name but arguments different

public class Methodoverloading {
public void add(int a ,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a ,int b,int c)
{
	int d=a+b+c;
	System.out.println(d);
}
	public static void main(String[] args) {
		Methodoverloading ov=new Methodoverloading ();
		ov.add(3, 4);
		ov.add(5, 6,7);

	}

}
