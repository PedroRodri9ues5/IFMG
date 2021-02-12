import java.util.Scanner;

public class PedroRodrigues18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primeiro, segundo, resp;
        int op;
        System.out.println("====================\n" +
                "Calculadora do Pedro\n" +
                "====================\n" +
                "Opções:\n" +
                "1 - Soma\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão\n" +
                "5 – Sair\n" +
                "====================");
        System.out.println("Insira a opcao desejada: ");
        op = sc.nextInt();
        if (op == 5){
            System.err.println("Saindo...");
            System.exit(5);
        }
        Boolean opValido = (op > 0 && op < 5);
        if (!opValido) {
            System.err.println("OPERADOR INVALIDO!");
            System.exit(0);
        }

            System.out.println("Insira o primeiro numero:");
        primeiro = sc.nextDouble();


        System.out.println("Insira o segundo numero:");
        segundo = sc.nextDouble();

        switch (op) {
            case 1:
                resp = primeiro + segundo;
                System.out.printf("O resultado e: %.2f", resp);
                break;
            case 2:
                resp = primeiro - segundo;
                System.out.printf("O resultado e: %.2f", resp);
                break;
            case 3:
                resp = primeiro * segundo;
                System.out.printf("O resultado e: %.2f", resp);
                break;
            case 4:
                if (segundo != 0) {
                    resp = primeiro / segundo;
                    double resto = primeiro % segundo;
                        System.out.printf("O resultado e: %.2f", resp);
                } else
                    System.out.println("Nao e possivel realizar uma divisao por 0.");
                break;
        }


        sc.close();

    }
}
