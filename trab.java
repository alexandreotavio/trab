import java.util.ArrayList;
import java.util.List;

public class Unidade {
    private String nome;
    private String gestor;

    public Unidade(String nome, String gestor) {
        this.nome = nome;
        this.gestor = gestor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }
}

public class Curso {
    private String nome;
    private String coordenador;
    private List<Disciplina> disciplinas;
    private List<Aluno> alunos;

    public Curso(String nome, String coordenador) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.disciplinas = new ArrayList<Disciplina>();
        this.alunos = new ArrayList<Aluno>();
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
}

public class Aluno {
    private String nome;
    private String matricula;
    private Curso curso;

    public Aluno(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

public class Universidade {
    private String nome;
    private String endereco;
    private String cidade;
    private List<Unidade> unidades;

    public Universidade(String nome, String endereco, String cidade) {
