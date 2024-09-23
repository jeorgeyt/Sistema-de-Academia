public class Recepcionista extends Pessoa {
    private int numeroGuiche;

    public Recepcionista(String nome, String cpf, int idade, int numeroGuiche) {
        super(nome, cpf, idade);
        this.numeroGuiche = numeroGuiche;
    }
    public Aluno cadastrarAluno(String nome, String cpf, int idade, int matricula){
        Aluno aluno = new Aluno(nome, cpf, idade, matricula);
        System.err.println("Recepcionista " + this.getNome() + " cadastrou o aluno " + nome + ".");
        return aluno;

    }

    @Override
    public void exibirinformacoes(){
        super.exibirinformacoes();
        System.out.println("Número do Guichê: " + numeroGuiche);
    }

}
