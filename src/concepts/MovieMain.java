package concepts;

import java.util.*;
public class MovieMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m=new Movie("Bahubali","SSR","Fanatasy",9.6f);
		m.updaterating(9.5f);
		Movie m1=new Movie("Atharintiki Daredi","Trivikram","Family Drama",9);
		m.displaydetails();
		m1.displaydetails();
	}

}
