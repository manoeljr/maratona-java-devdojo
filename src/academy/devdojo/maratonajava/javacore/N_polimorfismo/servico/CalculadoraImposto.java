package academy.devdojo.maratonajava.javacore.N_polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador) {
        double imposto = computador.calcularImposto();
        System.out.println("Relatorio de imposto do Computador");
        System.out.println("Computador "+ computador.getNome());
        System.out.println("Imposto do computador "+ imposto);
        System.out.println("Valor do computador "+ computador.getValor());
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        double imposto = tomate.calcularImposto();
        System.out.println("Relatorio de imposto do Tomate");
        System.out.println("Tomate "+ tomate.getNome());
        System.out.println("Imposto do tomate "+ imposto);
        System.out.println("Valor do tomate "+ tomate.getValor());
    }
}
