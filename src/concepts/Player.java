package concepts;

public class Player {
	String Name;
	String Team;
	int Age;
	Player(String Name,String Team,int Age)
	{
		this.Name=Name;
		this.Team=Team;
		this.Age=Age;
	}
	void displayPlayerinfo()
	{
		System.out.println("PLAYER DETAILS: ");
		System.out.println("NAME: "+ Name);
		System.out.println("TEAM: "+Team);
		System.out.println("AGE: "+Age);
	}

}
