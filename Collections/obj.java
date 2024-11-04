package Collections;

public class obj {
	
	public static void main(String[] args) {
        // Create an Object array with different types of data
        Object[] mixedArray = new Object[5];  // Array with size 5

        // Assign different types of data to the array
        mixedArray[0] = "Hello";      // String
        mixedArray[1] = 42;           // Integer (autoboxed to Integer object)
        mixedArray[2] = 3.14;         // Double (autoboxed to Double object)
        mixedArray[3] = true;         // Boolean (autoboxed to Boolean object)
        mixedArray[4] = 'A';          // Character (autoboxed to Character object)

        // Print out each element and its type
        for (Object element : mixedArray) {
            System.out.println("Value: " + element + " - Type: " + element.getClass().getSimpleName());
        }
    }

}
