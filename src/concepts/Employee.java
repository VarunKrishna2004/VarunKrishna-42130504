package concepts;

public class Employee {
	int Id,salary;
	String Name,position;
	Employee(int Id,String Name,String position,int salary)
	{
		this.Id=Id;
		this.Name=Name;
		this.position=position;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Employee ID: "+Id);
		System.out.println("Name: "+Name);
		System.out.println("Position: "+position);
		System.out.println("Salary: "+salary);
	}
	void LPA()
	{
		int LPA=salary*12;
		System.out.println("LPA:"+LPA)
	}

}
