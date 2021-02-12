import java.util.Scanner;

public class PedroRodrigues04 {
    static double calcularDelta (double a, double b, double c){
    return (b*b) - (4 * a * c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;

        System.out.println("Para calcular o valor de Delta, insira o valor de a: ");
        a = sc.nextDouble();

        System.out.println("Agora insira o valor de b: ");
        b = sc.nextDouble();

        System.out.println("Agora insira o valor de c: ");
        c = sc.nextDouble();

        delta = calcularDelta(a, b, c);

        System.out.println("O valor de delta e: " + delta);
        sc.close();
    }
}
