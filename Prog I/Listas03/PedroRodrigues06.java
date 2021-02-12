import java.util.Scanner;

public class PedroRodrigues06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, media, soma = 0;
        System.out.println("Vamos calcular a soma e a media de N primeiros numeros. \n Insira um valor inteiro para N");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            soma = soma + i;
        }
        media = soma / num;
        System.out.printf("A soma é: %d e a media e: %d", soma, media);
    }
}