import java.util.Scanner;

public class PedroRodrigues17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUm, numDois,resto;
        System.out.print("Vamos calcular o MDC (Maximo Divisor Comum) entre dois numeros.\nInsira o valor do primeiro numero: ");
        numUm = sc.nextInt();
        System.out.println("Agora insira o segundo: ");
        numDois = sc.nextInt();
        while(numDois != 0){
            resto = numUm%numDois;
            numUm = numDois;
            numDois = resto;
        }

        System.out.println("O MDC e: " + numUm);

        sc.close();
    }
}
