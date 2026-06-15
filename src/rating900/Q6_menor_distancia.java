package rating900;

import java.util.Scanner;

public class Q6_menor_distancia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] v = new int[n];

		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}

		int menor = Math.abs(v[0] - v[1]), aux;

		for (int i = 1; i < v.length; i++) {

			aux = Math.abs(v[i - 1] - v[i]);

			if (aux < menor) {
				menor = aux;
			}
		}

		System.out.println(menor);
	}

}
