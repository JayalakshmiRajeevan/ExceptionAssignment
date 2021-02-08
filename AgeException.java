package agetestapp;

public class AgeException extends RuntimeException
{
	public AgeException(String a)
	{
		super(a);
		System.out.println("AgeException Constructor");
	}
}
