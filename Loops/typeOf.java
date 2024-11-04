package Loops;

public class typeOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Integer(5);

		if (obj instanceof String) {
		    System.out.println("It's a String");
		} else if (obj instanceof Integer) {
		    System.out.println("It's an Integer");
		} // Output: It's an Integer

		int x = 10;
		Integer wrapper = Integer.valueOf(x);
		System.out.println(wrapper.getClass().getName()); // Output: java.lang.Integer
		
	}

}
