package DSA;

class node
{
	int data;
	node next;
}
public class Queue {
	node front =null,rear=null;
	void enqueue(int k)
	{
		node n=new node();
		n.data=k;
		if(front==null)
		{
			front=n;
			rear=n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}
	}
	int dequeue()
	{
		int a=front.data;
		front = front.next;
		if(front==null)
		{
			rear=null;
		}
		return a;
	}
	int front()
	{
		return front.data;
	}
	boolean isempty()
	{
		return front==null;
	}

}
