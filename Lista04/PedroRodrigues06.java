import java.util.Scanner;

public class PedroRodrigues06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        System.out.println("Vamos dividir um conjunto em dois, insira o tamanho do conjunto inicial: ");
        qtd = sc.nextInt();
        int conjuntoInicial[] = new int[qtd];
        int conjuntoUm[] = new int[qtd];
        int conjuntoDois[] = new int[qtd];
        for (int i = 0; i < qtd; i++){
            System.out.println("Insira o " + (i+1) + "º numero: ");
            conjuntoInicial[i] = sc. nextInt();
            if (conjuntoInicial[i] >= 0){
                if (conjuntoInicial[i] %2 == 0){
                    conjuntoUm[i] = conjuntoInicial[i];
                }
            }else conjuntoDois[i] = conjuntoInicial[i];
            if (conjuntoInicial[i] %2 != 0){
                conjuntoDois[i] = conjuntoInicial[i];
            }
        }
        System.out.println("Conjunto um: ");
        for (int i = 0; i < qtd; i++){
            if (conjuntoUm[i] != 0){
                System.out.println(conjuntoUm[i]);
            }
        }
        System.out.println("Conjunto dois: ");
        for (int i = 0; i < qtd; i++){
            if (conjuntoDois[i] != 0){
                System.out.println(conjuntoDois[i]);
            }
        }
        sc.close();
    }
}
