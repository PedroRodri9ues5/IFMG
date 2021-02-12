import java.util.Scanner;

public class PedroRodrigues10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0, menor = 0;
        int i = 0;
        int num;
        System.out.println("Vamos separar o maior e menor numero.\n Para finalizar digite '0'");
        do {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if (i == 0) {
                maior = num;
                menor = num;
                i++;
            } else if (num == 0) {
                break;
            } else if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        } while (i <= num);
        System.out.printf("O maior numero e: %d, e o menor e: %d", maior, menor);

    }
}