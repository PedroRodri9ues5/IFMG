import java.util.Scanner;

public class PedroRodrigues01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        System.out.printf("Vamos catalogar um numero\nDigite um numero real: ");
        num = scanner.nextDouble();

       if (num > 0) {
           System.out.println("O numero e positivo!");
       }else if (num < 0) {
           System.out.println("O numero e negativo!");
       }else if (num == 0) {
           System.out.println("O numero e zero!");
       }

        scanner.close();
    }
}
