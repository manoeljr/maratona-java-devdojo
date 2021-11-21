package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais02 {
    /**
     * Idade < 15 categoria infantil
     * Idade >= 15 && Idade < 18 categoria juvenil
     * Idade >= 18 categoria adulto
     * @param args
     */
    public static void main(String[] args) {
        int idade = -1;
        String categoria;

        if(idade > 0 && idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else if (idade >= 18){
            categoria = "Categoria Adulto";
        } else {
            categoria = "Idade não exite !";
        }
        System.out.println(categoria);
    }
}
