import java.util.Scanner;

public class PedroRodrigues00 {
    static String numeroParaMes(int mesNumeros){
       String mesLetras = null;

       switch (mesNumeros){
          case 1 :
              mesLetras = "Janeiro";
              break;
          case 2 :
              mesLetras = "Fevereiro";
              break;
          case 3 :
              mesLetras = "Marco";
              break;
          case 4 :
              mesLetras = "Abril";
              break;
          case 5 :
              mesLetras = "Maio";
              break;
          case 6 :
              mesLetras = "Junho";
              break;
          case 7 :
              mesLetras = "Julho";
              break;
          case 8 :
              mesLetras = "Agosto";
              break;
          case 9 :
              mesLetras = "Setembro";
              break;
          case 10 :
              mesLetras = "Outubro";
              break;
          case 11 :
              mesLetras = "Novembro";
              break;
          case 12 :
              mesLetras = "Dezembro";
              break;
       }

        return mesLetras;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mesInteiro;
        System.out.println("Insira um número de 1 a 12 para ver qual o mes referente: ");
        do {
            mesInteiro = sc.nextInt();
            if (mesInteiro < 1  || mesInteiro > 12){
                System.err.println("VALOR INVALIDO");
                System.out.println("Insira um número de 1 a 12 para ver qual o mes referente: ");

            }
        }while (mesInteiro < 1  || mesInteiro > 12);

        String mesEscrito = numeroParaMes(mesInteiro);

        System.out.println(mesEscrito);

        sc.close();
    }
}
