import java.io.CharArrayReader;
import java.io.IOException;

class TestApp {

	public static void main(String[] args) {
		String obj = "abcdef";
		
		System.out.println(obj.getChars(srcBegin, srcEnd, dst, dstBegin););
		
		System.out.println(obj);
		int length = obj.length();
		System.out.println(length);
		char c[] = new char[length];
		System.out.println(c);
		obj.getChars(0, length, c, 0);
		
		//System.out.println(obj.getChars(0, length, c, 0));
		
		CharArrayReader io_1 = new CharArrayReader(c);
		CharArrayReader io_2 = new CharArrayReader(c, 0, 3);
		int i;
		try {
			while ((i = io_1.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
