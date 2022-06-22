/*
 * Class Name: StudentTest
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question2;

import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		
		Student[] studentList = {
				new Student("A12345","Murphy","Donal"),
				new Student("A12346","Estefan","Faheem"),
				new Student("A12347","Boland","Barry"),
				new Student("A12348","Tynan","Ruairi"),
				new Student("A12349","Power","Paddy"),
				new Student("A12350","Tierney","Eoin"),
				new Student("A12351","Mullins","Tony"),
				new Student("A12352","Power","Paddy"),
				new Student("A11111","Boland","Veronica")
			};
		
		// printing the natural order
		System.out.println(Arrays.toString(studentList));
		
		// sorting and printing by studentId
    	Arrays.sort(studentList);
    	System.out.println(Arrays.toString(studentList));
    	
    	// sorting and printing by surname
    	Arrays.sort(studentList, Student.surnameCompare);
    	System.out.println(Arrays.toString(studentList));
    	

	}

}
