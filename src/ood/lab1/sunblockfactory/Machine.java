package ood.lab1.sunblockfactory;
import java.util.*;

public class Machine {
	private String name;
	private String input;
	private String output;
	private Float ratio;
	private List<MachineObserver> observers;
	
	public Machine(String name, String input, String output, Float ratio) {
		this.name = name;
		this.input = input;
		this.output = output;
		this.ratio = ratio;
		observers = new ArrayList<MachineObserver>();
	}
	
	public void feed(Float inputValue) {
		System.out.println("Added " + inputValue + " " + input + " to " + name);
		notifyObservers(inputValue);
	}
	
	public void registerObserver(MachineObserver o) {
		observers.add(o);
	}
	
	public void removeObserver(MachineObserver o) {
		observers.remove(o);
	}
	
	public void notifyObservers(Float inputValue) {
		for (MachineObserver o: observers) {
			o.update(inputValue);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getInput() {
		return input;
	}
	
	public String getOutput() {
		return output;
	}
	
	public Float getRatio() {
		return ratio;
	}
	
	
}
