package loops;

public class Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for (int i = 10; i < 99; ++i) {
		      boolean isPrime = true;
		      int sqrt = (int)Math.ceil(Math.sqrt(i));
		      for (int divisor = 2; divisor <= sqrt; ++divisor) {
		        if (i % divisor == 0) {
		          isPrime = false;
		          break;
		        }
		      }
		      if (isPrime) {
		        System.out.println(i);
		      }
		    }
		}
	}
