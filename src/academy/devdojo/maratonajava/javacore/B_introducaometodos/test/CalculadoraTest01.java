package academy.devdojo.maratonajava.javacore.B_introducaometodos.test;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando a CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2, 2);
    }
}

