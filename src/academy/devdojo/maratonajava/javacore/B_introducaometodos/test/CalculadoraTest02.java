package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.dividindoDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
