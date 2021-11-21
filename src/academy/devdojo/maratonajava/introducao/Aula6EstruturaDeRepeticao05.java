package academy.devdojo.maratonajava.introducao;

public class Aula6EstruturaDeRepeticao05 {
    /**
     * Dado o valor de um carro desculpra em quantas ele pode ser parcelados
     * condição valorParcelado >= 1000
     * @param args
     */
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }
    }
}
