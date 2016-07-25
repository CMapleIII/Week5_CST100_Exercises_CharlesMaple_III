
public class Employee extends Person
{
	protected double salary;
	protected MyDate dateHired;
	protected String Office;
	
	public Employee(String name)
	{
		this(name, 0, "none", new MyDate());
	}
	
	public Employee(String name, double salary, String office, MyDate dateHired)
	{
		super(name);
		this.salary = salary;
		this.dateHired = dateHired;
		this.Office = office;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary()
	{
		this.salary = salary;
	}
	
	public MyDate getDateHired()
	{
		return dateHired;
	}
	
	public void setDateHired(MyDate dateHired)
	{
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
