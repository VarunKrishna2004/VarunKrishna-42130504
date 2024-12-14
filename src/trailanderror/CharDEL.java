package trailanderror;

import java.util.*;
public class CharDEL {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s="21EFXYF34";
		String a="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='G' || s.charAt(i)=='F' || s.charAt(i)=='G')
			{
				continue;
			}
			else if(s.charAt(i)=='E' && i<s.length()-1 && s.charAt(i+1)=='F')
			{
				i++;
				continue;
			}
			a +=s.charAt(i);
		}
		System.out.println(a);		
	}
}
