package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais05 {
    /**
     * Imprima o dia da semana, considerando 1 como domingo
     * @param args
     */
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia){ // variaveis aceitas char, int, byte, short, enum, String
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feria");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
