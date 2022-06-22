/*
 * Employee.java
 *
 * Student name: Sarah Narayamy Tavares Silva
 * Student number: 2960992
 */

final class Employee implements Comparable<Employee>{
	private final String ppsNum;
	private final String sName;
	private final String fName;

	Employee(String pps, String fn, String sn){
		ppsNum = pps; fName = fn; sName = sn;
	}

	public String ppsNum(){
		return ppsNum;
	}

	public String sName(){
		return sName;
	}

	public String fName(){
		return fName;
	}

	public String toString(){
		return ppsNum+" "+fName+" "+sName;
	}

	public boolean equals(Object ob){
		if(!(ob instanceof Employee))
			return false;
		Employee e = (Employee)ob;
		return ppsNum.equals(e.ppsNum());
	}

	public int compareTo(Employee e){
		if(e == null)
			return -1;
		if(this.equals(e))
			return 0;
		return ppsNum.compareTo(e.ppsNum());
	}

	public int hashCode(){
		return ppsNum.hashCode();
	}
}