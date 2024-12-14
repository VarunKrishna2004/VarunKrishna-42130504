package concepts;

import java.util.*;
public class Swappingtwonosinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		//int i=0;
		//while(i<n-1)
		{
			int t=0;
			t=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=t;
			i++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");			
		}
	}

}
