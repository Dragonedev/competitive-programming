package rating900;

import java.util.Scanner;

public class Q2_soma_maxima {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, total;
		a = 10;
		b = 5;
		c = 7;

		int max = Math.max(Math.max(a + b + c, a * b * c),
						Math.max(
								Math.max((a + b) * c, a + (b * c)), 
								Math.max(a * b + c, a + b * c)
						)
				);
		
		System.out.println(max);

	}

}
