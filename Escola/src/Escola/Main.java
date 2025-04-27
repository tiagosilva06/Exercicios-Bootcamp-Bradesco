package Escola;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<PessoaEscola> pessoas = new ArrayList<>();

        Professor prof1 = new Professor("Tiago", "tiago@email.com", "senha123");
        prof1.setMatéria("Matemática");
        prof1.setHorarioAula("08:00 - 10:00");

        Aluno aluno1 = new Aluno("Donna", "donna@email.com", "senha456");
        aluno1.setTurma("3º A");
        aluno1.setIdade("18 anos");

        pessoas.add(prof1);
        pessoas.add(aluno1);

        // Exibindo os dados de todos
        for (PessoaEscola p : pessoas) {
            System.out.println(p.mostrarInformacoes());
        }
	}
}