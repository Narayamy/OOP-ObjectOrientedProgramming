
public class TestCar{
	
	public static void main(String[] TestCar){
		
		// create engine object
		Engine engine = new Engine(1600);
		// create car object (passing engine in)
		Car car1 = new Car("Audi","A1", engine);
		
		// testing car
		// display car object
		System.out.println("###### Car ######");
		System.out.println(car1);
		// edit engine object
		engine.edit(400);
		// display showing that has changed
		System.out.println("###### Car ######");
		System.out.println(car1);
		//getting engine from car object again (using getter method)
		Engine ee = car1.getEngine();
		// change this engine
		ee.edit(500);
		// display again (showing it has changed again)
		System.out.println("###### Car ######");
		System.out.println(car1);
		
		
		// Testing Vehicle
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		engine = new Engine(1600);
		Vehicle car2 = new Vehicle("Audi","A1", engine);
		
		System.out.println("###### Vehicle ######");
		System.out.println(car2);
		engine.edit(400);
		System.out.println("###### Vehicle ######");
		System.out.println(car2);
		ee = car1.getEngine();
		ee.edit(500);
		System.out.println("###### Vehicle ######");
		System.out.println(car2);
	}
}