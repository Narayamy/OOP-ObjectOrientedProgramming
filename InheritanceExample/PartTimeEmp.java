/**
 * @(#)PartTimeEmployee.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */


public class PartTimeEmp extends Employee{
	private double rate;
	private int hours;
	public PartTimeEmp(String n,String p,String num,double r){
		super(n,p,num);
		rate = r;hours = 0; 
	}
	
	public void setHoursWorked(int h){
		hours = h;
	}
	
	public void paySlip(){
		System.out.println();
		System.out.println(" ~~~ Part Time Employee Payslip ~~~");
		super.display();
		System.out.printf("Rate  :  %.2f\n", rate);
		System.out.println("Hours worked : "+hours);
		System.out.printf("Gross pay: %.2f\n", hours*rate);
	}

}
