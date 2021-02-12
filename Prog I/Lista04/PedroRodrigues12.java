import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PedroRodrigues12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetorCres = new int[10];
        int[] vetorDec = new int[10];

        System.out.println("Preencha o vetor a seguir: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
            vetorCres[i] = vetor[i];
        }
        int j = 9;
        Arrays.sort(vetorCres);
        for (int i = 0; i < vetor.length; i++){
            vetorDec[j] = vetorCres[i];
            j--;
        }
        System.out.println("Vetor crescente: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetorCres[i]);
        }
        System.out.println("Vetor decrescente: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetorDec[i]);
        }
            sc.close();
    }
}
