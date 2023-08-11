import java.util.Locale;
import java.util.Scanner;
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

public class MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%S", "Quantos números você vai digitar? ");

        int n = sc.nextInt();
        double[] vect = new double[n];

        double maior;
        int posMaior = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("%S", "Digite um nnúmero: ");
            vect[i] = sc.nextDouble();
        }

        maior = vect[0];
        for (int i = 0; i < n; i++){
            if(vect[i]>maior){
                maior = vect[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("O MAIOR NÚMERO DIGITADO FOI = %dº\n", posMaior);



    }
}