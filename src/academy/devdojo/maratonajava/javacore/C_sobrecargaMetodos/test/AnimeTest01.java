package academy.devdojo.maratonajava.javacore.C_sobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.C_sobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 7);
        anime.init("Akudama Drive", "TV", 7, "Ação");

        anime.imprime();
    }
}
