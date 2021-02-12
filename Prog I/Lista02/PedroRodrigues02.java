import java.util.Scanner;

public class PedroRodrigues02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num, resto;
        System.out.printf("Vamos descobrir se um numero e par ou impar! \nDigite um numero real:");
        num = scanner.nextDouble();

        resto = num % 2;

        if (resto == 0) {
            System.out.printf("O numero e par!");
        }else {
            System.out.println("O numero e impar!");
        }
        scanner.close();
    }
}
//Faça um algoritmo que dado um número digitado pelo usuário mostre se o mesmo é par ou ímpar.