

public class Engine {
	private int cc;

	public Engine (int cc){
		this.cc = cc;
	}

	public int get(){
		return cc;
	}

	public void edit(int cc){
		this.cc = cc;
	}

	public String toString(){
		return "CC: "+cc;
	}
}
