package rating900;

import java.util.Scanner;


public class Q4_contando_maiusculas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		int maiusculo = 0, minusculo = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				maiusculo++;
			} else {
				minusculo++;
			}
		}
		
		if(maiusculo > minusculo) {
			System.out.println(word.toUpperCase());
		} else {
			System.out.println(word.toLowerCase());
		}

	}

}
