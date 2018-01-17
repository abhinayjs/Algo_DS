package practice.general;

public class SumOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 12, 10, 15, -1, 7, 6, 
                5, 4, 2, 1, 1, 1 };
		int sum = 11;
		int len = arr.length;
		int countPair = 0;
		for (int i = 0; i < len; i++) {
			int ref = arr[i];
			for (int j = i + 1; j < len; j++) {
				if (i < len - 1 && (ref + arr[j] == sum)) {
					countPair += 1;
				}
			}
		}
		System.out.println(countPair);

	}

}
