import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Ente the string: ");
		String str = input.next();
			
		StringBuffer str1 = new StringBuffer(str);
		str = str1.toString();
			//String rev = new StringBuffer(str).reverse().toString();
		isPalindrome(str);
		
		
	

	}

	public static void isPalindrome(String s) {
		String rev = new StringBuffer(s).reverse().toString();

		if (s.equals(rev)) {
			System.out.println("Is palindrome...");
		} else {
			System.out.println("Not a palindrome...");
		}
	}

}
