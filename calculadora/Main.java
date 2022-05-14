import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao = 0;
        
        do {
            System.out.println("Calculadora do Arthur, Bem vindo!!! ");
            System.out.println("============================\n");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            opcao = Integer.parseInt(ler.nextLine());

            switch(opcao){
                case 1:
                    System.out.println("1 case");
                    int a = Integer.parseInt(ler.nextLine());
                    int b = Integer.parseInt(ler.nextLine());
                    System.out.println("A soma é "+calc.somar(a, b));
                    break;

                case 2:
                    System.out.println("2 case");
                    break;

                default:
                    System.err.println("opção errada");
            }
        } while (opcao != 3);

        System.out.println("Tchau!!!");
    }
}
