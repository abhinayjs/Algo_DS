package practice.general;

import java.util.*;

public class LargestNumberFromArray {
	
	static void printNumber(Vector<String> input) {
		Collections.sort(input, new Comparator<String>() {
			public int compare(String X, String Y) {
				String XY = X + Y;
				String YX = Y + X;
				
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});
		
		Iterator it = input.iterator();
		 
	    while(it.hasNext())
	        System.out.print(it.next());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> input = new Vector<>();
		input.add("54");
		input.add("546");
		input.add("548");
		input.add("60");
		
		printNumber(input);

	}

}
