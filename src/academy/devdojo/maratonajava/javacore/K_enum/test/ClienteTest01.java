package academy.devdojo.maratonajava.javacore.K_enum.test;

import academy.devdojo.maratonajava.javacore.K_enum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.K_enum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.K_enum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    }
}
