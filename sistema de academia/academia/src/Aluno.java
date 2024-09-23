import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Aluno extends Pessoa{
    private int matricula;
    private HashMap<String, List<String>> treinosSemana = new HashMap<>();

    //construtor

    public Aluno(String nome, String cpf, int idade, int matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        inicializarTreinosSemana();
    }

   private void inicializarTreinosSemana(){
        treinosSemana.put("segunda", new ArrayList<>());
        treinosSemana.put("terça", new ArrayList<>());
        treinosSemana.put("quarta", new ArrayList<>());
        treinosSemana.put("quinta", new ArrayList<>());
        treinosSemana.put("sexta", new ArrayList<>());
        treinosSemana.put("sábado", new ArrayList<>());
   }
    //Gtters e Setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //Metodo para addd treino a lista

    public void adicionarTreino(String dia, String treino){
        List<String> treinosDoDia = treinosSemana.get(dia);
        if (treinosDoDia != null){
            treinosDoDia.add(treino);
        }else{
            System.out.println("Dia inválido!");
        }


    }

    //metodo para exibir o treino do dia

    public void exibirTreinosPorDia(String dia){
        List<String> treinosDoDia = treinosSemana.get(dia);
        if (treinosDoDia != null && !treinosDoDia.isEmpty()){
            System.out.println("Treinos de " + dia + ": " + treinosDoDia);
        }else{
            System.out.println("Sem treinos para " + dia);
        }
    }
    @Override
    public void exibirinformacoes(){
        super.exibirinformacoes();
        System.out.println("Matricula: " + matricula);
    }
    

}
