package basics;

public class Switchclasswork {

	public static void main(String[] args) {
		int num1=40, num2=20,result;
		char op='*';
		switch(op)
		{
		case '+':result=num1+num2;
		System.out.println(result);
		break;
		case '-':result=num1=num2;
		System.out.println(result);
		break;
		case '*':result=num1*num2;
		System.out.println(result);
		break;
		case '/':result=num1/num2;
		System.out.println(result);
		break;
		default:System.out.println("invalid operator");
		}

	}

}
