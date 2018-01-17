package practice.general;

import java.util.HashMap;

public class NonRepeatingCharInArray {

	static Character getNonRepeatingCharacter(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (hm.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tarzan";

		System.out.println(getNonRepeatingCharacter(str));
	}

}
