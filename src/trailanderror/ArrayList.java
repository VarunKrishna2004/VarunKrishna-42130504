package trailanderror;

import java.util.Vector;
public class ArrayList {

	public static void main(String[] args) {
		//int x =20;
		/*Vector<Integer> vector =new Vector<>();
		vector.add(10);
		vector.add(20);
		System.out.print("Vector: "+ vector);*/
		//Integer 
		ArrayList<ArrayList> q = new ArrayList<>();
		//arr.add(21);
		for(int i=0;i<3;i++)
		{
			q.add(new ArrayList());
		}
		q.get(0).add(23);
		q.get(1).add("Aditya");
		q.get(1).add("Rohith");
		q.get(1).add("Mani Shasank");
		q.get(2).add(23.5);
		q.get(2).add(27.94);
		q.get(2).add(328.59);
		System.out.println(q.get(0));
		System.out.println(q.get(2).get(1));
	}
}
