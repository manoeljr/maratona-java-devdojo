package academy.devdojo.maratonajava.javacore.A_introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.A_introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro primeiroCarro = new Carro();
        Carro segundoCarro = new Carro();

        primeiroCarro.nome = "Fuscão";
        primeiroCarro.modelo = "Fusca";
        primeiroCarro.ano = 1976;

        segundoCarro.nome = "Tander Tanque";
        segundoCarro.modelo = "Chevett";
        segundoCarro.ano = 1990;

        System.out.println("Primeiro carro "+ primeiroCarro.nome + " modelo " + primeiroCarro.modelo + " ano "+ primeiroCarro.ano);
        System.out.println("Segundo carro "+ segundoCarro.nome + " modelo " + segundoCarro.modelo + " ano "+ segundoCarro.ano);
    }
}
