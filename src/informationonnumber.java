import java.util.Scanner;

public class informationonnumber {
	
	/*
	 * This project takes a user's input and relates back information on whether
	 * number is odd or even, and if it is within certain ranges.
	 * 
	 * Author: Mariah Hall (hallmar94@gmail.com)
	 * Date: 10/9/2018
	 */

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNumber;                  // number chosen by user
		String userName, numberResponse; // user's name and the response to user's chosen number
		
	    System.out.println("Please tell me your name: ");
	    userName = scnr.nextLine();
		
		System.out.println("Thank you, " + userName + ". Please enter a number 1 to 100: ");
		userNumber = scnr.nextInt();
		
		if (userNumber >= 1 && userNumber <= 100) {
			if (userNumber % 2 != 1) {
				if (userNumber >=2 && userNumber <= 25) {
				   numberResponse = "even and less than 25.";
				}
				else if (userNumber >= 26 && userNumber <= 60) {
				   numberResponse = "even.";					
				}
				else {
				   numberResponse = "even.";
				}
			}
			else {
				if (userNumber < 60) {
				   numberResponse = "odd.";					
				}
				else {
				   numberResponse = "odd and over 60.";
				}
			}
						
	    System.out.println("Wonderful choice, " + userName + ". " + userNumber + " is " + numberResponse);
	    
		}
		else {
		   System.out.println("Sorry, " + userName + ". " + userNumber + " is not between 1 and 100. Try again.");
		}
		
    scnr.close();
	}

}
