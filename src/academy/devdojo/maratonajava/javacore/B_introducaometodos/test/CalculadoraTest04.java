package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);
    }
}
