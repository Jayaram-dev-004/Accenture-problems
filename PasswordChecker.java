// - – At least 4 characters
// - – At least one numeric digit
// - – At Least one Capital Letter
// - – Must not have space or slash (/)
// - – Starting character must not be a number
public class PasswordChecker {
   public static String CheckPassword(String str) {
		int n = str.length();

		if (n < 4)
			return "Invalid Password"; 

		if (Character.isDigit(str.charAt(0)))
			return "Invalid Password"; 

		boolean hasDigit = false, hasUpper = false;

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);

			if (ch == ' ' || ch == '/')
				return "Invalid Password"; 

			if (Character.isDigit(ch))
				hasDigit = true;

			if (Character.isUpperCase(ch))
				hasUpper = true;
		}

		return (hasDigit && hasUpper) ? "Correct Password" : "Invalid Password"; 
	}

	public static void main(String[] args) {
		System.out.println(CheckPassword("aA1_67"));
		System.out.println(CheckPassword("a987 abC012")); 
	}
}
