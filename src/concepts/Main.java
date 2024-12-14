package concepts;

import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Name of the Student=");
		String name=in.next();
		System.out.println("Enter the ID=");
		int id=in.nextInt();
		System.out.println("Enter the Department=");
		String dp=in.next();
		in.nextLine();
		System.out.println("Enter the Thesis Name=");
		String thesis=in.nextLine();

	Graduatestudent g=new Graduatestudent(name,id,dp,thesis);
	g.displaystudentinfo();
	g.displaythesis();
	}
}
