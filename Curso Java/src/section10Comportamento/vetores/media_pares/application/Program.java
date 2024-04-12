package section10Comportamento.vetores.media_pares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        //consumir linha
        sc.nextLine();

        double[] vect = new double[n];

        double saldo = 0.0;
        double nPar = 0.0;
        double media = 0.0;

        //inserção numeros
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();

            if (vect[i] % 2 == 0) {
                nPar += 1;
                saldo += vect[i];
            }
        }

        if (nPar != 0) {
            media = saldo / nPar;
            System.out.printf("MEDIA DOS PARES %.1f", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
