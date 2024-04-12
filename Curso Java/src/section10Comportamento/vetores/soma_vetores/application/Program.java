package section10Comportamento.vetores.soma_vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];

        //inserção vetor A
        for (int i = 0; i < vectA.length; i++) {
            System.out.println("Digite os valores do vetor A: ");
            vectA[i] = sc.nextInt();
        }

        //inserção vetor B
        for (int i = 0; i < vectB.length; i++) {
            System.out.println("Digite os valores do vetor B: ");
            vectB[i] = sc.nextInt();
        }

        int[] vectC = new int[n];

        //geração vetor C
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }
    }
}
