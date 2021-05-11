package loops;
import java.util.*;
public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  char ch;
	        int temp;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Lowercase : ");
	        ch = sc.next().charAt(0);
			
	        temp = (int) ch;
	        temp = temp - 32;
	        ch = (char) temp;
			
	        System.out.print("Uppercase = " +ch);
	    }
	}
