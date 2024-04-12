package section10Comportamento.vetores.maior_posicao.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        //consumir linha
        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        //consumir linha
        sc.nextLine();

        double maiorNumero = 0;
        int position = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maiorNumero) {
                maiorNumero = vect[i];
                position = i;
            }
        }

        System.out.printf("MAIOR VALOR = %f\n", maiorNumero);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", position);
    }
}
