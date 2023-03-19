package basicArrayAlgorithms;

import java.util.Arrays;

public class SearchInStrings {

	public static void main(String[] args) {
		String name = "Afjal";
		char target = 'l';

		System.out.println(search(name, target));
  System.out.println(Arrays.toString(name.toCharArray()));
	}
	
	

	// Character searching in String using for-loop
	static boolean search(String name, char target) {
		if (name.length() == 0) {
			return false;
		}
		for (int i = 0; i < name.length(); i++) {
			if (target == name.charAt(i)) {
				return true;
			}
		}

		return false;

	}

	// Character searching in String using for-each loop
	static boolean search2(String name, char target) {
		if (name.length() == 0) {
			return false;
		}
		for (char ch : name.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}
		return false;

	}

}
