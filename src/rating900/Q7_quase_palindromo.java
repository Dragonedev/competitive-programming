package rating900;

import java.util.Scanner;

public class Q7_quase_palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = "ajjla";
		System.out.println(quasePalindromo(word) ? "SIM" : "NÃO");

	}

	public static boolean isPalindrome(String s, int left, int right) {
		while (left < right) {

			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}
		return true;

	}

	public static boolean quasePalindromo(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
			}
		}
		return true;
	}

}
