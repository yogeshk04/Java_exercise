
public class methodOverload {
	
	int sum(int a, int b) {
		return a+b;
	}
	
	int sum (int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		methodOverload m = new methodOverload();
		System.out.println(m.sum(10, 10));
		System.out.println(m.sum(10, 10, 10));
		
		//System.out.println(m);
		//System.out.println(m);
		
	}

}
