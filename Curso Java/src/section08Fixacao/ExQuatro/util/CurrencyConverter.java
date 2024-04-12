package section08Fixacao.ExQuatro.util;

public class CurrencyConverter {

    public static final double IOF = (6 / 100.0) + 1;

    public double realPrice(double priceDolar, double amount) {
        return priceDolar * (amount * IOF);
    }
}
