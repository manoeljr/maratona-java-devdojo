package academy.devdojo.maratonajava.introducao;

import java.util.Date;

/**
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * Eu <nome>, morando no endereço <endereco>,
 * confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Manoel";
        String endereco = "Avenida Maceió";
        double salario = 5000.0;
        String dataRecebimento = "20/12/2021";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+
                ", confirmo que recebi o salário de "+salario+", na data "+dataRecebimento+".");
    }

}
