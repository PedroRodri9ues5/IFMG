import java.util.Scanner;

public class PedroRodrigues07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double soma = 0.0;
        System.out.println("Vamos calcular a soma de 1/N primeiros numeros. \n Insira um valor inteiro para N");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            soma = soma + (1/ (double) i);
        }

        System.out.printf("A soma é: %.2f", soma);
    }
}