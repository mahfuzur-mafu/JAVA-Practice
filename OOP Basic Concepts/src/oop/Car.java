package oop;

public class Car extends Vehicle {
	private boolean power=false;
	private boolean led=true;
	
	
	public Car(String name,String color,String model,String company, String engine, boolean power,boolean led) {
		super(name,color,model,company,engine);
		this.power=power;
		this.led=led;
		
	}
		
	public String getName () {
		return "This is your car : "+ super.getName();
	}
	
	
	
	public void setPower (boolean power) {
		this.power=power;
	}
	public void setLed (boolean led) {
		this.led=led;
	}
	
	
	
	public boolean getPower ( ) {
		return this.power;
	}
	
	
	public boolean getLed ( ) {
		return this.led;
	}
	
	
	public String getInfo() {
		return"This is a Car";
	}

}
