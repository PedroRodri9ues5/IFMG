import java.util.Scanner;

public class PedroRodrigues03 {
    static boolean isEven(float num){
        if ((num%2) == 0){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero;
        boolean par;

        System.out.println("Insira um valor aleatorio: ");
        numero = sc.nextFloat();

        par = isEven(numero);

        if (par){
            System.out.println("O numero inserido E PAR!");
        }else System.out.println("O numero inserido E IMPAR!");

        sc.close();
    }
}
