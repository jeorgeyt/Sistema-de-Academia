
import java.util.List;

public class Professor extends Pessoa {
    private int id;
    private String especialidade; //especialidade é a area que o professor mas tem experiencia 

    public Professor(String nome, String cpf, int idade, int id, String especialidade) {
        super(nome, cpf, idade);
        this.especialidade = especialidade;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cadastrarTreinoParaDia(Aluno aluno, String dia, String treino) {
        aluno.adicionarTreino(dia, treino);
        System.err.println("Treino \"" + treino + "\" cadastrado para " + aluno.getNome() + " no dia " + dia + " pelo prefessor " + this.getNome());

    }

    public void cadastrarMultiplosTreinosParaDia(Aluno aluno, String dia, List<String> treinos){
        for(String treino : treinos){
            aluno.adicionarTreino(dia, treino);
        }
        System.err.println("Treinos para " + dia + " cadastrados para " + aluno.getNome() + " pelo professor " + this.getNome());
    }

}
