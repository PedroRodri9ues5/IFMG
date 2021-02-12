import java.util.Scanner;

public class PedroRodrigues13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;

        imprimir("Para calcular o IMC de um adulto, insira a altura: ");
        altura = sc.nextDouble();

        imprimir("E o peso: ");
        peso = sc.nextDouble();

        imc = peso / (altura * altura);

        if (imc <= 18.5){
           imprimir("ABAIXO DO PESO.");
        }else if (imc > 18.5 && imc <= 25){
            imprimir("PESO NORMAL.");
        }else if (imc > 25 && imc <= 30){
            imprimir("ACIMA PESO.");
        }else if (imc > 30){
            imprimir("OBESO");
        }


        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}
