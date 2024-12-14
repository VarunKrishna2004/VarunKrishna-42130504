package Polymorphismpaymentsystem;

abstract public class Payment {
	abstract void processpayment();
	void cashdetails()
	{
		System.out.println("No Abstracted Method");
	}
}
	class CardPayment extends Payment
	{
		void processpayment()
		{
			System.out.println("Card Payment process");
		}
		void cashdetails()
		{
			System.out.println("Abstract Method");
		}
	}
	class CashPayment extends Payment
	{
		void processpayment()
		{
			System.out.println("Cash Pay process");
		}
	}
