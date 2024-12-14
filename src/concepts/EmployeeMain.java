package concepts;
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args)
	{
		Employee m=new Employee(140634,"Neeraj","GET",50000);
		Employee n=new Employee(2203,"Satya","CEO",6000000);
		m.display();
		m.LPA();
		n.display();
		n.LPA();
	}

}
