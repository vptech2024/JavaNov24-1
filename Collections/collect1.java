package Collections;

import java.util.ArrayList;
import java.util.List;

public class collect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("ABC");
		
		List<String> strList=new ArrayList<String>();
		strList.add("D");
		strList.add("C");
		strList.add("B");
		
		
		int size = list.size();
		System.out.println("Size of list: " + size); // Output: 2

		System.out.println("List elements: ");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("List elements: ");
		for (String str : strList) {
			System.out.println(str);
		}
	
	}

}
