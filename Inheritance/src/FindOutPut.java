
class FindOutPut {
	
	public void methodA()
	{}

}

class B extends FindOutPut{
	public void methodB() {
		
	}
	
	
	public static void main(String[] args) {
		FindOutPut p = new B();
		p.methodA();
	}
}


