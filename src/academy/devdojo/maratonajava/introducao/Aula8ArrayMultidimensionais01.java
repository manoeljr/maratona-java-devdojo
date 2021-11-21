package academy.devdojo.maratonajava.introducao;

public class Aula8ArrayMultidimensionais01 {
    /**
     * Meses do ano - 1 a 12
     * Dias de cada mês - 1 a 28/29/30/31
     */
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;
//
//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.println(dias[i][j]);
//            }
//            System.out.println("========");
//        }

        // Foreach
        for(int[] dia: dias) {
            for(int valor: dia) {
                System.out.println(valor);
            }
        }
    }
}
