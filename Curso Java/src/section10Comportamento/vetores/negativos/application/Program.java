package section10Comportamento.vetores.negativos.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número até 10: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        //consumir linha pendente
        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}
