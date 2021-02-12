import java.util.Scanner;

public class PedroRodrigues14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tensaoS, diametroD, cargaQ;

        imprimir("Vamos calcular a tensao de uma barra cilindrica.\nPara isso insira o diametro da barra: ");
        diametroD = sc.nextDouble();

        imprimir("Agora insira a carga submetida na barra: ");
        cargaQ = sc.nextDouble();

        tensaoS = (4 * cargaQ) / (Math.PI * diametroD * diametroD);

        if (diametroD > 100){
            tensaoS = tensaoS * 2;
        }else if (diametroD < 50){
            tensaoS = tensaoS * 6;
        }else if (diametroD >= 50 && diametroD<= 100){
            tensaoS = tensaoS * 4;
        }

        System.out.printf("A tensao da barra e de: %.3f", tensaoS);

        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}
