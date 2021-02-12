import java.util.Scanner;

public class PedroRodrigues11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cidade[][]= new int [4][4];
        cidade[0][0]=1;
        cidade[0][1]=1;
        cidade[0][2]=1;
        cidade[0][3]=0;
        cidade[1][0]=0;
        cidade[1][1]=1;
        cidade[1][2]=1;
        cidade[1][3]=0;
        cidade[2][0]=1;
        cidade[2][1]=0;
        cidade[2][2]=1;
        cidade[2][3]=1;
        cidade[3][0]=0;
        cidade[3][1]=0;
        cidade[3][2]=1;
        cidade[3][3]=1;
        int k=0,i=0,y=0,aux=0,aux2=0,auxm=0,maior=0,cont=0,cidadeiso=0;
        System.out.println("Insira o numero da cidade de 0 a 3:");
        k = sc.nextInt();
        for(int x=0;x<k;x++){
            if((cidade[x][k]) == 1){
                aux++;
            }
            if((cidade[k][x]) == 1){
                aux2++;

            }
        }
        System.out.println("Saem: "+aux2+" de estradas da cidade e entram: "+aux+" estradas");
        aux=0;
        for(int x=0;x<k;x++){
            for(int e=0; e<k; e++) {
                if (cidade[e][x] == 1) {
                    aux++;
                }

                if (aux>auxm) {
                    auxm = aux;
                    maior=x;
                }
            }

        }
        System.out.println("A cidade: "+maior+" e a que mais tem estradas chegando com: "+auxm+" estradas");

        for(int x=0;x<4;x++){
            for(int e=0;e<4;e++){
                if(cidade[x][e]==0){
                    cont++;
                }
                if(cont==3){
                    cidadeiso+=x;
                }
            }

        }
        System.out.println("O numero de cidades isoladas e:"+cidadeiso);
    }
}
