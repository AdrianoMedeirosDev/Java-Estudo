package section08Fixacao.ExQuatro.application;



import section08Fixacao.ExQuatro.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        double priceDolar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", cc.realPrice(priceDolar, amount));
        sc.close();
    }
}
