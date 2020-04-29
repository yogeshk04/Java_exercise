
public class SampleString {
	public static void main(String[] args) {
		//String concatenation
		String s1 = "Rock ";
		String s2 = "Start";
		//Method 1 : using concat
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		//Method 2: using + operator
		String s4 = s1+s2;
		System.out.println(s4);
		
		//String length
		System.out.println("String s4 length= "+ s4.length());
		
		//Index of character
		System.out.println("Index of char = "+ s4.indexOf("r"));
		System.out.println("Index of char = "+ s4.charAt(7));
		
		//CompareTo method
		// Contain method
//		endsWith" Method
//		replaceAll" & "replaceFirst" Method
//		"tolowercase" & Java "touppercase" Method

//		Multiple references can be used for same String but it will occur in the same place; i.e., if
//				String h1 = "hello";
//
//				String h2 = "hello";
//
//				String h3 = "hello";
//
//				then only one pool for String “hello” is created in the memory with 3 references-h1,h2,h3
		
		
	}

}
