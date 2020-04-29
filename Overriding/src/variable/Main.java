package variable;

public class Main {
	public static void main(String[] args) {
		P p = new P();
		System.out.println(p.x);
		
		C c = new C();
		System.out.println(c.x);
		
		P cp = new C();
		System.out.println(cp.x);
	}

}
