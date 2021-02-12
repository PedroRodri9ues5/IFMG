import java.util.Scanner;

public class PedroRodrigues08 {
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
        int num, fatorial;

        System.out.println("Insira um valor inteiro e positivo para calcular seu fatorial: ");
        num = sc.nextInt();

        fatorial = calcularFatorial(num);

        System.out.println("O fatorial desse numero e: " + fatorial);


        sc.close();
    }
}
