package academy.devdojo.maratonajava.javacore.F_modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.F_modificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carroOne = new Carro("BMW", 280);
        Carro carroTwo = new Carro("Mercedes", 275);
        Carro carroThree = new Carro("Audi", 290);

        Carro.velocidadeLimite = 180;

        carroOne.imprime();
        carroTwo.imprime();
        carroThree.imprime();
    }
}
