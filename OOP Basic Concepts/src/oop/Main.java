package oop;

public class Main {

	public static void main(String[] args) {
//		Vehicle vehicle1 = new Vehicle();
//		System.out.println(vehicle1.getName());
//		vehicle1.setName("Honda");
//		System.out.println(vehicle1.getName());
//		System.out.println(vehicle1.count);
//		
//		
//		Vehicle vehicle2 = new Vehicle("Honda","Black","Honda","Honda","8100");
//		System.out.println(vehicle2.getColor());
//		vehicle2.setColor("red");
//		System.out.println(vehicle2.getColor());
//		System.out.println(vehicle2.getSpeed());
//		System.out.println(vehicle1.count);
//	
//		System.out.println(Vehicle.getVehicle());
		
//		
//		Car car1= new Car("Honda","Black","Honda","Honda","900",true,false);
//		System.out.println(car1.getLed());
//		System.out.println(car1.getName());
		
		Vehicle vehicle1 = new Vehicle("Honda","Black","Honda","Honda","8100");
		System.out.println(vehicle1.getInfo());
	
		
		Car vehicle2 = new Car("Honda","Black","Honda","Honda","8100",true,false);
		System.out.println(vehicle2.getInfo());
		
		Bike vehicle3 = new Bike("Honda","Black","Honda","Honda","8100",true);
		System.out.println(vehicle3.getInfo());
		
		
	

	}

}
