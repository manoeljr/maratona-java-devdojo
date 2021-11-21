package academy.devdojo.maratonajava.javacore.E_blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    // Bloco de inicialização(bloco de inicialização não estático ou de estância) sempre é inicializado primeiro do que o construtor independente da posição que estiver
    // declarado na classe
    // Ele é execultado todas as vezes que se cria um objeto
    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime() {
        for (int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
    }
}
