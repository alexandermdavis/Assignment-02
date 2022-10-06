
public class Question4 {

	public static void main(String[] args) {
		
	    boolean result = false;
	    
	    String myString = "Saba";
        String myString2 ="John";
        System.out.println(isUnique(myString));
        System.out.println(isUnique(myString2));
        
	}
    
    public static boolean isUnique(String input) {
        
    	for(int i=0; i < input.length(); i++) {
            char charInString = input.charAt(i);
            int count = 0;
           
            for(int j=i; j < input.length(); j++) {
                if (charInString == input.charAt(j))
                count++;
            	
            }
            
            if(count > 1)
            return false;
            
        }
    	
    	return true;
    		
	}

}
