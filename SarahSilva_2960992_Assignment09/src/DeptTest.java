/*
 * DeptTest.java
 *
 * Student name: Sarah Narayamy Tavares Silva
 * Student number: 2960992
 */

import java.util.*;
public class DeptTest {

	public static void main(String[] args) {
		Department d = new Department();
		Employee e1 = new Employee("1111111A", "Joe", "Bloggs");
		d.add(e1);
		d.add(new Employee("3333333B", "Rosella", "Murphy"));
		d.add(new Employee("2222222C", "Mary", "O Keefe"));
		d.display();

		System.out.println();
		Employee notThere = new Employee("9999999A", "JJ", "Byrne");
		System.out.printf("Employee %s should not be there, so false: %b\n",
													notThere.toString(),d.search(notThere));
		System.out.printf("Employee %s should  be there, so true: %b\n",e1.toString(),d.search(e1));

		System.out.println();
		System.out.printf("There should be 3 employees: %d\n",d.size());

		System.out.println();
		d.add(new Employee("4444444D", "Rosella", "O Keefe"));
		System.out.printf("There should be 2 people with the surname 'O Keefe: %s",
													d.getSurname("O Keefe").toString());
		System.out.println();

		System.out.println();
		d.add(new Employee("4444444D", "Elena", "Casey")); // Won't be added as not unique
		System.out.printf("There should be 2 employees with the firstname 'Rosella': %s\n",
													d.getFirstname("Rosella").toString());

		System.out.println();
		System.out.printf("There should be 1 employee called 'Joe': %d\n",d.getFreq("Joe"));
		d.add(new Employee("1111111A", "Joe", "Staunton")); // again not unique
		System.out.printf("There should still be 1 employee called 'Joe': %d\n",d.getFreq("Joe")); // unique
		d.add(new Employee("5555555E", "Joe", "BloggsEile"));
		System.out.printf("There should be 2 people called 'Joe': %d\n",d.getFreq("Joe"));

		System.out.println();
		d.display();
		System.out.println();
		System.out.printf("Joe Bloggs should be removed (4 people): ");
		d.del(e1);
		d.display();

		System.out.println();
		System.out.printf("Sorted list of employees: %s\n",d.sort().toString());
	}
}