
class A {
	int x = 10;

	class B extends A {
		private int y = 20;
	}

	class C extends B {
		private int z = 30;
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);

		//B b = new B();

		// System.out.println(bobj.x);
	}

}
