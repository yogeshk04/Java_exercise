import java.util.Scanner;

public class RemoveGivenChar {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner input = new Scanner(System.in);

		String str;
		str = input.next();

		System.out.println(removeChar(str, 'y'));
		;
	}

	// a method that will remove fiven character from the String.
	public static String removeChar(String str, char c) {

		if (str == null)
			return null;
		return str.replaceAll(Character.toString(c), "");

	}
}
