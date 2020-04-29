
public class StringToInteger {
	public static void main(String[] args) {
		String test = "1000";
		int itest = Integer.parseInt(test);
		System.out.println(itest/3);
		
		String t = "2323";
		//t/2 error
		int intt = Integer.valueOf(t);
		
		System.out.println(intt/2);
	}

}
