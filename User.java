package agetestapp;

public class User 
{
		void Age(int age) throws AgeException
		{
		if(age<18)
		{
			throw new AgeException("Not eligible");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
		}
}
