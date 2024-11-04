package Loops;

public class chat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, World!";
		int lengthOfString = str.length();
		System.out.println("Length of the string: " + lengthOfString); // Output: 13

		for (int i = 0; i < lengthOfString; i++) {
			System.out.println(str.charAt(i));
		}

	}

}
