/**
 * @(#)Employee.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */


public class Employee extends Person{
   private String ppsNumber;
   public Employee( String n, String p, String num){
   	  super(n,p);
   	  ppsNumber = num;
   }
   public String getPpsNumber(){ return ppsNumber;}
   public void display(){
   	  super.display();
   	  System.out.println("PPS number: "+ppsNumber);
   }
}
