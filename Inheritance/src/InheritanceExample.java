class Teacher{
	private String designation = "Teacher";
	private String collegeName = "BeginnersBook";
	public String getDesignation () {
		return designation;
		
	}
	
	protected void setDesignation(String designation) {
		this.designation = designation;
	}
	
	protected String getCollegeName() {
		return collegeName;
	}
	
	protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	void does() {
		System.out.println("Teaching");
	}
}


public class InheritanceExample extends Teacher {
	String mainSubject = "Physics";
	
	public static void main(String[] args) {
		InheritanceExample obj = new InheritanceExample();
		
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
	}

}
