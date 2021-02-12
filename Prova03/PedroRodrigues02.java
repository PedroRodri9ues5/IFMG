import java.util.Scanner;

public class PedroRodrigues02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sorteado = new int[15];
        int[] apostado = new int[15];
        int acertos = 0;

        System.out.println("Insira os numeros apostados: ");
        for (int i = 0; i < apostado.length; i++) {
            apostado[i] = sc.nextInt();
        }

        System.out.println("Agora insira os numeros sorteados: ");
        for (int i = 0; i < sorteado.length; i++) {
            sorteado[i] = sc.nextInt();
        }

        for (int i = 0; i < sorteado.length; i++) {
            for (int j = 0; j < sorteado.length; j++) {
                if (apostado[i] == sorteado[j]){
                    acertos ++;
                }
            }
        }

        if (acertos == 13){
            System.out.println("Voce recebeu o premio: AZARENTO!");
        }else if (acertos == 14){
            System.out.println("Voce recebeu o premio: QUASE NADA");
        }else if (acertos == 15){
            System.out.println("Voce recebeu o premio: QUASE TUDO!");
        }else if (acertos == 0){
            System.out.println("Voce recebeu o premio: NADA!");
        }
        sc.close();
    }
}
