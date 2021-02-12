import java.util.Scanner;

public class PedroRodrigues01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdAlunos, menorDezesseis = 0, maiorDezesseis = 0, somaIdades = 0, alunoNovo = 100, alunoVelho = 0, acimaMedia = 0;
        double mediaIdades;
        String nomeNovo = null, nomeVelho = null;

        System.out.println("Insira a quantidade de alunos a serem analisados: ");
        qtdAlunos = sc.nextInt();

        int [] idade = new int[qtdAlunos];
        String [] nomes = new String[qtdAlunos];

        for (int i = 0; i < qtdAlunos ; i++){
            int iMaisUm = i + 1;
            System.out.println("Insira o nome do " + iMaisUm + " aluno:");
            nomes[i] = sc.next();

            System.out.println("Insira a idade do " + iMaisUm + " aluno:");
            idade[i] = sc.nextInt();

            somaIdades += idade[i];

            if (idade[i] <= 16){
                menorDezesseis++;
            }else maiorDezesseis++;
        }
        mediaIdades = somaIdades / qtdAlunos;

        for (int i = 0; i < qtdAlunos; i++){
            if (idade[i] <= alunoNovo){
                alunoNovo = idade[i];
                nomeNovo = nomes[i];
            }
            if (idade[i] >= alunoVelho){
                alunoVelho = idade[i];
                nomeVelho = nomes[i];
            }
            if (idade[i] > mediaIdades){
                acimaMedia ++;
            }
        }

        System.out.println("Total de alunos com idade menor ou igual a 16 anos: " + menorDezesseis);
        System.out.println("Total de alunos com idade maior que 16 anos: " + maiorDezesseis);
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Alunos com idade acima da média: " + acimaMedia);
        System.out.println("Nome do aluno mais novo: " + nomeNovo + " Idade: " + alunoNovo );
        System.out.println("Nome do aluno mais velho: " + nomeVelho + " Idade: " + alunoVelho );

        sc.close();
    }
}
