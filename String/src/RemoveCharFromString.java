
public class RemoveCharFromString {
	
	public static void main(String[] args) {
		
		String str = "Aurangabad";
		
		System.out.println(removeChr(str, 'a'));
	}

	private static String removeChr(String str, char c) {

		if(str == null)
			return null;

		return str.replaceAll(Character.toString(c), " ");
	}

}
