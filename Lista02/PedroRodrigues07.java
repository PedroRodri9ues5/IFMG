import java.util.Scanner;

public class PedroRodrigues07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        boolean vogal;
        imprimir("Digite um caracter:");
        letra = sc.next().charAt(0);

        vogal = letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra =='u';

        if (vogal){
            imprimir("O caracter inserido e uma vogal!");
        }else {
            imprimir("O caracter inserido nao e uma vogal!");
        }

        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}
