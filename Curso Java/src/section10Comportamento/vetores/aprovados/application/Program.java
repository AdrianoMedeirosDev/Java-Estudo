package section10Comportamento.vetores.aprovados.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        //consumir linha
        sc.nextLine();

        String[] vectName = new String[n];
        double[] vectNotaUm = new double[n];
        double[] vectNotaDois = new double[n];

        //inserção
        for (int i = 0; i < vectName.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            vectName[i] = sc.nextLine();
            vectNotaUm[i] = sc.nextDouble();
            vectNotaDois[i] = sc.nextDouble();

            //consumir linha
            sc.nextLine();

        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < vectName.length; i++) {
            if ((vectNotaUm[i] + vectNotaDois[i]) / 2 >= 6) {
                System.out.println(vectName[i]);
            }
        }

    }
}
