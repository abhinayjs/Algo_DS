package practice.sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int[] arr, int len) {
		int temp, swaps;
		for (int i=0; i< len-1; i++) {
			swaps = 0;
			for (int j = 0; j < len-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swaps++;
				}
			}
			if (swaps == 0) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i<size;i++) {
			System.out.println("Enter element " + i + ": ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		bubbleSort(arr, size);
		System.out.println("The sorted array is:");
		for (int i = 0; i < size; i++){
			System.out.println(arr[i]);
		}
	}

}
