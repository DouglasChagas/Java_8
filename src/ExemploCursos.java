import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		/*
		Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);

		streamDeCurso.forEach(c -> System.out.println(c.getNome()));

		Stream<String> streamNomes = cursos.stream().map(c -> c.getNome());
		streamNomes.forEach(s->System.out.println());
		//cursos.forEach(c -> System.out.println(c.getNome()));
		*/
		/*
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .mapToInt(Curso::getAlunos)
		   .forEach(System.out::println);
		
		int soma = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .mapToInt(Curso::getAlunos)
				   .sum();
		System.out.println(soma);
		*/
		cursos.stream()
		   //.filter(c -> c.getAlunos() > 50)
		   .findFirst()
		   .ifPresent(c -> System.out.println(c.getNome()));
		   
		
		OptionalDouble average = cursos.stream()
	    .mapToInt(c -> c.getAlunos())
	    .average();
		
		System.out.println(average);
		   
		List<Curso> resultados = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .collect(Collectors.toList());

		
	
	}
	

}

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}