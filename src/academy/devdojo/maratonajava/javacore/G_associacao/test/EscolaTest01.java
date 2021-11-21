package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor[] professors = {professor};
        Escola escola = new Escola("Konoha", professors);

        escola.imprime();
    }
}
