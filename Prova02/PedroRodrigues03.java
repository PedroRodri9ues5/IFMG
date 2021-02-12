import java.util.Scanner;

public class PedroRodrigues03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, soma = 0, irmaoImpar, irmaoPar = 0;
        System.out.println("Digite um numero:");
        num = sc.nextInt();
        for(int i = num; i > 0 ; i--)
        {
            if(num % i == 0)
            {
                soma += i;
                if(soma % 2 == 0)
                {
                    irmaoPar =+ soma;
                    System.out.println("Numero e irmao par: " + irmaoPar);

                } else{
                    irmaoImpar =+ soma;
                    System.out.println("Numero e irmao impar: " + irmaoImpar);

                }
            }
        }
        sc.close();
    }

}
