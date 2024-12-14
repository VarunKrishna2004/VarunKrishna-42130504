package DSA;

public class Main {
	public static void main(String[] args)
	{
		
		
		Linked_List l=new Linked_List();
		for(int i=1;i<=4;i++)
		{
			l.insert(i);
		}
		l.display();
		l.remove_pos(3);
		System.out.println();
		l.display();
	}
}
