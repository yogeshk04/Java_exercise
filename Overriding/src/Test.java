
public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method(1);
		
		Child c = new Child();
		c.method(2);
		;
		Parent pc = new Child();
		pc.method(1);
//		pc.method(11);
		
		Child1 c1 = new Child1();
		c1.method1();
		
		
	}

}
