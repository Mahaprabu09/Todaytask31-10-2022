package day31102022;

public class swapWithoutThridVaribale {
	public static void main(String[]args)
	{
		int a=70;
		int b=34;
	    System.out.println("Before swap A "+a+" and B "+b);
	
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("After swap A "+a+" and B "+b);
	}
}
