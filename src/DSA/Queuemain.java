package DSA;

public class Queuemain {
	public static void main(String[] args)
	{
		Queue k=new Queue();
		k.enqueue(2);
		k.enqueue(4);
		k.enqueue(6);
		k.enqueue(8);
		k.enqueue(14);
		System.out.println(k.dequeue());
		System.out.println("The front Element is "+k.front());		
		System.out.println(k.isempty());
		k.dequeue();
		k.dequeue();
		k.dequeue();
		System.out.println("The Front Element is "+k.front());
		System.out.println(k.isempty());
	}

}
