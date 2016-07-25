/** Program: Exercise 11.3
* File:     checking.java 
* Summary:  test program that creates objects 
* of AccountClass, savings, and checking
* and invokes their toString() methods.
* Author:  Charles Maple
* Date:     July 21, 2016
**/
public class checking extends AccountClass
{
	protected double OVERDRAFT_LIMIT = -100;
	
	public checking(int id, double balance)
	{
		super(id, balance);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(balance - amount >= OVERDRAFT_LIMIT)
		{
			super.withdraw(amount);
		}
	}
	
	@Override
	public String toString()
	{
		return "checking{" + "balance=" + balance + '}';
	}
}
