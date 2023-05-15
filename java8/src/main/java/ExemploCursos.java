import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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


public class ExemploCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("Javascript", 41));
        cursos.add(new Curso("Java 8", 43));
        cursos.add(new Curso("C", 10));

        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(c -> System.out.println(c.getNome()));
        int sum = cursos.stream().mapToInt(Curso::getAlunos).sum();
        System.out.println(sum);

        cursos.stream().filter(c -> c.getAlunos() >= 40).forEach(curso -> System.out.println(curso.getAlunos()));



    }

}
