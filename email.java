import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
public static void main(String[] args) {
		
		String email = "  abc@gmail.com.1a   ";
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		System.out.println("Is Valid :"+matcher.matches());
		

	}
	
}
