package academy.devdojo.maratonajava.introducao;

public class Aula6EstruturaDeRepeticao02 {
    /**
     * Imprima todos os números pares de 0 até 1000
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
