/*Name Surname: Batuhan Baþtürk  Student Number: 150119035
 
 Purpose of this program finds how many years and months are there in given days*/
 
import java.util.Scanner;

public class Pro1_150119035 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of days:");
		
		int days = input.nextInt();     
		int years = days / 365;         
		int months = (days % 365) / 31;  //The remaining days from dividing 365 if we divide them to 31 then we will get the number of months
		int remainingDays = (days % 365) % 31;  //  the number of days left from the section to 31 is will be our remaining day number
		
		System.out.println( "Year: " + years + " Month: " + months + " Day: " + remainingDays);

	}

}
