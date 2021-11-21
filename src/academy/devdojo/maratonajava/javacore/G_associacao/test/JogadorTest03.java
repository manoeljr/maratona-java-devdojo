package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---- Jogador ------");
        jogador.imprime();
        System.out.println("---- Time ------");
        time.imprime();
    }
}
