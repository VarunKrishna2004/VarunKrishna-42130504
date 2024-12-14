package ApplianceStore;

public class washingmac extends Appliance {
	float LC,spinspeed;
	washingmac(String brand,String model,float LC,float spinspeed)
	{
		super(brand,model);
		this.LC=LC;
		this.spinspeed=spinspeed;
	}
	void dispwashmac()
	{
		dispapp();
		System.out.println("Load Capacity: "+LC+"Kg");
		System.out.println("SpinSpeed: "+spinspeed);
		enecon();
	}
	void enecon()
	{
		double EC=1.5*LC;
		System.out.println("EnergyConsumption: "+/*String.format("%o.1f",*/EC+" Units.");
	}
}
