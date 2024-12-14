package DSA;

class treenode
{
	int data;
	treenode left;
	treenode right;
}
public class Tree {
	treenode root=null;
	
	void insert(int d)//  1 2 3 4 5 6 7 8 9
	{
		treenode n=new treenode();
		n.data=d; 
	
		if(root==null)
		{
			root=n;
			return;
		}
		Queue a =new Queue();
		a.enqueue(root);
		while(!a.isempty())
		{
			treenode t=a.dequeue();
			if(t.left==null)
			{
				t.left=n;
				break;
			}
			else if(t.right==null)
			{
				t.right=n;
				break;
			}
			a.enqueue(t.left);
			a.enqueue(t.right);
		}
	}
}
