
public class LogicGatesTest {
	
	public static void main(String[] args){
		
		// instances of gates
		LogicGates gate1 = new LogicGates (true);
		LogicGates gate2 = new LogicGates (false);
		
		// call the "not" method (change the current state to the oposite)
		gate1.not();
		gate2.not();
		
		// call the "set" method (change the current state to true if it's false)
		gate1.set();
		gate2.set();
		
		// call the "negate" method (change the current state to false if it's true)
		gate1.negate();
		gate2.negate();
		
	}	

}