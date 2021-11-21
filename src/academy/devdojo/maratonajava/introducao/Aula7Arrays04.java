package academy.devdojo.maratonajava.introducao;

public class Aula7Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};
        // Usando o forech
        for(int numero: numeros3){
            System.out.println(numero);
        }
    }
}
