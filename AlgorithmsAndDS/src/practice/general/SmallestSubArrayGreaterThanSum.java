package practice.general;

public class SmallestSubArrayGreaterThanSum {

	static int subArray(int arr[], int len, int targetSum) {
		int min_len = len + 1;
		for (int start=0;start<len;start++) {
			int curr_sum = arr[start];
			
			if (curr_sum > targetSum)
				return 1;
			
			for(int end = start + 1; end<len; end++) {
				System.out.println("start: " + start);
				System.out.println("end: " + end);
				curr_sum += arr[end];
				System.out.println("curr_sum: " + curr_sum);
				if (curr_sum > targetSum && end-start+1<min_len)
					return min_len = end-start+1;
			}
			
		}
		return min_len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1, 4, 45, 6, 10, 19};
		int x = 51;
        int n1 = arr.length;
        int res1 = subArray(arr, n1, x);
        if (res1 == n1+1)
           System.out.println("Not Possible");
        else
           System.out.println(res1);
	}

}
