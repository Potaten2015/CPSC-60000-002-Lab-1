package ood.lab1.sunblockfactory;

public class Lab1Run {

	public static void main(String[] args) {
		Machine machine1 = new Machine("Tube Maker", "Pounds of Melted Plastic", "Sunblock Tube", (float) 0.05);
		Machine machine2 = new Machine("Tube Filler", "Gallons of Sunblock", "Filled Tube", (float) 0.1);
		
		MachineObserver observer1 = new MachineObserverClass(machine1);
		MachineObserver observer2 = new MachineObserverClass(machine2);
		
		machine1.feed((float) 1.0);
		machine1.feed((float) 10);
		machine1.feed((float) 14.24);
		
		machine1.removeObserver(observer1);
		
		machine2.feed((float) 1.3);
		machine2.feed((float) 14);
		machine2.feed((float) 37);
		
		machine1.removeObserver(observer2);
		
		
		
	}

}
