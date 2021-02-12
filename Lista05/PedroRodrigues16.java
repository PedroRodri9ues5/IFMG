import java.util.Scanner;

public class PedroRodrigues16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]planta = new int[50][3];
        String[] nome = new String[50];
        int op,qtdcadastrada = 0,codigo;
        boolean achou;
        do {
            System.out.println("==========================================");
            System.out.println("FLORICULTURA MARIASFLOR");
            System.out.println("==========================================");
            System.out.println("1. CADASTRAR NOVA PLANTA");
            System.out.println("2. RETIRAR PLANTA");
            System.out.println("3. INSERIR PLANTA");
            System.out.println("4. IMPRIMIR RELAT�RIO");
            System.out.println(";5. SAIR");
            System.out.println("===========================================");
            System.out.println("Digite a opcao desejada:");
            op=sc.nextInt();
            achou = false;
            switch(op) {
                case 1:
                    if(qtdcadastrada==50) {
                        System.out.println("Banco de dados cheio");
                    }
                    else {
                        if(qtdcadastrada == 0) {
                            System.out.println("Digite o nome da planta:");
                            nome[qtdcadastrada] = sc.nextLine();
                            System.out.println("Digite o codigo da:"+nome[qtdcadastrada]);
                            planta[qtdcadastrada][0] = sc.nextInt();
                            System.out.println("Digite o estoque atual da:"+nome[qtdcadastrada]);
                            planta[qtdcadastrada][1] = sc.nextInt();
                            System.out.println("Digite o estoque ideal da:"+nome[qtdcadastrada]);
                            planta[qtdcadastrada][2] = sc.nextInt();
                            qtdcadastrada++;
                        }
                        else{
                            System.out.println("Digite o nome da planta:");
                            nome[qtdcadastrada] = sc.nextLine();

                            do {
                                achou = false;

                                System.out.println("Digite o codigo da:"+nome[qtdcadastrada]);
                                codigo = sc.nextInt();
                                for(int i=0;i<qtdcadastrada;i++) {
                                    if(codigo==planta[i][0]) {
                                        achou = true;
                                    }

                                }
                                if(achou == true) {
                                    System.out.println("Codigo ja cadastrado!");
                                }
                            }while(achou==true);

                            planta[qtdcadastrada][0] = codigo;
                            System.out.println("Digite o estoque atual da:"+nome[qtdcadastrada]);
                            planta[qtdcadastrada][1] = sc.nextInt();
                            System.out.println("Digite o estoque ideal da:"+nome[qtdcadastrada]);
                            planta[qtdcadastrada][2] = sc.nextInt();
                            qtdcadastrada++;

                        }
                    }
                    break;
            }
        }while(op!=5);


    }
}
