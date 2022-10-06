
public class Question5 {
	
	public static void main(String[] args) {
		
		String myString = "madam";
//		String myString = "test";
		String reverseMyString = ""; 
			    
		int stringLength = myString.length();

		for (int i = (stringLength-1); i >=0; --i) {
			
			reverseMyString = reverseMyString + myString.charAt(i);
			
		}

			if (myString.equals(reverseMyString)) {
				
				System.out.print(myString + " is a palindrome.");
			      
			} else {
				
				System.out.print(myString + " is not a palindrome.");
			      
			}
			
		} 
		
	  
}
