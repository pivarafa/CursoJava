import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do veto


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0;
        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", vect[i]);
        }
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        System.out.printf("%nSoma = " + sum);
        double avg = sum / n;
        System.out.printf("%nMédia = %.2f%n", avg);
        sc.close();
    }
}