package rating900;

import java.util.Scanner;

public class Q5_pedra_papel_tesoura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = "pedra";
		String b = "pedra";
		String vencedor = "";

		if (a.equals("pedra") && b.contains("tesoura")) {
			vencedor = "João";
		} else if (a.equals("papel") && b.equals("pedra")) {
			vencedor = "João";
		} else if (a.equals("tesoura") && b.equals("papel")) {
			vencedor = "João";
		} else if (a.equals(b)) {
			vencedor = "Empate";
		} else {
			vencedor = "Maria";
		}

		System.out.println(vencedor);

	}

}
