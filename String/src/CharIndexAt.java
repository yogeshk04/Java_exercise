
public class CharIndexAt {

	public static void main(String[] args) {
		String str = "Aurangabad";
		
		char c = 'a';

		System.out.println(charIndex(str, c));

	}

	private static int charIndex(String str, char c) {

		int num = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				num++;
			}

		}
		return num;

	}

}
