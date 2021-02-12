import java.util.Scanner;

public class PedroRodrigues21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, palindromo, aux;
        System.out.println("Vamos verificar se um numero e palindromo. Insira um numero:");
        num = sc.nextInt();

        if (num < 0) {
            num = -1 * num;
        }

        palindromo = 0;
        aux = num;
        while (aux > 0) {
            palindromo = (palindromo * 10) + (aux % 10);
            aux = aux / 10;
        }

        if (num == palindromo) {
            System.out.println("O numero e palindromo");
        } else {
            System.out.println("O numero nao e palindromo");
        }
        sc.close();

    }
}
