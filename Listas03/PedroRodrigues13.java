import java.util.Scanner;

public class PedroRodrigues13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, aux = 0;
        System.out.println("Insira um numero e vamos verificar se ele e primo: ");
        numero = sc.nextInt();
        if (numero == 4){
            System.out.println("O numero " + numero + " nao e primo");
            System.exit(4);
        }
        for (int j = 2; j <= numero; j++) {
            if (numero % j == 0){
               aux = aux + 1;
            }
        }

        if (aux > 1){
            System.out.println("O numero " + numero + " nao e primo");
        }else {
            System.out.println("O numero " + numero + " e primo");
        }

        sc.close();
    }

}
