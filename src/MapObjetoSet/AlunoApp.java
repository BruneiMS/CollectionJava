package MapObjetoSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e para cada aluno uma lista contendo 2 cursos
fazendo a relação entre eles dentro de um dicionário.
Feito isso, exiba o dicionário com o seguintes requisito:
Key: Nome do aluno e matrícula - Value: Nome das disciplinas na qual estão matriculados
 */

public class AlunoApp {
	public static void main(String[] args) {
		Aluno aluno2 = new Aluno("Brúnei", 319);
		Aluno aluno3 = new Aluno("Juliane", 345);
		Aluno aluno1 = new Aluno("Gabriel", 562);
		Aluno aluno6 = new Aluno("Gabriele", 785);


		Disciplina disciplina3 = new Disciplina("Python", 9);
		Disciplina disciplina1 = new Disciplina("Java", 10);
		Disciplina disciplina2 = new Disciplina("JavaScript", 12);
		Disciplina disciplina4 = new Disciplina(".Net", 7);

		Set<Disciplina> disc1 = new HashSet<Disciplina>(Arrays.asList(disciplina3, disciplina2));
		Set<Disciplina> disc2 = new HashSet<Disciplina>(Arrays.asList(disciplina1, disciplina2));
		Set<Disciplina> disc3 = new HashSet<Disciplina>(Arrays.asList(disciplina4, disciplina2));
		
		 Map<Aluno, Set<Disciplina>> alunosEDisciplinas = new HashMap<Aluno, Set<Disciplina>>() {{
	          put(aluno1, disc2);
	          put(aluno2, disc1);
	          put(aluno3, disc3);
	          put(aluno6, disc2);
	        }};

		System.out.println("Exibindo Dicionário:");
		for(Map.Entry<Aluno, Set<Disciplina>> entry : alunosEDisciplinas.entrySet()) {
			System.out.print(entry.getKey().getNome() + " - " + entry.getKey().getMatricula() + ": ");
			for (Disciplina entry1 : entry.getValue()) {
				System.out.print(entry1.getNome() + " ");
			}
			System.out.println();
		}
	}
}