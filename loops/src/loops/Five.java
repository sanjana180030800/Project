package loops;
import java.util.*;
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       char input_char=sc.next().charAt(0);
     if ((input_char >= 65 && input_char <= 90)
         || (input_char >= 97 && input_char <= 122))
         System.out.println(" Alphabet ");

     else if (input_char >= 48 && input_char <= 57)
         System.out.println(" Digit ");

     else
         System.out.println(" Special Character ");
 }

}
	