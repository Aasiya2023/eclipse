package Oops;
interface whatsappcalls
{
	void calls();
	void mute();
	void disconnect();
}

class Audiocalls implements whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("whatsappcalls");	}

	@Override
	public void mute() {
		
		System.out.println("whatsappcall was muted");
	}

	@Override
	public void disconnect() {
		System.out.println("whatsapp call was disconnected");
		
		
	}
	
}
class Videocalls implements whatsappcalls
{

	@Override
	public void calls() {
		
		System.out.println("whatsappcalls");
	}

	@Override
	public void mute() {
		System.out.println("video call muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("video call disconnected");
		
	}
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		Audiocalls a=new Audiocalls();
		a.calls();
		a.mute();
		a.disconnect();
		Videocalls v=new Videocalls();
		v.calls();
		v.mute();
		v.disconnect();
		whatsappcalls ob=new Audiocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		ob=new Videocalls();
		ob.mute();
		ob.calls();
		ob.disconnect();

	}

}
