import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digita? ");

        int n = sc.nextInt();
        int[] vect = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.printf("%S","Números Pares: \n");

        for(int i = 0;i<n;i++){
            if(vect[i] %2==0){
                System.out.print(vect[i]+" ");
            }
        }


    }
}