package loops;
import java.util.*;
public class Fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       int rows, number = 1, counter, j;
	       Scanner input = new Scanner(System.in);
	       rows = input.nextInt();
	       for ( counter = 1 ; counter <= rows ; counter++ )
	       {
	           for ( j = 1 ; j <= counter ; j++ )
	           {
	                System.out.print("*");
	                
	           }
	           //For new line
	           System.out.println();
	       }
	   }
	}