/* Name Surname: Batuhan Baþtürk Student Number: 150119035

 Purpose of this program is to calculate the compound monthly interest */
 
import java.util.Scanner;

public class Pro2_150119035 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter initial principle balance: ");
		double initial_principle_balance = input.nextDouble();
		
		System.out.print("Enter yearly interest rate (Ex: 9.45): ");
		double interest_rate_yearly = input.nextDouble();
		double interest_rate_monthly = (int) (interest_rate_yearly / 12 * 100) / 100.0; //find monthly interest rate 
		interest_rate_yearly = interest_rate_yearly / 100; //interest rate's percentage 
		
		System.out.print("Enter monthly time periods (Ex: 8): ");
		int number_of_time_periods = input.nextInt();
		
		double final_amount = initial_principle_balance * Math.pow(1 + interest_rate_yearly / 12, number_of_time_periods);
		// used interest formula
		double total_compound = (final_amount - initial_principle_balance); 
		//formula for finding total compound
		
		System.out.println("Initial Balance " + initial_principle_balance);
		System.out.println("Monthly Interest Rate " + interest_rate_monthly );
		System.out.println("Total compound interest " + (int)(total_compound * 100) / 100.0 );
		System.out.println("Final balance " + (int) (final_amount * 100) / 100.0 );
		 
		//I use (int)(variable * 100) / 100.0 to make 2digits after the decimal point
		 
	}
}