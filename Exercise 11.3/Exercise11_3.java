/** Program: Exercise 11.3
* File:     Exercise11_3.java 
* Summary:  test program that creates objects 
* of AccountClass, savings, and checking
* and invokes their toString() methods.
* Author:  Charles Maple
* Date:     July 21, 2016
**/
public class Exercise11_3 
{
	private static AccountClass ACCOUNT;
	private static checking CHECKING;
	private static savings SAVINGS;

	public static void main(String[] args)
	{
		ACCOUNT = new AccountClass(111, 2000);
		CHECKING = new checking(112, 2500);
		SAVINGS = new savings(113, 3000);
		
		System.out.println(ACCOUNT);
		System.out.println(SAVINGS);
		System.out.println(CHECKING);
	}
}
