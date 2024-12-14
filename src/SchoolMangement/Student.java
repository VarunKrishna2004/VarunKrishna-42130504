package SchoolMangement;

public class Student extends Person {
	int id;
	float grade;
	Student(String name,int age,int id,float grade)
	{
		super(name,age);
		this.id=id;
		this.grade=grade;
	}
	void disstu()
	{
		dispp();
		System.out.println("Student Id: "+id);
		System.out.println("Grade: "+grade);
		percentage();
	}
	void percentage()
	{
		double percent=grade*100/10;
		System.out.println("Percentage: "+percent);
	}

}
