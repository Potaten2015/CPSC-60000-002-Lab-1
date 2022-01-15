package ood.lab1.sunblockfactory;

public class BlueSunblock extends Sunblock {
	String color = "blue";
	
	public BlueSunblock() {}
	
	public String getProperties() {
		return properties + ", " + color;
	}
	
	public Double getCost() {
		return cost + 0.20;
	}

}
