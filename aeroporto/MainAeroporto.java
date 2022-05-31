import javax.swing.JOptionPane;

public class MainAeroporto {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Entre com o nome do cliente");
        String cpf = JOptionPane.showInputDialog(null, "Entre com o cpf do cliente");;

        try{

            Cliente cliente1 = new Cliente(nome, cpf);  //nv instancia 
            JOptionPane.showMessageDialog(null, "Cliente: "+ cliente1.getNome() +"\nCPF: "+cliente1.getCpf(), "title", JOptionPane.INFORMATION_MESSAGE);

        }catch(IllegalArgumentException e){

            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }

        
       




    /*    Scanner ler = new Scanner(System.in);
        int opcao = 0;
      char confirma = 'N';
      String pesquisa;

      do{
          System.out.println("Bem-vindo!");
          System.out.println("==========");
          System.out.println("1 - Novo Passageiro"); 
          System.out.println("2 - Desistência");
          System.out.println("3 - Detalhar Vôo");
          System.out.println("9 - Sair");
          opcao = ler.nextInt();

          switch(opcao){
            case 1:
                System.out.println("Digite seus dados abaixo:");
                System.out.printf("Nome: ");String nome = ler.nextLine();
                System.out.printf("CPF: ");String cpf = ler.nextLine();
            
            case 9:
                System.out.println("Tem certeza que deseja sair?");
                confirma = ler.next().toUpperCase().charAt(0);
        }

    } while(confirma != 'S');*/
}
}
