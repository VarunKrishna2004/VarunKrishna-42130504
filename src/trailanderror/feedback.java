package trailanderror;

import java.util.*;
public class feedback {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n;
		String arr[]; 
		n=in.nextInt();
		in.nextLine();
		arr=new String[n];
		for(int i=0;i<n;i++)
		{
			String t=in.nextLine();
			arr[i]=(t.isEmpty())? null : t;
		}
		for(int i=0;i<n;i++)
		{
			try
			{
				if(arr[i]==null)
				{
					throw new NullPointerException();
				}
				System.out.println(arr[i]);
			}
			catch(NullPointerException e)
			{
				System.out.println("No Feedback Provided "+e);
			}
		}
	}

}
