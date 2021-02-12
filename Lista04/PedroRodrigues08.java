import java.util.Scanner;

public class PedroRodrigues08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vetorUm[] = new double[10];
        double vetorDois[] = new double[10];
        double vetorTres[] = new double[10];

        System.out.println("Vamos preencher o primeiro vetor: ");
        for (int i = 0; i < vetorUm.length; i++){
            System.out.print("O " + (i+1) + " numero e:");
            vetorUm[i] = sc.nextDouble();
        }
        System.out.println("Vamos preencher o segundo vetor: ");
        for (int i = 0; i < vetorDois.length; i++){
            System.out.print("O " + (i+1) + " numero e:");
            vetorDois[i] = sc.nextDouble();
        }
        for (int i = 0; i < vetorTres.length; i++){
            if (vetorUm[i] == vetorDois[i]){
                vetorTres[i] = 1;
            }else vetorTres[i] = 0;
            System.out.println(vetorTres[i]);
        }
        sc.close();
    }
}
