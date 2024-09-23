import java.util.ArrayList;
import java.util.List;


public class AlunoRepositorio {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public Aluno buscarPorMatricula(int matricula){
        for (Aluno aluno : alunos){
            if (aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> listaAlunos(){
        return alunos;
    }
}
