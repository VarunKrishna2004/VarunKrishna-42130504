package trailanderror;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int price=0,items=0,cost=0;
		try 
		{
			price=in.nextInt();
			items=in.nextInt();
			if(items<=0)
			{
				throw new ArithmeticException("Error:Number of items should not be less than 0");
			}
			cost = price/items;
			System.out.println("The Cost of product :"+ cost);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Enter a Valid quantity. Zero is not Applicable "+ e);
		}
		
		
	}
}
