/**
 * @(#)FullTimeEmp.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */


public class FullTimeEmp extends Employee{
	private double salary; //annual
	
	public FullTimeEmp(String n, String p,
					String num, double sal){
		super(n,p,num);
		salary = sal;
	}

	public void paySlip(){
		System.out.println();
		System.out.println(" ~~~ Full Time Employee Payslip ~~~");
		double pay = salary/52;
		super.display();
		System.out.printf("Salary  : %.2f\n", pay);
	}
}
