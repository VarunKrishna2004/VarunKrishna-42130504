package concepts;

public class Bowler extends Player{
	int wickets;
	double bowlingavgerage;
	Bowler(String Name,String Team,int Age,int wickets,double bowlingaverage)
	{
		super(Name,Team,Age);
		this.wickets=wickets;
		this.bowlingaverage=bowlingaverage;		
	}
	void displaybowlerinfo()
	{
		System.out.println("No of Wickets Taken by Bowler: "+ wickets);
		System.out.println("The Bowling average of the bowler is "+ bowlingaverage);
	}

}
