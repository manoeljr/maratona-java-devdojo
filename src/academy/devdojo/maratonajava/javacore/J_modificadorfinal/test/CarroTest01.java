package academy.devdojo.maratonajava.javacore.J_modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.J_modificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.J_modificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
