package academy.devdojo.maratonajava.introducao;

public class Aula6EstruturaDeRepeticao04 {
    /**
     * Dado o valor de um carro desculpra em quantas ele pode ser parcelados
     * condição valorParcelado >= 1000
     * @param args
     */
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }
    }
}
