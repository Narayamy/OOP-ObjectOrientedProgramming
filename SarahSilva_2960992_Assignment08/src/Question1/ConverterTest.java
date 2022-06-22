/*
 * Class Name: ConverterTest
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question1;

public class ConverterTest {

	public static void main(String[] args) {
		
		double cm = 564;
		double inches = 245;
		double miles = 612;
		double kilometers = 60;
		
		System.out.println(cm + " centimeters converted to inches are: " +
							Converter.cmToInch(cm) + " inches");
		
		System.out.println(inches + " inches converted to centimeters are: " +
							Converter.inchesToCm(inches) + " centimeters");
		
		System.out.println(cm + " miles converted to kilometers are: " +
							Converter.milesToKilometers(miles) + " kilomneters");
		
		System.out.println(cm + " kilometers converted to miles are: " +
							Converter.kilometersToMiles(kilometers) + " miles");
	
	}

}
