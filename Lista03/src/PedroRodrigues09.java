import java.util.Scanner;

public class PedroRodrigues09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, aux = 0, media, num;
        System.out.println("Vamos calcular a soma e a media de N numeros.\n Insira a quantidade de numeros a ser calculados:");
        num = sc.nextInt();
        System.out.printf("Agora insira os numeros: ");
        for (int i = 1; i <= num; i ++){
            aux = sc.nextDouble();
            soma = soma + aux;
        }
        media = soma / num;
        System.out.println("A soma é: " + soma + " e a media e: " + media);

    }
}