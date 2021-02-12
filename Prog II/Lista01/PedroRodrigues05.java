import java.util.Scanner;

public class PedroRodrigues05 {
    static boolean isZero(double num){
        if (num == 0){
            return true;
        }else return false;
    }
    static double calcularDelta (double a, double b, double c){
        return (b*b) - (4 * a * c);
    }
    static double calcularRaizSoma(double a, double b, double delta){
        double raiz;
        raiz = ((-1 * b) + (Math.sqrt(delta)));
        raiz = (raiz) / (2 * a);
        return raiz;
    }
    static double calcularRaizSubtracao(double a, double b, double delta){
        double raiz;
        raiz = ((-1 * b) - (Math.sqrt(delta)));
        raiz = (raiz) / (2 * a);
        return raiz;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        boolean aIsZero;

        System.out.println("Para calcular as raizes de uma equacao do segundo grau, insira o valor de a: ");
        a = sc.nextDouble();

        aIsZero = isZero(a);

        while (aIsZero) {
            System.err.println("VALOR DE A INVALIDO!");
            System.out.println("Insira outro valor para a: ");
            a = sc.nextDouble();
            aIsZero = isZero(a);
        }

        System.out.println("Agora insira o valor de b: ");
        b = sc.nextDouble();

        System.out.println("Agora insira o valor de c: ");
        c = sc.nextDouble();

        delta = calcularDelta(a, b, c);

        x1 = calcularRaizSoma(a, b, delta);
        x2 = calcularRaizSubtracao(a, b, delta);

        if (delta > 0){
            System.out.println("As raizes sao: " + x1 + " e " + x2);
        }else {
            System.out.println("O valor de delta e negativo, portanto nao ha raizes reais!");
        }



        sc.close();
    }
}
