import java.util.Scanner;

public class PedroRodrigues11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorX, resultado;
        imprimir("Vamos calcular o valor de f(x) \nInsira o valor de X: ");
        valorX = sc.nextDouble();

        if (valorX <= 1){
            imprimir("O valor de f(x) e: 1");
        }else  if (valorX > 1 && valorX <= 2){
            imprimir("O valor de f(x) e: 2");
        }else  if (valorX > 2 && valorX <= 3){
            resultado = valorX * valorX;
            imprimir("O valor de f(x) e: "+ resultado);
        }else  if (valorX > 3){
            resultado = valorX * valorX * valorX;
            imprimir("O valor de f(x) e: "+ resultado);
        }

        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}
