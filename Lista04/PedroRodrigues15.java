import java.util.Scanner;

public class PedroRodrigues15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int [5];
        double soma = 0, mult = 1;

        for(int i = 0; i < 5; i++){

            System.out.print("Insira os valores do vetor:");
            vetor[i] = sc.nextInt();

            soma += vetor[i];
            mult = mult*vetor[i];
        }
        System.out.println("O vetor é: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Produto do vetor: " + mult);
        System.out.println("Soma do vetor: " + soma);

        sc.close();
    }
}
