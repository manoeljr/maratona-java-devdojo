package academy.devdojo.maratonajava.javacore.N_polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);
    }
}
