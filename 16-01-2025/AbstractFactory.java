/*
import java.lang.*;
public class AbstractFactory{
	public static void main(String[] args){
		
	}
}

abstract class Vehicle{
	public static Vehicle getVehicle(String v);
}

class Car implements Vehicle{
	private Car(){
	
	}

	public Vehicle getVehicle(String v){
		if(v == "Car") return new Car();
		else throw new NullPointerException();
		return (Vehicle)null;
	}
}

class Bike{
	private Bike(){

	}
	
	public Vehicle getVehicle(String v){
		if(v == "Bike") return new Bike();
		else throw new NullPointerException();
		return (Vehicle)null;
	}
}

class Van{
	private Van(){

	}

	public Vehicle getVehicle(String v){
		if(v == "Van") return new Van();
		else throw new NullPointerException();
		return (Vehicle)null;	
	}
}
*/
