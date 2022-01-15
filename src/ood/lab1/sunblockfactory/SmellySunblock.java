package ood.lab1.sunblockfactory;

public class SmellySunblock extends ScentDecorator {
	
	public Sunblock sunblock;
	public String scent;
	
	public SmellySunblock(Sunblock sunblock, String scent) {
		this.sunblock = sunblock;
		this.scent = scent;
	}
	
	public String getProperties() {
		return sunblock.getProperties() + ", " + scent + " scented";
	}
	
	public Double getCost() {
		return sunblock.getCost() + 0.50;
	}
	
}