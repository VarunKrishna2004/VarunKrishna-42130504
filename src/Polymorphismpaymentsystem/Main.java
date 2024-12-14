package Polymorphismpaymentsystem;

public class Main {
	public static void main(String[] args)
	{
		CashPayment c=new CashPayment();
		c.processpayment();
		Payment a=new CardPayment();
		Payment b =new CashPayment();
		a.processpayment();
		b.processpayment();
		b.cashdetails();
		a.cashdetails();
	}

}
