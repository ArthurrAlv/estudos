import java.util.Scanner;

public class ProCalc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calc calc = new Calc();
        int opcao = 0;


            while (opcao != 6){

                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("Calculadora do Arthur, Bem vindo!!! ");
                    System.out.println("===================================\n\n");
                    System.out.println("* Escolha abaixo qual das operaçôes deseja fazer\n");
                    System.out.println("1 -> SOMAR");
                    System.out.println("2 -> SUBTRAIR");
                    System.out.println("3 -> MULTIPLICAR");
                    System.out.println("4 -> DIVIDIR");
                    System.out.println("");
                    System.out.println("6 -> ENCERRAR CALCULADORA");
                    System.out.println("");
                    System.out.printf("DIGITE AQUI:");
                    opcao = Integer.parseInt(ler.nextLine());

                if(opcao != 6){
                    do{
                        
                            switch(opcao){
                                case 1:
                                    System.out.println("");
                                    System.out.println("DIGITE O DOIS NÚMEROS QUE DESEJA SOMAR");
                                    System.out.printf("PRIMEIRO NÚMERO:"); float a = Float.valueOf(ler.nextLine());
                                    System.out.printf("SEGUNDO NÚMERO:"); float b = Float.valueOf(ler.nextLine());
                                    System.out.println("Resultado = "+calc.somar(a, b));
                                    System.out.println("");
                                    System.out.println("*   O QUE DESEJA FAZER?   *");
                                    System.out.println("1 - FAZER OUTRA ADIÇAÕ");
                                    System.out.println("2 - VOLTAR AO MENU");
                                    System.out.println("3 - FECHAR CALCULADORA");
                                    System.out.println("");
                                    System.out.printf("DIGITE AQUI:");
                                    int p = Integer.parseInt(ler.nextLine());
                                if (p == 2){
                                        opcao = 5;
                                        break;
                                    }    
                                    else{
                                        if(p == 3){
                                            System.out.println("ESPERO TER AJUDADO, VOLTE SEMPRE!");
                                            System.exit(0);
                                            break;
                                        }
                                        else{
                                            opcao = 1;
                                            break;
                                        }
                                    }

                                case 2:
                                    System.out.println("");
                                    System.out.println("DIGITE O DOIS NÚMEROS QUE DESEJA SUBTRAIR");
                                    System.out.printf("PRIMEIRO NÚMERO:"); float a2 = Float.valueOf(ler.nextLine());
                                    System.out.printf("SEGUNDO NÚMERO:"); float b2 = Float.valueOf(ler.nextLine());
                                    System.out.println("Resultado = "+calc.subtrair(a2, b2));
                                    System.out.println("");
                                    System.out.println("*   O QUE DESEJA FAZER?   *");
                                    System.out.println("1 - FAZER OUTRA SUBTRAÇÃO");
                                    System.out.println("2 - VOLTAR AO MENU");
                                    System.out.println("3 - FECHAR CALCULADORA");
                                    System.out.println("");
                                    System.out.printf("DIGITE AQUI:");
                                    int p1 = Integer.parseInt(ler.nextLine());
                                if (p1 == 2){
                                        opcao = 5;
                                        break;
                                    }    
                                    else{
                                        if(p1 == 3){
                                            System.out.println("ESPERO TER AJUDADO, VOLTE SEMPRE!");
                                            System.exit(0);
                                            break;
                                        }
                                        else{
                                            opcao = 2;
                                            break;
                                        }
                                    }
                                
                                case 3:
                                    System.out.println("");
                                    System.out.println("DIGITE O DOIS NÚMEROS QUE DESEJA MULTIPLICAR");
                                    System.out.printf("PRIMEIRO NÚMERO:"); float a3 = Float.valueOf(ler.nextLine());
                                    System.out.printf("SEGUNDO NÚMERO:"); float b3 = Float.valueOf(ler.nextLine());
                                    System.out.println("Resultado = "+calc.multiplicar(a3, b3));
                                    System.out.println("");
                                    System.out.println("*   O QUE DESEJA FAZER?   *");
                                    System.out.println("1 - FAZER OUTRA MULTIPLICAÇÃO");
                                    System.out.println("2 - VOLTAR AO MENU");
                                    System.out.println("3 - FECHAR CALCULADORA");
                                    System.out.println("");
                                    System.out.printf("DIGITE AQUI:");
                                    int p2 = Integer.parseInt(ler.nextLine());
                                if (p2 == 2){
                                        opcao = 5;
                                        break;
                                    }    
                                    else{
                                        if(p2 == 3){
                                            System.out.println("ESPERO TER AJUDADO, VOLTE SEMPRE!");
                                            System.exit(0);
                                            break;
                                        }
                                        else{
                                            opcao = 3;
                                            break;
                                        }
                                    }
                                
                                
                                case 4:
                                    System.out.println("");
                                    System.out.println("DIGITE O DOIS NÚMEROS QUE DESEJA DIVIDIR");
                                    System.out.printf("PRIMEIRO NÚMERO:"); float a4 = Float.valueOf(ler.nextLine());
                                    System.out.printf("SEGUNDO NÚMERO:"); float b4 = Float.valueOf(ler.nextLine());
                                    System.out.println("Resultado = "+calc.dividir(a4, b4));
                                    System.out.println("");
                                    System.out.println("*   O QUE DESEJA FAZER?   *");
                                    System.out.println("1 - FAZER OUTRA DIVISÃO");
                                    System.out.println("2 - VOLTAR AO MENU");
                                    System.out.println("3 - FECHAR CALCULADORA");
                                    System.out.println("");
                                    System.out.printf("DIGITE AQUI:");
                                    int p3 = Integer.parseInt(ler.nextLine());
                                if (p3 == 2){
                                        opcao = 5;
                                        break;
                                    }    
                                    else{
                                        if(p3 == 3){
                                            System.out.println("ESPERO TER AJUDADO, VOLTE SEMPRE!");
                                            System.exit(0);
                                            break;
                                        }
                                        else{
                                            opcao = 4;
                                            break;
                                        }
                                    }

                                case 5:
                                    break;

                                case 6:
                                    break;
                        }
                        
                    }while (opcao != 5);
                }
                else{
                    break;
                }    
            }

                System.err.println("");
                System.out.println("ESPERO TER AJUDADO, VOLTE SEMPRE!");
                

    }
}
