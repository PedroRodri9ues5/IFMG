public class Aluno {
    private int matricula;
    private int anoDeEntrada;
    private String nome;
    private String nomeDoCurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAnoDeEntrada() {
        return anoDeEntrada;
    }

    public void setAnoDeEntrada(int anoDeEntrada) {
        this.anoDeEntrada = anoDeEntrada;
    }

    public void infoAlunosPorCusro() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Ano de entrada: " + getAnoDeEntrada());
    }
}
