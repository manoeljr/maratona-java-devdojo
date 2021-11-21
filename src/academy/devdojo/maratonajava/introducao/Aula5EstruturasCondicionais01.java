package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a compra bebida Alcólica");
        } else {
            System.out.println("Não autorizado a compra bebida Alcólica");
        }

    }
}
