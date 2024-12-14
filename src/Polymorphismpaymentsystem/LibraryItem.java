package Polymorphismpaymentsystem;

abstract public class LibraryItem {
	abstract void displayinfo();
	void disp()
	{
		System.out.println("Non Abstracted Method");
	}

}
class Book extends LibraryItem 
{
	void displayinfo()
	{
		System.out.println("Abstracted, Book");
	}
}
class Magazine extends LibraryItem
{
	void displayinfo()
	{
		System.out.println("Abstracted, Magazine");
	}
}
