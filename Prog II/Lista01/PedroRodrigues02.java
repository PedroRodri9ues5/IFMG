import java.util.Scanner;

public class PedroRodrigues02 {
    static boolean isZero(float num){
        if (num == 0){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero;
        boolean nulo;

        System.out.println("Insira um valor aleatorio: ");
        numero = sc.nextFloat();

        nulo = isZero(numero);

        if (nulo){
            System.out.println("O numero inserido E NULO!");
        }else System.out.println("O numero inserido NAO E NULO!");

        sc.close();
    }
}
