package Loops;

public class forEach {

	public static void main(String[] args) {
		int[] nums = {2,3,-2,-1,-4,1};
		int nums1[] = {1,9,-7,2,1,2,4};
		String str[] = {"INDIA","UK","USA","CANADA"};
		
		String name="INDIA";
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		System.out.println("~~ -_- ~~ -+- --------");
		
		for(char c:name.toCharArray()) {
			System.out.println(c);
		}
		System.out.println("~~ -_- ~~ -+- --------");
				
		
		
		
		
		System.out.println("~~ -_- ~~ -+- --------");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		System.out.println("~~ -_- ~~ -+- --------");
		
		for(String i:str) {
			System.out.println(i);
		}
		
		System.out.println("~~ -_- ~~ -+- --------");
		
		for(int i: nums) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		for(int i:nums1) {
			System.out.println(i);
		}
		System.out.println("~~ -_- ~~ -+- --------");
		for(int j=0;j<nums1.length;j++) {
			System.out.println(nums1[j]);
			
		}
		// TODO Auto-generated method stub

	}

}
