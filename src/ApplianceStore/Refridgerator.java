package ApplianceStore;

public class Refridgerator extends Appliance {
	float capacity,energyrating;
	Refridgerator(String brand,String model,float capacity,float energyrating)
	{
		super(brand,model);
		this.capacity=capacity;
		this.energyrating=energyrating;
	}
	void dispfridge()
	{
		dispapp();
		System.out.println("Capacity: "+capacity);
		System.out.println("Energy Rating: "+energyrating);
		encon();
	}
	void encon()
	{
		double en=1.5*energyrating;
		System.out.println("Energy Consumption: "+en+" Units.");
	}
}
