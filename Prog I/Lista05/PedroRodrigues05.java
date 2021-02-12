import java.util.Scanner;

public class PedroRodrigues05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[][] notas = new Double[10][5];
        String[] nomes = new String[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira o nome do aluno " + (i+1) + " :");
            nomes[i] = sc.next();
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Insira a nota " + (j+1) + " do aluno " + nomes[i] + " :");
                notas[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < notas.length; i++) {
           Double media = 0.0;
            for (int j = 0; j < notas[i].length; j++) {
                media += notas[i][j];
            }
            media = media / 5;
            if (media < 4){
                System.out.println("Media do aluno " + nomes[i] + " e de: " + media + " e o resultado final e: Reprovado");
            }else if (media >= 4 && media < 7){
                System.out.println("Media do aluno " + nomes[i] + " e de: " + media + " e o resultado final e: Exame Especial");
            }else if (media >= 7){
                System.out.println("Media do aluno " + nomes[i] + " e de: " + media + " e o resultado final e: Aprovado");
            }
        }

        sc.close();
    }
}