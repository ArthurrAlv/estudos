public class Cliente {

    //PROPRIEDADES
    private String nome;
    private String cpf;

    //CONSTRUTOR
    public Cliente(String nome, String cpf){ //tratamento de exceçao//
    
        if(cpf == null || cpf.equals("")){
            throw new IllegalArgumentException("CPF invalido");
        }

        this.nome = nome;
        this.cpf = cpf;

    }

    //METODOS
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
