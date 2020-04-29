import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ReadCSVFile {
	public static void main(String[] args) {
		try {
			
			String csvFile = "D:\\Learn_More\\SpringBoot-REST_API\\caronavirus-tracker\\covid19-confirm.csv";
			
			// create BufferReader to read csv file
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			String strLine = "";
			StringTokenizer st = null;
			int lineNumber = 0, tokeNumber = 0;
			
			// read comma separated file line by line
			while((strLine = br.readLine()) != null) {
				lineNumber++;
				
				// break comma separated line ussing ","
				st = new StringTokenizer(strLine, ",");
				
				while(st.hasMoreElements()) {
					tokeNumber++;
					System.out.println("Line :" + lineNumber + ", Token : " + tokeNumber + ", Token: " + st.nextToken());
					//System.out.println(cols[4]);
				}
			}
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
