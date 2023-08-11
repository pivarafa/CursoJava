import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("quantidade de linhas e de colunas: ");

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("digite os inteiros da mariz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");

            }
        }
        sc.nextLine();

        System.out.println("qual número deseja descobrir a posição ? ");
        int num = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == num) {
                    System.out.println("Posição " + i + ", " + j + ": ");
                    if (j > 0) {
                        System.out.println("left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("down: " + mat[i + 1][j]);
                    }
                }

            }
        }

        sc.close();
    }
}