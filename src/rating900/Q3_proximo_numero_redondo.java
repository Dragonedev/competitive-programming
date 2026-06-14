package rating900;

import java.util.Scanner;

public class Q3_proximo_numero_redondo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int redondo = 0, resto;

		resto = (10 - (n % 10)) % 10;
		
		System.out.println(resto);

	}

}
