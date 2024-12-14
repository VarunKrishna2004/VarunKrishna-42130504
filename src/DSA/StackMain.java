package DSA;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
public class StackMain {
	public static void main(String[] args)
	{
		Stack n=new Stack();
		n.push(6);
		n.push(14);
		n.push(9);
		n.push(02);
		n.push(34);
		System.out.println(n.pop());
		System.out.println(n.pop());
		System.out.println("The Top most Value is "+n.peek());
		System.out.println(n.isempty());
		System.out.println(n.pop());
		System.out.println("The Top most value is "+n.peek());
		
	}

}
