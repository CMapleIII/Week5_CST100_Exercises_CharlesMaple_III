import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate 
{
	private int year;
	private int month;
	private int day;
	
	public MyDate()
	{
		GregorianCalendar clndr = new GregorianCalendar();
		year = clndr.get(Calendar.YEAR);
		month = clndr.get(Calendar.MONTH);
		day = clndr.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(long elapsedTime)
	{
		GregorianCalendar clndr = new GregorianCalendar();
		clndr.setTimeInMillis(elapsedTime);
		year = clndr.get(Calendar.YEAR);
		month = clndr.get(Calendar.MONTH);
		day = clndr.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear()
	{
		this.year = year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth()
	{
		this.month = month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setDay()
	{
		this.day = day;
	}
	
	public void setDate(long elapsedTime)
	{
		GregorianCalendar clndr = new GregorianCalendar();
		clndr.setTimeInMillis(elapsedTime);
		year = clndr.get(Calendar.YEAR);
		month = clndr.get(Calendar.MONTH);
		day = clndr.get(Calendar.DAY_OF_MONTH);
	}
}
