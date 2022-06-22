import java.util.Scanner;
import java.util.Random;

public class firstAssignment00 {
    
    static int number = (int )(Math.random() * 10 + 1);
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	/* Question 1 Write a program/class that asks the user to enter their name and outputs “Hello sss,
			welcome back to another semester of fun with java”, where ‘sss’ is the name entered by the
			user
			
    	System.out.println("Please, what is your name?");
    	String userName = input.nextLine();
    	System.out.println("Hello "+ userName + ", welcome back to another semester of fun with java");*/
    	
    	/* Question 2 Write a class that takes an integer input and prints an output message stating whether the
			user entered an odd or even number.
		
		System.out.println("Please, give a number");
		int userNumber = input.nextInt();
		if(userNumber%2==0){
			System.out.println("Your number is an even number.");
		}
		else{
			System.out.println("Your number is an odd number");
		}*/
		
		/* Question 3 Write a class that initialises an integer array of length 10. Fill the array with random numbers
			and then add all the values in the array. Output the answer.
			
		int [] randomArray = new int[10];
		int sum = 0;
		for(int i=0; i<randomArray.length; i++){
			int randomNumber = (int )(Math.random() * 10 + 1);
			randomArray [i]= randomNumber;
			System.out.println(i);
			sum = sum + randomArray [i];
		}*/
		
		/* Question 4 Write a number guessing program. Assign a value to a variable called number at the top of
			the class (you could use math.random() for this). Give a prompt that asks for five guesses.
			See whether any of the guesses matches the number and then print an appropriate message
			if one does.
		
		int guessChances = 5;
		while(guessChances>0){
			System.out.println("You have " + guessChances + " guesses, please guess a number.");
			int userGuess = input.nextInt();
			if(userGuess==number){
				System.out.println("You have guessed the right number.");
				guessChances=0;
			}
			else{
				System.out.println("OOps, not that number.");
				guessChances--;
			}
		}
		System.out.println("The number was " + number + ".");*/
		
		/* Question 5 Write a tax calculation program. Prompt the user to input two salaries for a family and
			output their combined tax bill. A family pays no tax if its income is less than 15000 euro. The
			family pays 10% tax if the combined salaries are 15000 euro through 19,999.99 euro, or 20%
			tax if the combined salaries are from 20000 euro through 29,999.99. Otherwise the family
			pays 30% tax.
			
		
		System.out.println("Let's calculate your taxes. Please what is your salary?");
		double userSalary1 = input.nextDouble();
		System.out.println("Now tell me the salary of your partner.");
		double userSalary2 = input.nextDouble();
		double totalSalary = userSalary1 + userSalary2;
		double taxToPay;
		
		if(totalSalary < 15000){
			System.out.println("You are not oblidged to pay any taxes.");
		}
		else if (totalSalary>=15000 && totalSalary<=19999.99){
			taxToPay = totalSalary*0.1;
			System.out.println("You are entitled to pay 10% of tax, which is : " + taxToPay);			
		}
		else if(totalSalary>=20000 && totalSalary<=29999.99
			){
			taxToPay = totalSalary*0.2;
			System.out.println("You are entitled to pay 20% of tax, which is : " + taxToPay);
		}
		else{
			taxToPay = totalSalary*0.3;
			System.out.println("You are entitled to pay 30% of tax, which is : " + taxToPay);
		}*/

		
		/* Question 6 Write a program with a main method that calls a method called GreaterThan, it takes two
			integer arguments and returns an integer. It should return the largest.
			
		System.out.println("Please, give me a number.");
		int userNumber1 = input.nextInt();
		System.out.println("Please, give the second number to compare.");
		int userNumber2 = input.nextInt();
		int numbersEqual = 0;
		int comparisson = GreaterThan(userNumber1, userNumber2, numbersEqual);
		if(comparisson == userNumber1){
			System.out.println("The number " + userNumber1 + " is greater than " + userNumber2);
		}
		else if (comparisson == userNumber2){
			System.out.println("The number " + userNumber2 + " is greater than " + userNumber1);
		}
		else{
			System.out.println("The numbers are the equal.");
		}*/
		
		/* Question 7 Write a program that asks the user for two initials. Print a message telling the user whether
			the first initial falls alphabetically before the second (you should ignore case).*/
			
		
		
			
			
			
			
			
			
    }
    
   /* public static int GreaterThan (int numberOne, int numberTwo, int equalNumbers){
    	
    	if(numberOne>numberTwo){
    		return numberOne;
    	}
    	else if(numberOne<numberTwo){
    		return numberTwo;
    	}
    	else{
    		return equalNumbers;
    	}
    }*/
}

