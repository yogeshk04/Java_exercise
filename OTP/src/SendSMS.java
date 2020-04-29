
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
 
/**
 * https://control.textlocal.in/settings/apikeys/
 * @author 9pabo3
 *
 */
public class SendSMS {
	int OTP;
	
	public String sendSms() {
		
		try {
			// Construct data
			String apiKey = "apikey=" + URLEncoder.encode("7aTFgaptoQw-3t5cmJOmpvSHaKDThr8zK9FB0Zjdzp", "UTF-8");
			Random ran = new Random();
			OTP = ran.nextInt(999999);
			String name = "";//txtName.getText(); 
					//new String();			
			
			String message = "&message=" + URLEncoder.encode("Hey, This is your message", "UTF-8");
			String sender = "&sender=" + URLEncoder.encode("TXTLCL", "UTF-8");
			String numbers = "&numbers=" + URLEncoder.encode("918123456789", "UTF-8");
			
			// Send data
			String data = "https://api.textlocal.in/send/?" + apiKey + numbers + message + sender;
			URL url = new URL(data);
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			
			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			String sResult="";
			while ((line = rd.readLine()) != null) {
			// Process line...
				sResult=sResult+line+" ";
			}
			rd.close();
			
			return sResult;
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
	}
}