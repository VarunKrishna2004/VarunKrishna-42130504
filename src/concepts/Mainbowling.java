package concepts;

import java.util.*;
public class Mainbowling {
	public static void main(String[] args)
	{
		/*Scanner in=new Scanner(System.in);
		String Name="BHUVANESHWAR KUMAR";
		String Team="INDIA";
		int Age=32;
		int wickets=114;
		double bowlingaverage=6.14;
		int averagespeed=140;*/
	
	FastBowler b=new FastBowler("Bhuvanehwar Kumar","India",32,114,6,140);
	b.displayPlayerinfo();
	b.displaybowlerinfo();
	b.displayfastbowlerinfo();
	}
}
