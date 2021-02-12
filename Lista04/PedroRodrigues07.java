import java.util.Scanner;

public class PedroRodrigues07 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int totalAlunos, entrada;

       System.out.println("Insira a quantidade de alunos na turma: ");
       totalAlunos = sc.nextInt();

       int notaAlunos[] = new int[totalAlunos];
       int frequenciaAbsoluta[] = new int[11];
       double frequenciaRelativa[] = new double[11];

       for (int i = 0; i < totalAlunos; i++){
           System.out.println("Insira a nota do aluno "+(i+1)+": ");
           entrada = sc.nextInt();
           if (entrada >= 0 && entrada <= 10){
               notaAlunos[i] = entrada;
           }else{
               System.err.println("VALOR INVALIDO!");
               i--;
           }
       }

        for (int i = 0; i < totalAlunos; i++){
            switch (notaAlunos[i]){
                case 0:
                    frequenciaAbsoluta[0] ++;
                    break;
                case 1:
                    frequenciaAbsoluta[1] ++;
                    break;
                case 2:
                    frequenciaAbsoluta[2] ++;
                    break;
                case 3:
                    frequenciaAbsoluta[3] ++;
                    break;
                case 4:
                    frequenciaAbsoluta[4] ++;
                    break;
                case 5:
                    frequenciaAbsoluta[5] ++;
                    break;
                case 6:
                    frequenciaAbsoluta[6] ++;
                    break;
                case 7:
                    frequenciaAbsoluta[7] ++;
                    break;
                case 8:
                    frequenciaAbsoluta[8] ++;
                    break;
                case 9:
                    frequenciaAbsoluta[9] ++;
                    break;
                case 10:
                    frequenciaAbsoluta[10] ++;
                    break;
            }
        }

        System.out.println("| Nota | FA | FR |");

        for (int i = 0; i <= 10; i++){
            frequenciaRelativa[i] = (double) frequenciaAbsoluta[i] / totalAlunos;
            System.out.println("|   "+ i +"  | "+frequenciaAbsoluta[i]+" | "+frequenciaRelativa[i]+" |");
        }

       sc.close();
    }
}