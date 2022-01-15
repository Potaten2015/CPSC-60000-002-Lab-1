package ood.lab1.sunblockfactory;

public class MachineObserverClass implements MachineObserver {
	
	private Machine machine;
	private Float totalOutput;
	
	public MachineObserverClass(Machine machine) {
		this.machine = machine;
		this.totalOutput = (float) 0;
		machine.registerObserver(this);
		String introString = machine.getName() + " uses " + machine.getRatio().toString() + " " + machine.getInput() + " to output 1 " + machine.getOutput() + ".";
		System.out.println(introString);
	}
	
	public void update(Float value) {
		totalOutput = totalOutput += value / machine.getRatio();
		String updateString = machine.getName() + " total output: " + totalOutput.toString() + " " + machine.getOutput();
		System.out.println(updateString);
	}
}
