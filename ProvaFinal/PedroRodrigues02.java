import java.util.Scanner;

public class PedroRodrigues02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[30];
        int[][]notas = new int[30][15];
        double[]somaMaterias = new double[30];
        double[]mediaMaterias = new double[30];
        int[]somaMat = new int[15];
        int[]mediaMat = new int[15];
        int notaMaior = 0, alunoNota = 0, mediaMaior = 0, disciplinaMaiorMedia = 0, notaMenor = 0;
        int  menAluno = 0, mediaMenor = 0, disciplinaMenorMedia = 0;


        for(int i = 0;i < 30; i++){
            System.out.println("Insira o nome do aluno "+(i+1)+" aluno:");
            nomes[i] = sc.nextLine();
        }
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Agora digite a "+(j+1)+" nota do aluno "+nomes[i]);
                notas[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                somaMaterias[i] += notas[i][j];
            }
            mediaMaterias[i] = somaMaterias[i]/15;
            if(somaMaterias[i] > notaMaior){
                notaMaior=(int)somaMaterias[i];
                alunoNota=i;
            }
            if(somaMaterias[i] < notaMenor){
                notaMenor = (int)somaMaterias[i];
                menAluno = i;

            }
        }


        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 30; j++){
                somaMat[i] += notas[j][i];
            }
        }
        for(int i = 0; i < 15; i++){
            mediaMat[i] = somaMat[i]/15;
            if(mediaMat[i] > mediaMaior){
                disciplinaMaiorMedia=i+1;
            }
            if(mediaMat[i] < mediaMenor){
                disciplinaMenorMedia = i+1;
            }

        }
        for(int i=0;i<30;i++){
            System.out.println("A media do aluno "+nomes[i]+ " e a media geral e:"+mediaMaterias[i]);
        }
        System.out.println("O aluno que teve a maior nota foi: "+nomes[alunoNota]+" e o que teve a menor foi o: "+nomes[menAluno]);
        System.out.println("A materia com maior media foi a diciplina: "+disciplinaMaiorMedia+" e a com menor nota foi a diciplina: "+disciplinaMenorMedia);



    }
}
