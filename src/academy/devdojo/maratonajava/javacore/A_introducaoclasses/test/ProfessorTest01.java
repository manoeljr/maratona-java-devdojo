package academy.devdojo.maratonajava.javacore.A_introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.A_introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre kami";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.println("Nome " + professor.nome + " idade " + professor.idade + " sexo " + professor.sexo);
    }
}
