package ood.lab1.sunblockfactory;

public class SpfSunblock extends SpfDecorator {

	public Sunblock sunblock;
	public Double spf;
	
	public SpfSunblock(Sunblock sunblock, Double spf) {
		this.sunblock = sunblock;
		this.spf = spf;
	}
	
	public String getProperties() {
		return sunblock.getProperties() + ", SPF " + spf.toString();
	}
	
	public Double getCost() {
		return sunblock.getCost() + (spf * .05);
	}

}
