public class Aluno {
    String nome;
    int matricula;
    double mediaFinal;

    public Aluno(String nome, int matricula, double mediaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.mediaFinal = mediaFinal;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Média Final: " + mediaFinal;
    }
}