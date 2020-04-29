
public class stringStringBufferExample {
	public static void main(String[] args) {
		
		String name = new String("Manasvi");
		System.out.println(name);
		name.concat("Nikam");		
		System.out.println(name);
		
		System.out.println("-------------------------");
		StringBuffer sb = new StringBuffer("Yogesh");
		System.out.println(sb);
		sb.append(" Nikam");
		System.out.println(sb);
		
		
		String name1 = "Nikam ".concat(name);
		System.out.println(name1);
		
		//stringStringBufferExample str = new stringStringBufferExample();
		//System.out.println(str.toString());
		
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder
				.append("AuditRequestDTO [messageCategoryId=")
				.append("messageCategoryId")
				.append(", startTimeRange=")
				.append("startTimeRange")
				.append(", endTimeRange=")
				.append("endTimeRange")
				.append(", status=")
				.append("status")
				.append(", fromUser=")
				.append("fromUser")
				.append(", fromApp=")
				.append("fromApp")
				.append("]")
				.toString();
	}

}
