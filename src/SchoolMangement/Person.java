package SchoolMangement;

public class Person {
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void dispp()
	{
		System.out.println("Person Details: ");
		System.out.println("Name : "+name);
		System.out.println("Age :" +age);
	}

}
