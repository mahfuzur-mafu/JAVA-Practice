package oop;

public class Bike extends Vehicle{
	private boolean gear=true;
	
	public Bike(String name,String color,String model,String company, String engine, boolean gear) {
		super(name,color,model,company,engine);
		this.gear=gear;
		
		
	}
	public void setGear (boolean gear) {
		this.gear=gear;
	}
	
	
	
	public boolean getGear ( ) {
		return this.gear;
		
	}
	
	public String getInfo() {
		return"This is a Bike";
	}

}
