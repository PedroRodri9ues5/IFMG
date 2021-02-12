import java.util.Scanner;

public class PedroRodrigues12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte idade;
        imprimir("Para saber a idade do nadador insira sua categoria:");
        idade = sc.nextByte();
        if (idade < 0 || idade > 99){
            System.err.println("IDADE INVALIDA!");
            System.exit(0);
        }else if (idade >= 5 && idade <= 7){
            imprimir("A categoria do nadador e: INFANTIL.");
        }else if (idade >= 8 && idade <= 10){
            imprimir("A categoria do nadador e: JUVENIL.");
        }else if (idade >= 11 && idade <= 15){
            imprimir("A categoria do nadador e: ADOLESCENTE.");
        }else if (idade >= 16 && idade <= 40){
            imprimir("A categoria do nadador e: ADULTO.");
        }else if (idade >= 40){
           imprimir("A categoria do nadador e: SENIOR.");
        }else {
            imprimir("O nadador nao se enquadra em nenhuma categoria.");
        }

        sc.close();
    }
    static void imprimir(String texto ){
        System.out.println(texto);
    }
}
