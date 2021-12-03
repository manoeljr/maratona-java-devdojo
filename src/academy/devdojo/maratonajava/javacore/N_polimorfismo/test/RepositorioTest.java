package academy.devdojo.maratonajava.javacore.N_polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
