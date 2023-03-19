package binarySearch;

public class SmallestLetter {

	public static void main(String[] args) {
		char[] arr = { 'c', 'f', 'j' };
		char target = 'j';
		char ans = nextGreatestLetter(arr, target);
		System.out.println(ans);

	}

	// return the index of smallest number that is greater than or equal to target
	static char nextGreatestLetter(char[] letters, char target) {

		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < letters[mid]) {
				end = mid - 1;

			} else {
				start = mid + 1;

			}
		}

		return letters[start % letters.length];

	}
}
