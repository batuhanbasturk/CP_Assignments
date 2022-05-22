import java.util.Scanner;
//Name Surname: Batuhan Baştürk ID:150119035
//Purpose of this program is graphing according to the equation the user wants on x and y axis

public class HW3_150119035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		int select;//I define select as int 
		
		do {
			System.out.println("Which shape you would like to draw?"
					+ "\n 1. Line "
					+ "\n 2. Parabola"
					+ "\n 3. Circle"
					+ "\n 4. Exit");
			//Get select number from user
			select = input.nextInt();
			//I define equation coefficents that i will use
			int a,b,c,r;
	        // if user selects Line 
			if(select == 1) {
			System.out.println("Line formula is y = ax+b"
					+"\nPlease enter coefficients a and b:");
             //I want the user to enter values ​​a and b for equation
			 a = input.nextInt();
			 b = input.nextInt();
			
			for(int y = 10;y >= -11;y--) { // I determine y-axis length
			     
				for(int x = -10;x<=11;x++) {//I determine x-axis length
		          
				    if (y  == a * x + b) {//To put a star according to the equation
						System.out.print("*");	
				    }
					
				    else {
				     if(x == 0 && y != 10) {//To draw y-axis
						System.out.print("|");
					}
					else if(y == 0 && x != 11) {//To draw x-axis
						System.out.print("-");
					}
					else if(x == 11 && y == 0) {//To set special coordinate to write x character
						System.out.print("x");
					}
					else if(y == 10 && x == 0) {//To set special coordinate to write y character
						System.out.print("y");
					}
					
					else {//To put a space if it's not in other's settings
						System.out.print(" ");
					}
				  }
				}
				System.out.println();//To jump into another line when u finish first y value and go back beginning of for loop
				
	         }
	      }
			else if(select==2) {//if user selects to draw parabola
			System.out.println("Parabola formula is y = ax^2 + bx + c"
					+ "\nPlease enter coefficents a, b and c:");
			//getting a,b and c values for equation
			 a = input.nextInt();
			 b = input.nextInt();
			 c = input.nextInt();
			 for(int y = 10;y >= -11;y--) {// I determine y-axis length again
			     
					for(int x = -10;x<=11;x++) {//I determine x-axis length again
			          
					    if (y  == a * (int)Math.pow(x, 2) + b * x + c) {//To put a star according to the equation 
							System.out.print("*");	
					    }
						
					    else {
					     if(x == 0 && y != 10) {//To draw y-axis
							System.out.print("|");
						}
						else if(y == 0 && x != 11) {//To draw x-axis
							System.out.print("-");
						}
						else if(x == 11 && y == 0) {//To set special coordinate to write x character
							System.out.print("x");
						}
						else if(y == 10 && x == 0) {//To set special coordinate to write y character
							System.out.print("y");
						}
						
						else {//To put a space if it's not in other's settings
							System.out.print(" ");
						}
					 }
				  }
					System.out.println();//To jump into another line when u finish first y value and go back beginning of for loop
					
		     }
		}
			else if(select==3){//if user selects to draw circle
			System.out.println("Circle formula is (x-a)^2 + (y-b)^2 = r^2"
					+"\nPlease enter center's coordinates (a,b) and radius:");
			//getting a,b and r values for equation
			a = input.nextInt();
			b = input.nextInt();
			r = input.nextInt();
			for(int y = 10;y >= -11;y--) {// I determine y-axis length again
			     
				for(int x = -10;x<=11;x++) {//I determine x-axis length again
		          
				    if ((int)Math.pow((x - a), 2) + (int)Math.pow((y - b), 2) == Math.pow(r, 2)) {//To put a star according to the equation
						System.out.print("*");	
				    }
					
				    else {
				     if(x == 0 && y != 10) {//To draw y-axis
						System.out.print("|");
					}
					else if(y == 0 && x != 11) {//To draw x-axis
						System.out.print("-");
					}
					else if(x == 11 && y == 0) {//To set special coordinate to write x character
						System.out.print("x");
					}
					else if(y == 10 && x == 0) {//To set special coordinate to write y character
						System.out.print("y");
					}
					
					else {//To put a space if it's not in other's settings
						System.out.print(" ");
					}
				  }
				}
				System.out.println();//To jump into another line when u finish first y value and go back beginning of for loop			
	       }
	   }
			else // if user enters different numbers rather than 1 2 3 4 stop program
				System.exit(1);
	} while(select != 4);// asks user what do u want to draw  and also for the chosen select for loop is working (until press 4)
		
				
  }
 }
 

