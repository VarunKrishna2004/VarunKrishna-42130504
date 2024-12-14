package trailanderror;

import java.util.*;
public class SumofString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s="21XYG34F2";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			if(Character.isDigit(c))
			{
				sum += (c - '0');
			}
		}
		System.out.println(sum);
	}
}