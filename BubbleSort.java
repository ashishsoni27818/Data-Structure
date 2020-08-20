package com.DataStructure;

/* Algorithm to perform the Bubble Sort Algorithm */
public class BubbleSort {
	public static void main(String[]  args) {

// Initializing the array		
		int[] intArray = {20, 35,-10, 32, 45, 18, 19 };

// Traversing in the array		
		for(int UnsortedIndex = intArray.length - 1; UnsortedIndex > 0; UnsortedIndex--) {
			
			for(int i = 0; i < UnsortedIndex; i++) {

// Calling Swapping function			
				if(intArray[i] > intArray[i+1]) {
					swap(intArray, i, i+1 );
				}
			}
		}
		
// Printing the sorted array
		for(int i = 0; i < intArray.length; i++ ) {
			System.out.println(intArray[i]);
		}
	}

// Swaping the values in the array
public static void swap(int[] array, int i , int j) {
	if(i == j) {
		return;
	}
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}
}
