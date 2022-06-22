
public class Vehicle {
	private String make, model;
	private Engine engine;

	public Vehicle(String make, String model, Engine engine){
		this.make = make;
		this.model = model;
		// making a copy of engine setting attribute with this)
		this.engine = new Engine(engine.get());
	}

	public Engine getEngine(){
		// making a copy of engine in getter (get in this copy)
		return new Engine(engine.get());
	}
	
	public String toString(){
		return "Make: " + make + ", Model: " + model + ", Engine: " + engine;
	}
}