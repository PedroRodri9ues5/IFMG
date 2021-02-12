import java.util.Scanner;

public class PedroRodrigues04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, r, x1, x2, delta, raizDelta;

        imprimir("vamos calcular as raizes de uma equacao de segundo grau");

        imprimir("---------------------------------------------------------------");

        imprimir("ax^2 + bx + c = 0");

        imprimir("insira o valor de a: ");
        a = sc.nextDouble();
        System.out.printf("%.2fx^2 + bx + c = 0\n", a);

        imprimir("insira o valor de b: \n");
        b = sc.nextDouble();
        System.out.printf("%.2fx^2 + %.2fx + c = 0\n", a, b);

        imprimir("insira o valor de c: \n");
        c = sc.nextDouble();
        System.out.printf("%.2fx^2 + %.2fx + %.2f = 0\n", a, b, c);

        if (a == 0){
            System.out.println("Nao e uma equacao de segundo grau!");
            if (b == 0){
                System.out.println("Nao e uma equacao de primeiro grau!");
            }else {
                r = -c/b;
                System.out.printf("O valor de X e: %.2f", r);
                System.exit(1);
            }
        }else {
            delta = (b*b) - (4 * a * c);
            if (delta>=0) {

                raizDelta = Math.sqrt(delta);
                x1 = ((-1 * b) + raizDelta) / (2 * a);
                x2 = ((-1 * b) - raizDelta) / (2 * a);

                System.out.printf("x1 = %.3f e x2 = %.3f", x1, x2);
            }else {
                System.err.println("A equacao nao possui raizes reais");
                System.exit(0);
            }
        }



        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}
