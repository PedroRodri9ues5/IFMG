import java.util.Scanner;

public class PedroRodrigues09 {
    static int calcularFatorial (int num){
        int resultado = num;
        if (num == 0)
            return 1;
        while (num > 1){
            resultado = resultado * (num -1);
            num--;
        }
        return resultado;
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

        switch (op){
            case 1:
                System.out.println("Insira o valor de n: ");
                n = sc.nextInt();

                resultado = calcularFatorial(n);

                System.out.println("O resultado e: " + resultado);
                break;
            case 2:
                System.out.println("Insira o valor de n: ");
                n = sc.nextInt();

                System.out.println("Agora insira o valor de k: ");
                k = sc.nextInt();

                resultado = calcularFatorial(n) / calcularFatorial((n-k));
                System.out.println("O resultado e: " + resultado);
                break;
            case 3:
                System.out.println("Insira o valor de n: ");
                n = sc.nextInt();

                System.out.println("Agora insira o valor de k: ");
                k = sc.nextInt();

                resultado = calcularFatorial(n) / (calcularFatorial(k) * calcularFatorial((n-k)));
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
