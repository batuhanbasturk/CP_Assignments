/*Name Surname = Batuhan Baþtürk ID:150119035
 * 
 * 
 * Purpose of this program is write a program that will determine whether or not it is valid per the Luhn formula. The Luhn
algorithm is a simple checksum formula used to validate a variety of identification numbers,
such as credit card numbers. The task is to check if a given string is valid.
 * 
 */
import java.util.Scanner;
public class Pro2_150119035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//getting string input from user
		String number = input.nextLine();
		//checking for number validity
		if(validateNumber(number)==true)//if method returns true print number is valid otherwise number is invalid
			System.out.println("\nNumber is Valid");
		else
			System.out.println("\nNumber is Invalid");

		
	}
	public static boolean validateNumber (String number) {
		//if user enters only one letter to stop program
	    if(number.length() <=1 ) {
	    	System.out.println("Invalid Input !");
	    	System.exit(0);
	    }
	    //to get rid of space char i create new string 
	    String withoutspacenum = "";
	    //
	    for(int i = 0; i < number.length();i++) {
	    	//using isdigit for to get number chars into withoutspacenum string
	    	if(Character.isDigit(number.charAt(i))) {
	    		withoutspacenum += number.charAt(i);
	    	}
	    	//if user enters other alt keys to give invalid input and close program
	    	else if(number.charAt(i) != ' ') {
	    		System.out.println("Invalid Input !");
	    		System.exit(0);
	    	}
	    }
		//create new string DNumber
	    String DNumber = "";
	    // if stringlength is even start index from 0 else start index from 1
	    int index = 0;
	    if(withoutspacenum.length() % 2 == 1) {
	    	 index = 1;
	    }
	    else
	    	index = 0;
	    //using index start point for our string which has only numbers 
		for(int i = index; i <= withoutspacenum.length() - 1; i+=2) {
			//char at index points every second one is get added  by "_"
	    	DNumber += withoutspacenum.charAt(i) + "_";
	    }
		//print dnumber
		System.out.println("DNumber:" + DNumber);
		//create new array for Lnumber and length will be withoutspacenumbers
		int Lnumber[] = new int [withoutspacenum.length()];
		//it will print one by one string to integer
		 for (int i = 0; i <= withoutspacenum.length() - 1; i++) {
		        Lnumber[i] = Integer.parseInt(withoutspacenum.substring(i, i + 1));
		    }
		 //find at what index we will do calculation of luhn
		 for (int i = Lnumber.length - 2; i >= 0; i -= 2) {
		        int j = Lnumber[i];
		        //double the value of int
		        j = j * 2;
		        if (j > 9) {//if doubled value is bigger than 9 than get mod9 of it
		            j %= 9;
		        }
		        Lnumber[i] = j;
		 }
		 //print lnumber
		 System.out.print("LNumber:");
		 for(int i = 0; i < Lnumber.length;i++) {
			 System.out.print(Lnumber[i]);
		 }
		 //create sum
		 int sum = 0;
		 //to read all of the array for loop
		 for(int i = 0; i <= Lnumber.length - 1; i++) {
			 //add every array int to sum
			 sum += Lnumber[i];
		 }
		 //if sum can be divided without remaining value return true  
		 if(sum % 10 == 0) {
			 return true;
		 }//if cant be divided without remaining than return false
		 else
			 return false;
	     
	}   
			
   }
		
 


