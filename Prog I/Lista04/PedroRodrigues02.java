import java.util.Scanner;

public class PedroRodrigues02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetorOriginal = new int[10];
        int [] vetorInvertido = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + " numero: ");
            vetorOriginal[i] = sc.nextInt();
        }
        System.out.print("O vetor Invertido e: \n||");
        int j = 9;
        for (int i = 0; i < 10; i++){
            vetorInvertido[i] = vetorOriginal[j];
            j--;
            System.out.print(vetorInvertido[i] + "||");
        }

        sc.close();
    }
}
