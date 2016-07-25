/** 
*Program: The Person, Student, Employee, 
*Faculty, and Staff classes
*File: Exercise11_2.java
*Summary: creates a Person, Student, Employee, 
*Faculty, and Staff, and invokes their toString() 
*methods.
*Author: Charles Maple III
*Date: July 23,2016 
**/
public class Exercise11_2 
{
	public static void main(String[] args)
	{
		Person person = new Person("person");
		Student student = new Student("student");
		Faculty faculty = new Faculty("faculty");
		Employee employee = new Employee("employee");
		Staff staff = new Staff("staff");
		
		System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
	}
}
