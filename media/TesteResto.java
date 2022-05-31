import java.util.*;

public class TesteResto {

    public static final int T = 5; //MUDE O TAMANHO AQUI!!!

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in); 
        System.out.println("NUM1: ");
                float num = ler.nextFloat();
                float num2 = 11;
                float resto = (2*num) % num2;    

                System.out.println(); 
            System.out.println(num +" dividido por "+ num2 +" resto= "+ resto);
            
            System.out.println("quer K+1?");
                int r = ler.nextInt();
                if(r == 1){
                    num = num + 2;
                    resto = (2*num) % num2; 
                    System.out.println(num +" dividido por "+ num2 +" resto= "+ resto);
                }
                else{
                }
            

            System.out.println();



        // Faça um programa que utilize uma estrutura de repetição para ler 50 números armazenando-os em um vetor, calcule e exiba a média aritmética deles. 
        // Em seguida o programa deve apresentar todos os valores armazenados no vetor que sejam menores que a média.
    }
}
