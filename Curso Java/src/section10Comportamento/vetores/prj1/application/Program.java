package section10Comportamento.vetores.prj1.application;

import section10Comportamento.vetores.prj1.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        //consumir linha pendente
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha pendente após o preço

            vect[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f", avg);

        sc.close();
    }
}
