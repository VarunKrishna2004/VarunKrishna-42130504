package trailanderror;

public class sumofbesidenosinstring {

	public static void main(String[] args) {
		String s="21XYG34F";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			int a=0;
			while(Character.isDigit(c))
			{
				a=(a*10)+(c - '0');
				i++;
				c=s.charAt(i);
			}
			sum += a;
		}
		System.out.println(sum);
	}
}
