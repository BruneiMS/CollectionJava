package MapObjetoObjeto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e 3 cursos, fazendo a relação entre eles dentro de um dicionário.
Feito isso, ordene esse dicionário por:
A) Nome da disciplina
a) Duração do curso;
b) Nome do aluno;
d) Matricula do aluno;
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

        Map<Disciplina, Aluno> cursos = new HashMap<>() {{
            put(disciplina1, aluno1);
            put(disciplina2, aluno2);
            put(disciplina3, aluno3);
            put(disciplina4, aluno6);
            
        }};

        System.out.println("Exibindo Dicionário:");
        for (Map.Entry<Disciplina, Aluno> entry : cursos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        System.out.println("-------\n" + "Nome Disciplina:");
        Map<Disciplina, Aluno> cursos2 = new TreeMap<Disciplina, Aluno>(cursos);
        for (Map.Entry<Disciplina, Aluno> entry : cursos2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        System.out.println("-------\n" + "Duração Disciplina:");
        Map<Disciplina, Aluno> cursos3 = new TreeMap<Disciplina, Aluno>(new ComparatorDuracaoDisciplina());
        cursos3.putAll(cursos);

        for (Map.Entry<Disciplina, Aluno> entry : cursos3.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        System.out.println("-------\n" + "Nome do Aluno:");
        Set<Map.Entry<Disciplina, Aluno>> set = new TreeSet<Map.Entry<Disciplina, Aluno>>(new ComparatorNomeAluno());
        set.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        System.out.println("-------\n" + "Matricula do Aluno:");
        Set<Map.Entry<Disciplina, Aluno>> set1 = new TreeSet<Map.Entry<Disciplina, Aluno>>(new ComparatorMatriculaAluno());
        set1.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
