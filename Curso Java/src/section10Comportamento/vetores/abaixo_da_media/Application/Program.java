package section10Comportamento.vetores.abaixo_da_media.Application;

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

        //inserção vect
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();

            saldo += vect[i];
        }

        double media = saldo / vect.length;

        System.out.printf("MEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}
