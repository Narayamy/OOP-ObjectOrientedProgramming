/*
 * Class Name: Converter
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question1;

public class Converter {
		
	public static double cmToInch(double cm) {
		double inches = cm*2.54;
		return inches;
	}
	
	public static double inchesToCm(double inch) {
		double centimeters = inch/2.54;
		return centimeters;
	}
	
	public static double milesToKilometers(double miles) {
		double kilometers = 1.609*miles;
		return kilometers;
	}
	
	public static double kilometersToMiles(double kilometers) {
		double miles = kilometers/1.609;
		return miles;
	}
	

}
