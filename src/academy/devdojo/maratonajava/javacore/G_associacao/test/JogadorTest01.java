package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogagores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogagores) {
            jogador.imprime();
        }

    }
}
