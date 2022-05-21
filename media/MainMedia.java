import java.util.*;
import java. util. Arrays;
public class MainMedia {

    public static final int T = 5; //MUDE O TAMANHO AQUI!!!

    public static void main(String[] args) {
        int i;
        Scanner ler= new Scanner(System.in); 
        System.out.println("Digite abaixo "+T+" números inteiros para calcularmos a media aritmética deles");
        System.out.println();
        int vet[] = new int[T];
        int soma = 0;

            for(i = 0;i < vet.length; i++){
                System.out.printf("Digite o "+i+"º número: ");
                float num = ler.nextFloat();
                float b = (num*10) % 10;    

                if(b==0){
                    int c = (int) num;
                    vet[i] = c;
                    soma = soma + vet[i];
                }
                    else{
                    System.out.println();
                    System.out.println("!!!POR FAVOR APENAS NÚMEROS INTEIROS!!!");
                    }
            }
                System.out.println();
                System.out.println("<<<< VALORES >>>>");
                System.out.println();

                for(i = 0;i < vet.length; i++){
                    System.out.print("|"+ vet[i] +"| ");
                }
                
            System.out.println("\n");
            System.out.println("SOMA DOS VALORES: "+ soma);
            System.out.println("MEDIA DOS VALORES: "+ soma/vet.length);
            System.out.println();



        // Faça um programa que utilize uma estrutura de repetição para ler 50 números armazenando-os em um vetor, calcule e exiba a média aritmética deles. 
        // Em seguida o programa deve apresentar todos os valores armazenados no vetor que sejam menores que a média.
    }
}
