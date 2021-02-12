import java.util.Scanner;

public class PedroRodrigues11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de alunos e notas a ser avaliados:");
        int aux = 0,nomeMaior = 0, nomeMenor = 0, numAlunos = sc.nextInt();
        String nomes[] = new String[numAlunos];
        Double notaMenor, notaMaior, soma = 0.0, notas[] = new Double[numAlunos];

        do {
            sc.nextLine();
            System.out.print("Digite o nome do " +(aux+1) + "º aluno: ");
            nomes[aux] = sc.nextLine();
            System.out.print("Digite a nota do " +(aux+1) + "º aluno: ");
            notas[aux] = sc.nextDouble();
            aux++;

        }while (aux < numAlunos);

        notaMenor = notas[0];
        notaMaior = notas[0];

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

            if (notaMenor > notas[i]){
                notaMenor = notas[i];
                nomeMenor = i;
            }
            if (notaMaior < notas[i]) {
                notaMaior = notas[i];
                nomeMaior = i;
            }
        }

        System.out.println("O aluno " + nomes[nomeMaior] + " teve a maior nota: " + notaMaior +
                "\nO aluno " + nomes[nomeMenor] + " teve a menor nota " + notaMenor);


    }
}