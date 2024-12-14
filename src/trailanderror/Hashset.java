package trailanderror;

import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Object[] a=new Object[5];
		a[0]= "Crciket";
		a[1]= 4;
		a[2]='R';
		a[4]= 6.4;
		System.out.println(a[0] +" "+a[1]+" "+a[2]);
		HashSet h=new HashSet<>();
		h.add("Republic");
		h.add("Virupaksha");
		h.add(33);
		h.add(14);
		System.out.println(h);*/
		Queue a=new LinkedList<>();
		a.add(1);
		a.add(21);
		a.add(44);
		a.add(66);
		a.add("Chill Bro");
		a.add("Winner Winner");
		a.add(" ");
		
		Iterator itr =a.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
