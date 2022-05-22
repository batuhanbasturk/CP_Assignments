/*Name Surname = Batuhan Baþtürk ID = 150119035
 * 
 * 
 * Purpose of this program is write a program that calculates the invoice of each flat in the apartment building. There are
   N flats in a building and apartment heating is the central system. 30% of bill will be shared
   equally among the flats, the rest (70%) will be shared according to the consumption of each
   flat.
 * 
 */
import java.util.Scanner;
public class Pro1_150119035 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//getting flat number from user to make same number flat array
		double flats[] = new double [input.nextInt()];
		//get consumption of each flat from user
		for(int i = 0;i<flats.length;i++) {
			flats[i] = input.nextDouble();
		}
		//get total bill from user
		double totalBill = input.nextDouble();
		
		 double[] bills = calculateTheInvoice(flats,totalBill);
		 printBills(bills);

	}
	
	public static double[] calculateTheInvoice (double[] flats, double totalBill) {
		//creating bill array for each flat user enter
		double bills [] = new double[flats.length];
		// calculate the percentages of bills
		double thirtypercentofbills = totalBill * 0.30;
		double seventypercentofbills = totalBill * 0.70;
		// get average value of thirty percent of bills 
		double averagethirtypercentofbills = thirtypercentofbills / (double)flats.length;
		// get consumption of all flats 
		double consumptionsum = 0;
		for(int i = 0;i < flats.length;i++) {
			consumptionsum = consumptionsum + flats[i];
		}
		// get bill one by one each flat 
		int i = 0;
		while(i < flats.length) {
			bills[i] = averagethirtypercentofbills + (flats[i] * seventypercentofbills) / consumptionsum;
			 i++;
		}
		return bills;
	}
	
	public static void printBills (double[] bills) {
		//run the value (price) of each flat
		for(int i = 0;i < bills.length;i++) {
			System.out.printf("Flat #" + (i + 1) + ":" + " " + ((int)(bills[i] * 100)) / 100.0 + "\n");
			
		}
	   
	}

}
