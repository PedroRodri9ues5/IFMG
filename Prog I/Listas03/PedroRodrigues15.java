import java.util.Scanner;

public class PedroRodrigues15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 1, num2 = 0, parada;
        System.out.println("Vamos imprimiro os N primeiros numeros da sequencia de fibonacci. Insira um valor para N: ");
        parada = sc.nextInt();
        parada -= 1;

        System.out.println(num1);

        for(int i = 0; i < parada; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }


        sc.close();
    }
}
