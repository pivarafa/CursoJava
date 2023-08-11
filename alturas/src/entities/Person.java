package entities;

public class Person {

    private String name;
    private int idade;
    private double altura;

    public Person(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
