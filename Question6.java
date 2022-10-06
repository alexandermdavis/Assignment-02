
public class Question6 {

	public static void main(String[] args) {
		 
		String text = "hello everyone. let's write some useful Java code today. we will begin with strings.";  
		String[] stringArray = null;  
		
		stringArray = text.split(" ");   
		
		for (int i=0; i< stringArray.length; i++){   
			
		}  
		  
		String a = stringArray[0];
		String result1 = a.substring(0, 1).toUpperCase() + a.substring(1);
		
		String b = stringArray[2];
		String result2 = b.substring(0, 1).toUpperCase() + b.substring(1);
		
		String c = stringArray[9];
		String result3 = c.substring(0, 1).toUpperCase() + c.substring(1);
		

		System.out.print(result1 + " ");
		System.out.print(stringArray[1] + " ");
		System.out.print(result2 + " ");
		System.out.print(stringArray[3] + " ");
		System.out.print(stringArray[4] + " ");
		System.out.print(stringArray[5] + " ");
		System.out.print(stringArray[6] + " ");
		System.out.print(stringArray[7] + " ");
		System.out.print(stringArray[8] + " ");
		System.out.print(result3 + " ");
		System.out.print(stringArray[10] + " ");
		System.out.print(stringArray[11] + " ");
		System.out.print(stringArray[12] + " ");
		System.out.print(stringArray[13] + " ");
		
	}
		    
}
