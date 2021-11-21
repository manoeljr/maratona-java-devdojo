package academy.devdojo.maratonajava.javacore.H_herenca.test;

import academy.devdojo.maratonajava.javacore.H_herenca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.H_herenca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.H_herenca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("111.111.111-11");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("222.222.222-22");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2.000);
        funcionario.imprime();
    }
}
