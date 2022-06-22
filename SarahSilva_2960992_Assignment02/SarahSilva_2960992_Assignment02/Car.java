import java.*;

public class Car {
	private String make, model;
	private Engine engine;

	public Car(String make, String model, Engine engine){
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	public Engine getEngine(){
		return engine;
	}
	
	public String toString(){
		return "Make: " + make + ", Model: " + model + ", Engine: " + engine;
	}
}
