package arrays;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] num = {1, 2, 3, 4, 5};
		    int toFind = 6;
		    boolean found = false;

		    for (int n : num) {
		      if (n == toFind) {
		        found = true;
		        break;
		      }
		    }
		    
		    if(found)
		      System.out.println(toFind + " is found.");
		    else
		      System.out.println(toFind + " is not found.");

	}

}
