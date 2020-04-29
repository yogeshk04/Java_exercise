
public class ToStringExample {
	
	private String name;
	private int id;

	public ToStringExample() {

	}
	public ToStringExample(String name, int id) {
		this.name = name;
		this.id = id;
	}
	/*
	@Override
	public String toString() {
		return "ToStringExample [name=" + name + ", id=" + id + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	*/
	//public String toString() {
		//return "Name:"+name+ ", Id:"+id;
		//return "Name:"+this.name+ ", Id:"+this.id;
//	}
	@Override
	public String toString() {
		return "ToStringExample [name=" + name + ", id=" + id + "]";
	}

}
