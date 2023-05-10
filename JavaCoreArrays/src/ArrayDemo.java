// Program to demonstrate Array
public class ArrayDemo {
	public static void main(String[] args) {
		// Arrays are fixed sized, organized collection of elements with same data type.
		// Arrays are identified by `[]` called subscript.
		// Arrays are of two types: One dimensional and multidimensional.eg. arrayOne[], arrayMulti[][].
		
// Initialization: There are two ways we can initialize arrays-
	// Static type:
		int[] nums=new int[5]; 
	// Dynamic type:
		int range=5;
		int[] numsOne=new int[range];
		
// Arrays have whole number indexes pointing to each position of an array.
		int[] numsTwo= {2,3,4,5,9}; // when array is declared directly with values, the length is taken as the size of the array.
		System.out.println("Zeroth index of numsTwo array is: "+numsTwo[0]+", last value in the numsTwo array is: "+ numsTwo[numsTwo.length-1]);
		// if we try to access an index more than `length-1` or any negative number, we get an ArrayIndexOutOfBoundsException exception.
		
// Iteration:
	// We can use for, while, do-while and for-each loops to iterate through an array. eg:
		
		// for:
		for(int i=0;i<numsTwo.length;i++) 
			System.out.print(numsTwo[i]);
		System.out.println();
		
		// while:
		int i=0;
		while(i<numsTwo.length) {
			System.out.print(numsTwo[i]);
			i++;
		}
		System.out.println();
		
		// do-while:
		int j=0;
		do {
			System.out.print(numsTwo[j]);
			j++;
		}
		while(j<numsTwo.length);
		System.out.println();
		
		// for-each:
		for(int num : numsTwo)
			System.out.print(num);

	}

}
