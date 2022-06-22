package Hospital;

public class EmployeeManager {
	private Employee[] data;
	private int size;
	
	public EmployeeManager(int sizeArray){
		data = new Employee[sizeArray];
		this.size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean addEmployee(Employee employee) {
		if(size == data.length) {
			return false;
		}
		else {
			data[size] = employee;
			size++;
			return true;
		}
	}
	
	public Employee[] getEmpByGender(char gender) {
		int count = 0;
		for (int i=0; i<data.length; i++) {
			Employee employee = data[i];
			if(employee.getGender()==gender) {
				count++;
			}
		}
		int j = 0;
		Employee[] byGender = new Employee[count];
		for(int i=0; i<data.length; i++) {
			Employee employee = data[i];
			if(employee.getGender() == gender) {
				byGender[j] = employee;
				j++;
			}
		}
		return byGender;
	}
	
	public Employee[] getEmpByDept(String dept) {
		int counter = 0;
		for(int i=0; i<data.length; i++) {
			Employee employee = data[i];
			if(employee.getDepartment() == dept) {
				counter++;
			}
		}
		int h = 0;
		Employee[] byDept = new Employee[counter];
		for(int i=0; i<data.length; i++) {
			Employee employee = data[i];
			if(employee.getDepartment() == dept) {
				byDept[h] = employee;
				h++;
			}
		}
		return byDept;
	}
	
	public Employee getEmpByID(String id) {
		for(int i=0; i<data.length; i++) {
			Employee employee = data[i];
			if(employee.getEmployeeId().equalsIgnoreCase(id)) {
				return employee;
			}
		}
		return null;
	}
	
	public String toString(){
		if(size == 0) return "[]";
		String s = "[";
		for(int j = 0; j < size - 1; j++)
			s = s + data[j] + ",";
		return s+data[size-1]+"]";
	}

}
