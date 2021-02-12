import java.util.Scanner;

public class PedroRodrigues01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pessoasEntrando = 0, andar = 0, i = 0, soma = 0, andarAtual = 0, saindoElevador = 0, maisp = 0, andarp = 0, saida = 0;
        System.out.println("Declare o numero de andares do predio:");
        andar = sc.nextInt();
        while(i < andar){
            i++;
            pessoasEntrando++;
            andarAtual++;
            System.out.println("Declare o numero de pessoas que iram entrar no "+andarAtual+" andar");
            pessoasEntrando = sc.nextInt();
            soma += pessoasEntrando;
            if(soma>15){
                saida = 0;
                saida = soma - 15;
                soma = soma - saida;

                System.out.println("Excesso de passageiros devem sair:" + saida + " pessoas");
            }
            if(soma>maisp){
                maisp=soma;
                andarp=andarAtual;
            }
            System.out.print("Quantas pessoas vão sair no proximo andar?:");
            saindoElevador = sc.nextInt();
            soma -= saindoElevador;
            System.out.println("Vão continuar subindo:"+soma+" pessoas");

        }
        System.out.println("No ultimo andar para descer terao "+soma+ "pessoas.");
        System.out.println("O andar q tinha mais pessoa e o:"+andarp+" com "+maisp+ " pessoas");

        sc.close();
    }
}
