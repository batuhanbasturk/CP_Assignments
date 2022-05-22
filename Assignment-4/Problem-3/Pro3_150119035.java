/*Name Surname= Batuhan Baþtürk ID =150119035
 * 
 * 
 * Purpose of this program is write a program that takes an input letter and outputs it in a diamond shape. Given a letter,
it prints a diamond starting with 'A', with the supplied letter at the widest point.
 */
import java.util.Scanner;
public class Pro3_150119035 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter a letter:");
    	//get char letter from user
    	char letter = input.next().charAt(0);
    	
        char [][] diamond = constructDiamond(letter);
        //for not to print if user didnt enter alphabet char
        if (diamond != null) {
            printDiamond(diamond);
        }
    }
    public static char[] alphabet = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static char[][] constructDiamond (char letter) {
    	

        int position = findLetterPosition(letter);//get method value
        //if user enters different stuffs rather than array char than print invalid input
        if (position < 0) {
            System.out.println("Invalid Input !");
            return null;
        } 
        else {

            int arraySize = 2 * (position + 1) - 1;//get an edge of the square of two dimensional array
            char[][] diamonds = new char[arraySize][arraySize];//create two dimensional array

            if (arraySize == 1) { //exception for A print to directly print A
                diamonds[1][1] = letter;
            } 
            else {
            	//find the middle of one edge and separation into right and left
                int mid = arraySize / 2;
                int leftCursor = mid;
                int rightCursor = mid;
                //array size a göre her yeri nokta ile printleyecek
                for (int i = 0; i < arraySize; i++) {
                    for (int j = 0; j < arraySize; j++) {
                        diamonds[i][j] = '.';
                    }
                //to print alphabet char instead of '.' in desired location
                    diamonds[i][leftCursor] = alphabet[mid - leftCursor];
                    diamonds[i][rightCursor] = alphabet[mid - leftCursor];
                //while mid value is bigger than i it will print letter to outwards(top side of array)
                    if (i < mid) {

                        leftCursor -= 1;
                        rightCursor += 1;
                    } 
                    //while i value is bigger than i it will print letter to inward(bottom side of array)
                    else {

                        leftCursor += 1;
                        rightCursor -= 1;
                    }
                }
            }
            //return two dimensional array
            return diamonds;

        }
    }
    //print two dimensional array after one line jump to other
    public static void printDiamond (char[][] diamond) {
        for (int i = 0; i < diamond.length; i++) {
            for (int j = 0; j < diamond.length; j ++) {
                System.out.print(diamond[i][j]);
            }
            System.out.println("");
        }
    }

    public static int findLetterPosition(char letter) {
    	//to find in array position on alphabet
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == letter) {
                return i;
            }
        }
        return -1;
    }
}
