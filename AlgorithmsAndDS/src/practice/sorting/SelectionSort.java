package practice.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int[] arr, int len) {
		int minIndex, temp;
		for(int i=0;i<len;i++) {
			minIndex = i;
			for (int j = i+1; j < len; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
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
		selectionSort(arr, size);
		System.out.println("The sorted array is:");
		for (int i = 0; i < size; i++){
			System.out.println(arr[i]);
		}

	}

}
