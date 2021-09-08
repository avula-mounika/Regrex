import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {

	public static void main(String[] args) {
		
		String zipCode = "400 088";
		String regex = "^[0-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(zipCode);
		
		System.out.println("Is Valid :"+matcher.matches());
		

	}

}
