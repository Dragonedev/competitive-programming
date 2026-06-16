package rating900;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_fila_do_mercado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> fila = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            fila.add(sc.nextInt());
        }

        int minutos = 0;

        while (!fila.isEmpty()) {
            int produtos = fila.poll(); // pessoa da frente

            produtos--; // atende 1 produto
            minutos++;

            if (produtos > 0) {
                fila.add(produtos); // volta para o final da fila
            }
        }

        System.out.println(minutos);

        sc.close();
    }
}