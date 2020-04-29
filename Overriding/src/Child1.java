
public class Child1 extends Child {
public int method1() {
	System.out.println("Child 1 method");
	
	Child c = new Child();
	c.method(3);
	return 0;
}
}
