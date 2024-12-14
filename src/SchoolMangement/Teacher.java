package SchoolMangement;

public class Teacher extends Person {
	String subject;
	int salary;
	Teacher(String name,int age,String subject,int salary)
	{
		super(name,age); //super should be called first in constructor..
		this.subject=subject;
		this.salary=salary;
	}
	void dispteac()
	{
		dispp();
		System.out.println("Subject: "+subject);
		System.out.println("Salary: "+salary);
		ann();
	}
	void ann()
	{
		int ann=salary*12;
		System.out.println("Annual Salary: "+ann);
	}
}
