/*
 * Class Name: Student
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question2;

import java.util.*;

class Student implements Comparable<Student>{
	private String studentId;
	private String surname;
	private String firstName;

	Student(String studentId, String surname, String firstName){
		this.studentId = studentId;
		this.surname = surname;
		this.firstName = firstName;
	}

	public String getStudentId(){
		return studentId;
	}
	
	public String getSurname(){
		return surname;
	}

	public String getFirstName(){
		return firstName;
	}

	public boolean equals(Object ob){
		if(!(ob instanceof Student))
			return false;
		Student s = (Student)ob;
		return studentId.equals(s.studentId);
	}

	public int hashCode(){
		return studentId.hashCode();
	}

	public String toString(){
		return studentId+": "+surname+", "+firstName;
	}

	public int compareTo(Student m){
		return this.studentId.compareTo(m.getStudentId());
	}

	public static Comparator<Student> surnameCompare = new Comparator<Student>(){
		public int compare(Student st1, Student st2) {
			return (st1.getSurname().compareTo(st2.getSurname()));
		}
	};
}
