package MethodHiding;


public class TestMain {	
	@SuppressWarnings("Static method`2w2`25oiuy76tw2531	")
	public static void main(String[] args) {
		Parent p = new Parent();
		p.printMethod();
		
		Parent p1 = new Child();
		p1.printMethod();
		
		Child c = new Child();
		c.printMethod();
		
		Child.printMethod();
	}
}
