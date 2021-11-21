package academy.devdojo.maratonajava.introducao;

public class Aula7Arrays03 {
    public static void main(String[] args) {
        // valores de saida do array padrão
        //byte, short, int = 0, long, float = 0.0, double = 0.0, char, boolean = false, String = null
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
