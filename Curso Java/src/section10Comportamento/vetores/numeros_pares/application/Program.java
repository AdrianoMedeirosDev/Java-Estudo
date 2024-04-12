package section10Comportamento.vetores.numeros_pares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        //consumir linha pendente
        sc.nextLine();

        int count = 0;

        //inserir entradas
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                count += 1;

                System.out.print(vect[i] + " ");
            }
        }


        System.out.printf("\nQUANTIDADE DE PARES = %d", count);

    }
}
