package ood.lab1.sunblockfactory;

public class SunblockStore {

	public static void main(String[] args) {
		Sunblock sunblock = new BlueSunblock();
		System.out.println(sunblock.getProperties());
		System.out.println("$" + sunblock.getCost().toString());
		Sunblock strawberryScentedSunblock = new SmellySunblock(sunblock, "strawberry");
		System.out.println(strawberryScentedSunblock.getProperties());
		System.out.println("$" + strawberryScentedSunblock.getCost().toString());
		Sunblock spf50Sunblock = new SpfSunblock(strawberryScentedSunblock, 50.0);
		System.out.println(spf50Sunblock.getProperties());
		System.out.println("$" + spf50Sunblock.getCost().toString());
		};
	}

