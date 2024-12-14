package ApplianceStore;

public class Appliance {
	String brand;
	String model;
	Appliance(String brand,String model)
	{
		this.brand=brand;
		this.model=model;
	}
	void dispapp()
	{
		System.out.println("Appliance Details: ");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
	}
}
