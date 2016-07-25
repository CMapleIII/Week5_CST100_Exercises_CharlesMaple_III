
public class Faculty extends Employee
{
	public static String INSTRUCTOR = "Instructor";
	public static String ASSISTANT_PROFESSOR = "Assistant Professor";
	public static String ASSOCIATE_PROFESSOR = "Associate Professor";
	public static String PROFESSOR = "Professor";
	
	protected String rank;
	protected String officeHours;
	
	public Faculty(String name)
	{
		this(name, "7-3PM", "Employee");
	}
	
	public Faculty(String name, String officeHours, String rank)
	{
		super(name);
		this.rank = rank;
		this.officeHours = officeHours;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public void setRank()
	{
		this.rank = rank;
	}
	
	public String getOfficeHours()
	{
		return officeHours;
	}
	
	public void setOfficeHours()
	{
		this.officeHours = officeHours;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
