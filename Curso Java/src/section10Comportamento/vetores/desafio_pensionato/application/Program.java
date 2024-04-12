package section10Comportamento.vetores.desafio_pensionato.application;

import section10Comportamento.vetores.desafio_pensionato.entities.Pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        //consumir linha
        sc.nextLine();

        Pensionato[] vect = new Pensionato[10];

        for (int i = 1; i <= n; i++) {
            System.out.printf("Rent #%d: \n", i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int quarto = sc.nextInt();

            //consumir linha
            sc.nextLine();

            vect[i] = new Pensionato(name, email);
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i]);
            }
        }
    }
}

