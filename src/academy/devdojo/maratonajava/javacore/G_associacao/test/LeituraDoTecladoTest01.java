package academy.devdojo.maratonajava.javacore.G_associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade abaixo");
        int idade = entrada.nextInt();

        System.out.println("Digita M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("--------------------------");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        if (sexo == 'M') {
            System.out.println("Sexo Masculino");
        } else if (sexo == 'F'){
            System.out.println("Sexo Feminino");
        } else {
            System.out.println("Opção Inválida para sexo !");
        }
    }
}
