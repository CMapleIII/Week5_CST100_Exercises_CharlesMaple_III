/** Program: Exercise 11.3
* File:     savings.java 
* Summary:  test program that creates objects 
* of AccountClass, savings, and checking
* and invokes their toString() methods.
* Author:  Charles Maple
* Date:     July 21, 2016
**/
public class savings extends AccountClass
{
	protected double OVERDRAFT_LIMIT = 0;
	
	public savings(int id, double balance)
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
		return "savings{" + "balance=" + balance + '}';
	}
}
