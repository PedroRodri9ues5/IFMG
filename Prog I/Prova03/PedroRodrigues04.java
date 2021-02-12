import java.util.Scanner;

public class PedroRodrigues04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int [10];
        int[] array2 = new int [10];
        int[] array3 = new int [10];
        for(int i = 0; i < 10; i++){
            System.out.println("Insira o numero da " + (i+1) + "ª posição do vetor");
            array1[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Insira o numero da " + (i+1) + "ª posição do vetor");
            array2[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            if((array1[i] + array2[i])%2 == 0) array3[i] = 1;
            else array3[i] = 0;
        }
        for(int i = 0; i < 10; i++){
            System.out.print(array3[i] + "|");
        }
        sc.close();
    }
}
