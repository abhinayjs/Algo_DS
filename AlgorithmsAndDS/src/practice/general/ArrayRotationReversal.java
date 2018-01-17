package practice.general;

import java.util.*;

public class ArrayRotationReversal {
	
	public static void reversalRotation(int arr[], int d) {
		int n = arr.length;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
		
	}
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[]{1,2,3,4,5,6,7}; 
		reversalRotation(intArray, 2);
		for (int i=0; i<intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
	}

}
