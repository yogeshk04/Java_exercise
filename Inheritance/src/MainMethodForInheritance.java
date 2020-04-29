
public class MainMethodForInheritance {
	public static void main(String[] args) {
		ParentClass pc = new ChildClass();
		
		System.out.println(pc.id);
		System.out.println(pc.name);
		//pc.parenMethod();
		//pc.childMethod();
		
		//System.out.println(pc.cid);
		//System.out.println(pc.cname);
		
		ChildClass cl = new ChildClass();
		System.out.println(cl.id);
		System.out.println(cl.name);
		System.out.println(cl.id);
		System.out.println(cl.name);
		cl.childMethod();
		cl.parenMethod();
		
		//ChildClass clc = new ParentClass();
		
		pc.process();
	}

}

