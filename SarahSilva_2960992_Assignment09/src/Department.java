/*
 * Department.java
 *
 * Student name: Sarah Narayamy Tavares Silva
 * Student number: 2960992
*/

import java.util.*;
public class Department{
	
	HashSet<Employee> set = new HashSet<Employee>();
	
	public void add(Employee e){
		set.add(e);
	}
	
	public boolean search(Employee e) {
		return set.contains(e);
	}
	
	public int size() {
		return set.size();
	}
	
	public HashSet<Employee> getSurname(String s) {
		boolean found = false;
		HashSet<Employee> surname = new HashSet();
		Employee e = null;
		Iterator<Employee> listOfEmployee = set.iterator();
		while (listOfEmployee.hasNext() && !found) {
			e = listOfEmployee.next();
			if(e.sName().equals(s)) {
				surname.add(e);
			}
		}
		return surname;
	}
	
	public HashSet<Employee> getFirstname(String f) {
		boolean found = false;
		HashSet<Employee> firstName = new HashSet();
		Employee e = null;
		Iterator<Employee> listOfEmployee = set.iterator();
		while (listOfEmployee.hasNext() && !found) {
			e = listOfEmployee.next();
			if(e.fName().equals(f)) {
				firstName.add(e);
			}
		}
		return firstName;
	}
	
	public int getFreq(String f) {
		int total = 0;
		Employee e = null;
		Iterator<Employee> frequence = set.iterator();
		while(frequence.hasNext()){
			e = frequence.next();
			if(e.fName().equalsIgnoreCase(f)) {
				total ++;
			}
		}
		return total;
	}
	
	public boolean del(Employee e) {
		boolean found = false;
		Employee a = null;
		Iterator<Employee> listOfEmployee = set.iterator();
		while (listOfEmployee.hasNext() && !found) {
			a = listOfEmployee.next();
			if(a.ppsNum().equals(e.ppsNum())) {
				found = true;
			}
		}
		if (found){
			set.remove(e);
			return true;
		}
		else {
			return false;
		}
	}
	
	public TreeSet<Employee> sort() {
		TreeSet<Employee> myTreeSet = new TreeSet<Employee>(set);
		return myTreeSet;
	}
	
	public void display() {
		Iterator<Employee> listOfEmployee = set.iterator();
		System.out.print("[");
		while(listOfEmployee.hasNext()) {
			Employee e = listOfEmployee.next();
			System.out.print(e.ppsNum() + " " + e.fName() + " " + e.sName() + ", ");
		}
		System.out.print("]");
	}
	
}