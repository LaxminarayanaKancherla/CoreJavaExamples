package strings;

public class replaceSubString {
	public static void main(String[] args) {
		String string = "Know Program - Java Programming";
		String substring = "Program";

		String resultantString = string.replace(substring, "");

		System.out.println("String after removing \"" + substring + "\" substring: \n" + resultantString);
	}
}
