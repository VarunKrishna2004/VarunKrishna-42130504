package concepts;

public class FastBowler extends Bowler {
	int averagespeed;
	FastBowler(String Name,String Team,int Age,int wickets,double bowlingaverage,int averagespeed)
	{
		super(Name,Team,Age,wickets,bowlingaverage);
		averagespeed=averagespeed;
		
	}
	void displayfastbowlerinfo()
	{
		System.out.println("Average Bowling Speed of the Player is : "+ averagespeed);
	}

}
