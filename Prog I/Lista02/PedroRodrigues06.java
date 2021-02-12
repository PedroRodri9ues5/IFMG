import java.util.Scanner;

public class PedroRodrigues06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primeiro, segundo, resp;
        char op;
        System.out.println("Vamos calcular dois numeros!");
        System.out.println("Insira a operacao ('+' soma; ' - ' subtração; ' * ' multiplicação e ' / ' divisão):");
        op = sc.next().charAt(0);

        boolean opValido = (op == '+') | (op == '-') | (op == '*') | (op == '/');

        if (!opValido) {
            System.err.println("OPERADOR INVALIDO!");
            System.exit(0);
        } else

            System.out.println("Insira o primeiro numero:");
        primeiro = sc.nextDouble();


        System.out.println("Insira o segundo numero:");
        segundo = sc.nextDouble();

        switch (op) {
            case ('+'):
                resp = primeiro + segundo;
                System.out.printf("O resultado e: %.2f", resp);
                break;
            case ('-'):
                resp = primeiro - segundo;
                System.out.printf("O resultado e: %.2f", resp);
                break;
            case ('*'):
                resp = primeiro * segundo;
                System.out.printf("O resultado e: %.2f", resp);
                break;
            case ('/'):
                if (segundo != 0) {
                    resp = primeiro / segundo;
                    double resto = primeiro % segundo;
                    System.out.printf("O resultado e: %.2f e o resto e: %.2f", resp, resto);
                } else
                    System.out.println("Nao e possivel realizar uma divisao por 0.");
                break;

        }


        sc.close();

    }
}
