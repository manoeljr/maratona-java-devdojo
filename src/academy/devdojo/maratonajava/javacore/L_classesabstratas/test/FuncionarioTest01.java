package academy.devdojo.maratonajava.javacore.L_classesabstratas.test;

import academy.devdojo.maratonajava.javacore.L_classesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.L_classesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.L_classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Manoel", 10000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
