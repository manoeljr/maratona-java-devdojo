package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Larangeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
