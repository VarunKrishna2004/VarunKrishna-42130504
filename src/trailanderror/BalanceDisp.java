package trailanderror;
import java.util.*;
public class BalanceDisp {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		double income=0.0;
		double expenses=0.0;
		while(true)
		{
			try
			{
				System.out.println("Enter your Monthly Income");
				String income1=in.nextLine();
				income =Double.parseDouble(income1);
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter a valid Numeric Value");
			}			
		}
		while(true)
		{
			try
			{
				System.out.println("Enter your Monthly Expenses");
				String expense=in.nextLine();
				expenses=Double.parseDouble(expense);
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter a Valid Numeric Value");
			}
		}
		double balance=income-expenses;
		System.out.println("Remaining Balance: "+balance);
	}

}
