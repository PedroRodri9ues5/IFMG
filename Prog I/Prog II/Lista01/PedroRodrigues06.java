import java.util.Scanner;

public class PedroRodrigues06 {
    static float maiorNum(float num1, float num2){
        float igual = 0;
        if (num1 > num2){
            return num1;
        }else if (num2 > num1){
            return num2;
        }else return igual;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2, maior;

        System.out.println("Para comparar dois valores (diferentes de 0) insira o primeiro: ");
        num1 = sc.nextFloat();

        System.out.println("Insira o segundo: ");
        num2 = sc.nextFloat();

        maior = maiorNum(num1,num2);

        if (maior == 0){
            System.out.println("Os numeros sao iguais");
        }else System.out.println("O maior numero e o " + maior);

        sc.close();
    }
}
