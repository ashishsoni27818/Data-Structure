package com.DataStructure;

/* ----------Selection Sort-------------
 * In Selection we consider the element at first Index as the largest 
 * then we traverse through the array and compare it with other element in the array
 * After traversing through the array we can swap the element. 
 */
public class SelectionSort {

	public static void main(String args[]) {
	// Initializing Array
		int[] intArray = {20, 10, 13, 56, 37, 8, 9};
		
	// Traversing through the unsorted Array and complete Sorting	
		for(int unsorted = intArray.length - 1; unsorted > 0; unsorted--) {
			int largest = 0;
			
	// Picking the largest element in the array		
			for(int i = 0; i <= unsorted; i++){
				
				if(intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			
	// Swaping the largest element in the array.
			Swap(intArray, largest, unsorted);
		}
		
	// Printing the array in output	
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
	
	// Swap function to swap the element in the array
	public static void Swap(int[] Array, int i, int j) {

			if(i == j) {
				return;
			}
			int temp = Array[j];
			Array[j] = Array[i];
			Array[i] = temp;		
	}
}
