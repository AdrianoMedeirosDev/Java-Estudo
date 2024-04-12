package section10Comportamento.vetores.mais_velho.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] vectNome = new String[n];
        double[] vectIdade = new double[n];

        //consumir linha
        sc.nextLine();

        String maisVelha = "None";
        double saldo = 0.0;

        //inserção dados
        for (int i = 0; i < vectIdade.length; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);

            System.out.print("Nome: ");
            vectNome[i] = sc.nextLine();

            System.out.print("Idade: ");
            vectIdade[i] = sc.nextDouble();

            //consumir linha
            sc.nextLine();

            if (vectIdade[i] > saldo) {
                saldo = vectIdade[i];
                maisVelha = vectNome[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + maisVelha);
    }
}
