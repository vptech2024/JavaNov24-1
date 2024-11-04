package Loops;

public class try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		int count = 0;
		String stra=Integer.toString(a);
		System.out.println(stra);
		for(char c: stra.toCharArray()) {
			System.out.println(c);
			count++;
		}
		System.out.println(count);
		System.out.println("!-~ ~~  ~~ ~~ ~~!");
		int num = 123;
		
		String strV =  String.valueOf(num);
		
		System.out.println(strV);
		
		int num1 = 123;
		String str1 = "" + num1; 
		System.out.println(str1);
		
		int numd = 512;
		String strf = String.format("%d", numd);
		System.out.println(strf);
		
		String str = "Hello";
		System.out.println(str.getClass().getName()); // Output: java.lang.String
		System.out.println(str1.getClass().getName()); // Output: java.lang.String
	}
	
}
