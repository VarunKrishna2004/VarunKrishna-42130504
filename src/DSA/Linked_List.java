package DSA;
class node{
	int data;
	node next;
	
	/*/node(int d)
	{
		data=d;
		next=null;
	}*/
}
public class Linked_List {
	node head = null;
	node temp = null;
	void insert(int d)
	{
		node n=new node();
		n.data=d;
		if(head==null)
		{
			head=n;
			temp=n;
		}
		else
		{
			temp.next=n;
			temp=n;
		}
	}
	int get(int pos)
	{
		node t=head;
		int i=1;
		while(t!=null && i<pos)
		{
			t=t.next;
			i++;
		}
		return t.data;
	}
	void remove_pos(int pos)
	{
		if(pos==1 && head!=null)
		{
			head =head.next;
			return;
		}
		node t=head;
		int i=1;
		while(t!=null && i<pos-1)
		{
			t=t.next;
			i++;
		}
   		if(t!=null && t.next!=null)
		{
   			t.next=t.next.next;
		}
		else  if(t!=null)
		{
			t.next=null;
		}
	}
	void display()
	{
		node t=head;
		while(t!=null)
		{
			System.out.print(t.data +" ");
			t =t.next;
		}
	}
}


