
public class Question2 {

	public static void main(String[] args) {
	
		int[] array0 = {1, 77, -5, 2, 65, 30};
	    int[] array1 = {-10, 50, 15, 2, 77};
	    int num1 = 65;
	    int num2 = 77;
	    boolean contains = false;

	    	for (int i : array0) {
	    		if (i == num1 && i == num2) {
	    			contains = true;
	    			break;
	    			
	    			}
	    		}
	    
	    if(contains)
	    	System.out.println("Contains both " + num1 + num2);
	    else
	    	System.out.println("Doesn't contain both 65 and 77.");
	    
    	
	    
	    	for (int i : array1) {
	    		if (i == num1 && i == num2) {
	    			contains = true;
	    			break;
	    			
    				}
	    		}
    
	    if(contains)
	    	System.out.println("Contains both " + num1 + num2);
	    else
	    	System.out.println("Doesn't contain both 65 and 77.");
    	

	    
	  }
}
