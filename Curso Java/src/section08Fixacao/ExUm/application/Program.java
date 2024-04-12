package section08Fixacao.ExUm.application;


import section08Fixacao.ExUm.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height");

        System.out.println("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f \nPERIMETER = %.2f \nDIAGONAL = %.2f", rectangle.area(), rectangle.perimeter(), rectangle.diagonal());
    }
}
