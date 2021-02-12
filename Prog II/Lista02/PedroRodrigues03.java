import java.util.Scanner;

public class PedroRodrigues03 {

    static Aluno[] alunos = new Aluno[20];
    static Scanner sc = new Scanner(System.in);

    static void novoCadastro() {
        int posicaoPCadastrar = 0;
        boolean posicaoValida = false;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                posicaoPCadastrar = i;
                posicaoValida = true;
                break;
            }else if (i == (alunos.length-1) && alunos[i] != null){
                System.err.println("LISTA CHEIA");
                break;
            }
        }
        if (posicaoValida){
            String nome;
            int matricula;
            boolean matriculaAutorizada = true;
            alunos[posicaoPCadastrar] = new Aluno();

            System.out.println("Insira o nome do aluno: ");
            nome = sc.next();

            System.out.println("Insira a matricula do aluno: ");
            matricula = sc.nextInt();

            for (int i = 0; i < alunos.length; i++) {
                if (alunos[i] != null){
                    if (alunos[i].getMatricula() == matricula){
                        System.err.println("MATRICULA JA CADASTRADA!");
                        matriculaAutorizada = false;
                    }
                }
            }
            if (matriculaAutorizada) {
                int ano;
                String curso;

                alunos[posicaoPCadastrar] = new Aluno();
                alunos[posicaoPCadastrar].setNome(nome);
                alunos[posicaoPCadastrar].setMatricula(matricula);

                System.out.println("Insira o ano de entrada: ");
                ano = sc.nextInt();
                alunos[posicaoPCadastrar].setAnoDeEntrada(ano);

                System.out.println("Insira o nome do curso (nao incluir acentos): ");
                curso = sc.next();
                alunos[posicaoPCadastrar].setNomeDoCurso(curso);

                System.out.println("ALUNO CADASTRADO COM SUCESSO!");
            }
        }
    }

    static void cursoCheck (){
        boolean posicaoFinal = false;
        boolean cursoNaoEncontrado = true;
        System.out.println("Digite o nome do curso (nao incluir acentos): ");
        String curso = sc.next();

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] != null){
                if (alunos[i].getNomeDoCurso().equalsIgnoreCase(curso)){
                    alunos[i].infoAlunosPorCusro();
                    cursoNaoEncontrado = false;
                }
            }
            if (i == (alunos.length -1 ) && cursoNaoEncontrado){
                posicaoFinal = true;
            }
            if (posicaoFinal) {
                System.err.println("NENUM CURSO ENCONTRADO");
                break;
            }
        }
    }

    static void excluirAlunosAnteriores() {
        System.out.println("Insira o ano: ");
        int ano = sc.nextInt();
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null){
                if (alunos[i].getAnoDeEntrada() < ano) {
                    alunos[i] = null;
                }
                if (i == (alunos.length -1) && alunos[i] == null){
                    System.out.println("ALUNOS REMOVIDOS");
                }

            }

        }

    }

    static void menuDeOP(){
        System.out.println("Menu de opções:\n" +
                "1. Cadastrar aluno.\n" +
                "2. Visualizar nome, matrícula e ano de entrada de todos os alunos de um determinado curso.\n" +
                "3. Excluir alunos com entrada anterior a um determinado ano passado como entrada.\n" +
                "4. Sair.");
    }
    static int receberOP(){
        menuDeOP();
        int op = sc.nextInt();

        while (op > 4 || op < 1) {
            System.err.println("NUMERO INVALIDO, TENTE NOVAMENTE");
            menuDeOP();
            op = sc.nextInt();
        }
        return op;
    }

    public static void main(String[] args) {
        int condicao = 0;
        do {
            int op = receberOP();

            switch (op) {
                case 1 -> novoCadastro();
                case 2 -> cursoCheck();
                case 3 -> excluirAlunosAnteriores();
                case 4 -> System.exit(4);
                default -> condicao = 1;
            }
        }while (condicao == 0);
        sc.close();
    }
}
