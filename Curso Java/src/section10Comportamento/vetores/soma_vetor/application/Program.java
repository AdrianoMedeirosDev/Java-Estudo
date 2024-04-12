package section10Comportamento.vetores.soma_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        //consumo linha pendente
        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        //consumo linha pendente
        sc.nextLine();

        double montante = 0.0;

        for (int i = 0; i < vect.length; i++) {
            montante += vect[i];
        }

        System.out.printf("SOMA = %.1f", montante);

        double media = montante / vect.length;
        System.out.printf("MEDIA = %.1f", media);

    }
}
