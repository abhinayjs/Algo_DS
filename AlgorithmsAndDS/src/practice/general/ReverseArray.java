package practice.general;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6};
		int temp[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0;i--) {
			int k = 0;
			while (k < arr.length) {
				temp[k] = arr[i];
				k++;
			}
		}
		
		for (int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}

}
