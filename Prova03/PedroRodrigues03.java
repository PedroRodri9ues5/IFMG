import java.util.Scanner;

public class PedroRodrigues03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maiorN = null, menorN = null, nomes[] = new String[10];
        Double media = 0.0, notas[] = new Double[10];
        Double maior = 0.0, menor = 10000.0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome do aluno: ");
            nomes[i] = sc.nextLine();

            System.out.println("Agora insira a nota: ");
            notas[i] = sc.nextDouble();
            media = media + notas[i];

            sc.nextLine();
            if (notas[i] > maior){
                maior = notas[i];
                maiorN = nomes[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
                menorN = nomes[i];
            }
        }

        media = media/10;

        for (int i = 0; i < 10; i++) {
         if (notas[i] >= media){
             System.out.println("O aluno " + nomes[i] + " esta acima da media");
         }
        }

        System.out.println("A maior nota foi de: " + maior + " do aluno " + maiorN + ", a menor nota: " + menor + " do aluno " + menorN);


        sc.close();
    }
}