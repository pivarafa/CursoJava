package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas no vetor? ");
        int n = sc.nextInt();
        Person[] person = new Person[n];

        String nome;
        int idade;
        double altura;
        int menores = 0;
        double percentualMenores;

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %dª pessoa: \n", i+1);
            System.out.printf("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.printf("Idade: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            person[i] = new Person(nome, idade, altura);
        }

        for (int i = 0; i < n; i++) {
            if (person[i].getIdade() < 16) {
                System.out.println(person[i].getName());
                menores++;
            }
        }
        percentualMenores = ((double)menores / n) * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.2f %%\n",percentualMenores);


        double soma = 0;
        for (int i=0;i<n;i++){
            soma += person[i].getAltura();
        }
        System.out.println("média das altura: "+soma/n);

        sc.close();
    }
}
