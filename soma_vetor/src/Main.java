import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTIDADE DE ELEMENTOS NO VETOR: ");

        int n = sc.nextInt();
        double[] vect = new double[n];

        double soma=0;
        double media=0;

        for (int i = 0; i < n; i++) {
            System.out.printf("%S","Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.printf("VALORES: ");


        for (int i = 0; i < n; i++) {
            System.out.print(vect[i] + "  ");
            soma += vect[i];
        }
        media = soma/n;

        System.out.printf("\nSOMA: %.2f\n",soma);
        System.out.printf("MÉDIA: %.2f",media);


    }
}