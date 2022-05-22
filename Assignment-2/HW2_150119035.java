 // Name Surname: Batuhan Baþtürk  Student Number: 150119035


/* Purpose of this program is calculating between 2017 and 2020(including 2017 and 2020)
calculates tax according to people's salary 
*/
import java.util.Scanner;

public class HW2_150119035 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();    // Prompt user to enter year
		double income = input.nextDouble(); // Prompt user to enter income 
		
		if (income == 0) {
			System.out.println("Income must be > 0!"); // 
		    System.exit(1);   //To stop my program if user enters 0 income and warn him/her with income must be >0! sentence
		}
		
		//Compute tax	
		double tax = 0; 
		
		switch (year) { // To separate calculation by years
		
		case 2020://Compute tax for 2020
		    if (income < 22000)
				tax = income * 0.15;
			else if (income < 49000)
			    tax = 3300 + (income - 22000) * 0.20;
			else if (income < 180000)
				tax = 8700 + (income - 49000) * 0.27;
			else if (income < 600000)
				tax = 44070 + (income - 180000) * 0.35;
			else 
				tax= 191070 + (income-600000) * 0.40;
		    break;
		
		case 2019://Compute tax for 2019
			if (income < 18000)
				tax = income * 0.15;
			else if (income < 40000)
				tax = 2700 + (income - 18000) * 0.20;
			else if (income < 148000)
				tax = 7100 + (income - 40000) * 0.27;
			else if (income < 500000)
				tax = 36260 + (income - 148000) * 0.35;
			else
				tax = 163460 + (income - 500000) * 0.40;
			break;  
		
		case 2018://Compute tax for 2018
			if (income < 14800)
				tax = income * 0.15;
			else if (income < 34000)
				tax = 2200 + (income - 14800) * 0.20;
			else if (income <120000)
				tax = 6060 + (income - 34000) * 0.27;
			else 
				tax = 29280 + (income- 120000) * 0.35;
		    break;
		
		case 2017://Compute tax for 2017
			if (income < 13000)
				tax = income * 0.15;
			else if (income < 30000)
				tax = 1950 + (income - 13000) * 0.20;
			else if (income < 110000)
				tax = 5350 + (income - 30000) * 0.27;
			else
				tax = 26950 + (income - 110000) * 0.35;
			break;	
		default:
			System.out.println("Undefined year value!"); // adding default case to stop my program if user doesn't use years between 2017 and 2020
			System.exit(2);
			break;
		}
		//Display the result
		System.out.println("Income: " + income);
		System.out.println("Tax amount: " + (int)(tax * 100) / 100.0);
		System.out.println("Income after tax: " + (int)((income - tax) * 100) / 100.0 ) ;
		System.out.println("Real tax rate: % " + (int)((tax * 100 / income) * 100) / 100.0 );
		//I'm converting my double values to int so i can shorten the decimal number instead of using long one. 
		

	}

}
