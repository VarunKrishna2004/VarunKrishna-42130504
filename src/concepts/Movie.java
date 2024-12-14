package concepts;

public class Movie {
	String title;
	String director;
	String genre;
	float rating;
	Movie(String title,String director,String genre,float rating)
	{
		this.title=title;
		this.director=director;
		this.genre=genre;
		this.rating=rating;
	}
	public void displaydetails()
	{
		System.out.println("Movie Name: "+title);
		System.out.println("Director: "+director);
		System.out.println("Genre: "+genre);
		System.out.println("Rating: "+rating);
	}
	public void updaterating(float rating)
	{
		this.rating = rating;
	}
}
