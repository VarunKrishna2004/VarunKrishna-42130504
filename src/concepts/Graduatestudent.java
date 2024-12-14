package concepts;

public class Graduatestudent extends Student {
		String thesis;
		Graduatestudent (String name,int id,String dp,String thesis)
		{
			this.thesis=thesis;
			this.name=name;
			this.id=id;
			this.dp=dp;
		}
		void displaythesis()
		{
			System.out.print("Thesis Name: "+ thesis);
		}

	}
