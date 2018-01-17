package practice.sorting;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[] arr, int len) {
		int temp, j;
		for (int i = 1; i < len; i ++) {
			temp = arr[i];
			for(j = i-1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j+1] = temp;
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
		insertionSort(arr, size);
		System.out.println("The sorted array is:");
		for (int i = 0; i < size; i++){
			System.out.println(arr[i]);
		}

	}

}
