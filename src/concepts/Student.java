package concepts;

public class Student {
	String name;
	int id;
	String dp;	
	
	/*public Student(String name,int id,String dp)
	{
		this.name=name;
		this.id=id;
		this.dp=dp;
	}*/
	public void displaystudentinfo()
	{
		System.out.println("Student Details: ");
		System.out.println("Name: "+ name);
		System.out.println("ID: "+ id);
		System.out.println("Department: "+ dp);
	}
}
