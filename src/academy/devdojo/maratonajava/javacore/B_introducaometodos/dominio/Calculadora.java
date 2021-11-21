package academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int primeiroValor, int segundoValor) {
        System.out.println(primeiroValor * segundoValor);
    }

    public double dividindoDoisNumeros(double primeiroValor, double segundoValor) {
        return primeiroValor / segundoValor;
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("Número 1 " + numero1);
        System.out.println("Número 2 " + numero2);
    }

}
