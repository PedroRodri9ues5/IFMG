import java.util.Scanner;

public class PedroRodrigues03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 1, num2 = 0, qtd;
        System.out.println("Vamos imprimiro os N primeiros numeros da sequencia de fibonacci. Insira um valor para N: ");
        qtd = sc.nextInt();
        int [] fibonacci = new int[qtd];

        fibonacci[0] = num1;

        for(int i = 1; i < qtd; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            fibonacci[i] = num1;
        }
        System.out.println("Vetor: ");
        for (int i = 0; i < qtd; i++){
            System.out.println(fibonacci[i]);
        }


        sc.close();
    }
}
