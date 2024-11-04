package Loops;

public class stringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello, Java!");
		int length = sb.length();
		System.out.println("Length of StringBuilder: " + length); // Output: 12

		for (int i = 0; i < length; i++) {
			System.out.println(sb.charAt(i));
		}

	}

}
