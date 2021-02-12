import java.util.Scanner;

public class PedroRodrigues00 {
    static int calcularFatorialRecursivo (int num){
        if (num == 0){
            return 1;
        }else {
            return num * calcularFatorialRecursivo(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, n, k, resultado;

        System.out.println("----------------------------------------\n" +
                "Digite o codigo da operacao desejada: \n" +
                "1_ Permutacao (Pn = n!)\n" +
                "2_ Arranjo (An,k = n! / (n-k)!)\n" +
                "3_ Combinacao (Cn,k = n! / (k! *(n-k)!))\n" +
                "4_ Sair\n" +
                "----------------------------------------");
        op = sc.nextInt();
        while (op > 4 || op < 1){
            System.err.println("CODIGO INVALIDO, TENTE NOVAMENTE");
            System.out.println("----------------------------------------\n" +
                    "Digite o codigo da operacao desejada: \n" +
                    "1_ Permutacao (Pn = n!)\n" +
                    "2_ Arranjo (An,k = n! / (n-k)!)\n" +
                    "3_ Combinacao (Cn,k = n! / (k! *(n-k)!))\n" +
                    "4_ Sair\n" +
                    "----------------------------------------");

            op = sc.nextInt();
        }

        switch (op){
            case 1:
                System.out.println("Insira o valor de n: ");
                n = sc.nextInt();

                resultado = calcularFatorialRecursivo(n);

                System.out.println("O resultado e: " + resultado);
                break;
            case 2:
                System.out.println("Insira o valor de n: ");
                n = sc.nextInt();

                System.out.println("Agora insira o valor de k: ");
                k = sc.nextInt();

                resultado = calcularFatorialRecursivo(n) / calcularFatorialRecursivo((n-k));
                System.out.println("O resultado e: " + resultado);
                break;
            case 3:
                System.out.println("Insira o valor de n: ");
                n = sc.nextInt();

                System.out.println("Agora insira o valor de k: ");
                k = sc.nextInt();

                resultado = calcularFatorialRecursivo(n) / (calcularFatorialRecursivo(k) * calcularFatorialRecursivo((n-k)));
                System.out.println("O resultado e: " + resultado);
                break;
            case 4:
                System.exit(4);
                break;
            default: System.exit(0);

        }




        sc.close();
    }
}
