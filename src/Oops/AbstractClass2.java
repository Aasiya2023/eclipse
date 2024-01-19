package Oops;
abstract class Google
{
	abstract void search();
	public void message()
	{
		System.out.println("thank u for using Google");
	}
}

class Searchall extends Google
{
	@Override
	void search() {
	System.out.println("search all details");
}
}
class SearchImage extends Google
{
	@Override
	void search() {
		System.out.println("search all images");
}
	class SearchVedio extends Google
	{
		@Override
		void search() {
			System.out.println("search all vedios");
		}
		
public class AbstractClass2 {

	public static void main(String[] args) {
		Searchall s1 =new Searchall();
		s1.message();
		s1.search();
		
		SearchImage s2=new SearchImage();
		s2.search();
		s2.message();
		
		SearchVedio s3=new SearchVedio();
		s3.search();
		s3.message();
	}

	}
	}
}



