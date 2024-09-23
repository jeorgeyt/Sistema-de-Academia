public abstract class Pessoa implements PessoaInterface {
    private String nome;
    private String cpf;
    private int idade;

    //Construtor

    public Pessoa(String nome, String cpf, int idade) {//construtor
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }
    
    @Override
    public void exibirinformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
    
    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}
