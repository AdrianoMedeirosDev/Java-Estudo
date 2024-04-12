package section10Comportamento.matrizes.exDois.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira a quantia de linhas da matriz: ");
        int linhas = sc.nextInt();

        System.out.println("Insira a quantia de colunas da matriz: ");
        int colunas = sc.nextInt();

        int[][] mat = new int[linhas][colunas];

        //Limpar Buffer
        sc.nextLine();


        //Entrada Matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        //Limpar Buffer
        sc.nextLine();

        System.out.println("Insira um número que deseja buscar na matriz: ");
        int numberFound = sc.nextInt();

        //Limpar Buffer
        sc.nextLine();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == numberFound) {
                    String numberPosition = "Position " + i + ", " + j;
                    System.out.println(numberPosition);
                    //Left
                    if (j > 0) {
                        String numberLeft = "Left: " + mat[i][j - 1];
                        System.out.println(numberLeft);
                    }
                    if (j < mat[i].length - 1) {
                        String numberRight = "Right: " + mat[i][j + 1];
                        System.out.println(numberRight);
                    }
                    if (i < mat.length - 1) {
                        String numberDown = "Down: " + mat[i + 1][j];
                        System.out.println(numberDown);
                    }
                    if (i > 0) {
                        String numberUp = "Up: " + mat[i - 1][j];
                        System.out.println(numberUp);
                    }
                }
            }
        }
        sc.close();
    }
}
