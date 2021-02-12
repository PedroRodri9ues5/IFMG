import java.util.Scanner;

public class PedroRodrigues01 {
    static boolean isPositive(float num){
        if (num >= 0){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero;
        boolean ePositivo;
        System.out.println("Insira um numero aleatorio: ");
        numero = sc.nextFloat();

        ePositivo = isPositive(numero);

        if (ePositivo){
            System.out.println("O numero inserido e POSITIVO!");
        }else System.out.println("O numero inserido e NEGATIVO!");

        sc.close();
    }
}
