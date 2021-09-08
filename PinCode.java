import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {

	public static void main(String[] args) {
		
		String zipCode = "A400088";
		String regex = "^[0-9]{6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(zipCode);
		
		System.out.println("Is Valid :"+matcher.matches());
		

	}

}
