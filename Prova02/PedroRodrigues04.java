import java.util.Scanner;

public class PedroRodrigues04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lampA = 0, lampB = 0, vezes, umBotao = 0, doisBotao = 0, aux, apertarBotUm = 0, apertarBotDois = 0;
        System.out.println("Insira quantas vezes os botoes serao apertados: ");
        vezes = sc.nextInt();
        System.out.println("Insira 1 para apertar o botao 1 ou 2 para apertar o botao 2: ");
        for (int i = 0; i < vezes; i++){
            aux = sc.nextInt();
            if (aux == 1){
                umBotao++;
            }else if (aux == 2){
                doisBotao++;
            }
           if (i < vezes - 1 ){
               System.out.println("Proximo botão");
           }
        }
        if (umBotao > 1){
            if (umBotao % 2 == 1){
                apertarBotUm++;
            }
        }else if (umBotao == 1){
            apertarBotUm++;
        }
        if (doisBotao > 1){
            if (doisBotao % 2 == 1){
                apertarBotDois++;
            }
        }else if (doisBotao == 1){
            apertarBotDois++;
        }

       if (apertarBotDois == 1){
           lampA++;
           lampB++;
       }
       if (apertarBotUm == 1){
           lampA++;
       }

       if (lampA == 0){
           System.out.println("A lampada A esta apagada e ");
       }else if (lampA == 1){
           System.out.println("A lampada A esta acesa e ");
       }
        if (lampB == 0 || lampB % 2 ==0){
            System.out.println("A lampada B esta apagada ");
        }else if (lampB == 1){
            System.out.println("A lampada B esta acesa ");
        }
        sc.close();
    }
}
