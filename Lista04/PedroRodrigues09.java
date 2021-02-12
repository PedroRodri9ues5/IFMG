import java.util.Scanner;

public class PedroRodrigues09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        double alto = 0, baixo = 10, media = 0, somaAltH = 0, somaAltM = 0, qtdH = 0, qtdM = 0, mediaMasc, mediaFem;
        System.out.println("Insira quantos alunos serao analizados: ");
        qtd = sc.nextInt();
        double[] altura = new double[qtd];
        int[] sexo = new int[qtd];
        for (int i = 0; i < qtd; i++){
            System.out.println("Insira a altura do aluno " + (i+1) + ": ");
            altura[i] = sc.nextDouble();
            media += altura[i];
            System.out.println("Insira o sexo do aluno " + (i+1) + " (1 para masculino e 2 para feminino): ");
            sexo[i] = sc.nextInt();
            if (altura[i] >= alto){
                alto = altura[i];
            }
            if (altura[i] <= baixo){
                baixo = altura[i];
            }
            if (sexo[i] == 1){
                qtdH ++;
                somaAltH += altura[i];
            }
            if (sexo[i] == 2){
                qtdM ++;
                somaAltM += altura[i];
            }
        }
        mediaFem = somaAltM / qtdM;
        mediaMasc = somaAltH / qtdH;
        media = media / qtd;

        System.out.println("O aluno mais alto mede " + alto + " metros, o mais baixo tem " + baixo + " metros, e a media da turma e " + media);

        for (int i = 0; i < qtd; i++){
            if (altura[i] < media){
                System.out.println("O aluno " + (i+1) + " esta abaixo da media da turma");
            }
            if (sexo[i] == 1){
                if (altura[i] < mediaFem){
                    System.out.println("O aluno " + (i+1) + " esta abaixo da media de altura das mulheres");
                }
            }
            if (sexo[i] == 2){
                if (altura[i] > mediaMasc){
                    System.out.println("A aluna " + (i+1) + " esta acima da media de altura dos homens");
                }
            }
        }
        sc.close();
    }
}