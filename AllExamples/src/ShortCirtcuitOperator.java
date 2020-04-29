
public class ShortCirtcuitOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		if(++x<10 & ++y > 20) {
			x++;
		}
		else {
			y++;
		}
		System.out.println(x + " and " + y);
	}

}
