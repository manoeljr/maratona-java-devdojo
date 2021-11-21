package academy.devdojo.maratonajava.introducao;

public class Aula6EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        System.out.println("========");
        do {
            System.out.println("Dentro do do-while");
        } while (count < 10);
        System.out.println("=========");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
