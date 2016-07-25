
public class Person 
{
	protected String name;
	protected String phoneNumber;
	protected String email;
	protected String address;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber()
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail()
	{
		this.email = email;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress()
	{
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
