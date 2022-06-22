
public class LogicGates {
	
	// atributes
	private boolean stateOnOff;
    
    // constructor
	public LogicGates(boolean stateOnOff /*boolean stateOff*/){
		this.stateOnOff = stateOnOff;
	}
	
	// get the current state of the gate and return the value
	public boolean state(){
		return stateOnOff;
	}
	
	// change the current state of the gate to its opposite
	public void not(){
		if(this.stateOnOff == true){
			this.stateOnOff = false;
			System.out.println(stateOnOff);
			System.out.println();
		}
		 else{
			this.stateOnOff = true;
			System.out.println(stateOnOff);
			System.out.println();
		}
	}
	
	// change the current state to true (keep it true if already is)
	public void set(){
		if(this.stateOnOff == false){
			this.stateOnOff = true;
			System.out.println(stateOnOff);
			System.out.println();
		}
		else{
			this.stateOnOff = stateOnOff;
			System.out.println(stateOnOff);
			System.out.println();
		}
	}
	
	// change the current state to false (keep it false if already is)
	public void negate(){
		if(this.stateOnOff == true){
			this.stateOnOff = false;
			System.out.println(stateOnOff);
			System.out.println();
		}
		else{
			this.stateOnOff = stateOnOff;
			System.out.println(stateOnOff);
			System.out.println();
		}
	}
	

		
}