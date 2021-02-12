import java.util.Scanner;

public class PedroRodrigues08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        imprimir("Vamos calcular seu aumento!\nInsira o valorde seu salario:");
        salario = sc.nextDouble();

        if (salario < 0){
            System.err.println("SALARIO INVALIDO!");
        }else if (salario >= 700){
            salario = salario * 1.1;
        }else if (salario < 700){
            salario = salario * 1.3;
        }

        System.out.printf("O novosalario sera de: %.2f", salario);

        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}
//    Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior à R$700,00 e 10% aos
//        funcionários com salário superior ou igual à R$700,00. Faça um algoritmo que calcule o reajuste e mostre
//        o novo salário.