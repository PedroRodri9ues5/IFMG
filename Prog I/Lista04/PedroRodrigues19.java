import java.util.Random;
import java.util.Scanner;

public class PedroRodrigues19 {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);

        int num, posicao, vetor[] = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = aleatorio.nextInt();
        }

        System.out.print("Insira o numero a ser buscado: ");
        num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (vetor[i] == num) {
                posicao = i + 1;
                System.out.println("O numero: " + num + " esta na posicao:" + posicao);
                break;
            } else if (i >= 9) {
                System.out.println("O numero: " + num + " nao esta no vetor");

            }
        }
    }
}


