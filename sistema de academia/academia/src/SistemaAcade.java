
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Interface do console para entrada de dados

public class SistemaAcade {
    public static void main(String[] args){
        AlunoRepositorio alunoRepositorio = new AlunoRepositorio();
        Scanner scanner = new Scanner(System.in);

        //instâncias recepcionista e professor

        Recepcionista recepcionista = new Recepcionista("Ana", "555.666.777-88", 28, 20);
        Professor professor = new Professor("João", "123.456.789-00", 35, 1, "Musculação");

        while (true){
            System.out.println("\n---------- Sistema de Academia ------------");
            System.out.println("Escolha umas das opções");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Treino (Professor)");
            System.out.println("3. Visualizar treinos (Aluno)");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                //o caso 1 é para a recepcionista 
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o cpf do aluno: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    System.out.println("Digite a matricula do aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    Aluno novAluno = recepcionista.cadastrarAluno(nome, cpf, idade, matricula);
                    alunoRepositorio.adicionarAluno(novAluno);
                    break;

                    //caso 2 é para o professor 
                case 2:
                    System.out.println("Digite a matricula do aluno: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine();
                    Aluno aluno = alunoRepositorio.buscarPorMatricula(matricula);
                    if(aluno != null) {

                        //O professor tem a opão de cadastrar um treino ou varios treino no dia para o aluno

                        System.out.println("1. cadastra um treino");
                        System.out.println("2. cadastrar varios treinos ");
                        int escolha = scanner.nextInt();
                        scanner.nextLine();

                        switch (escolha) {
                            case 1:
                                System.out.println("Digite o dia da semana: ");
                                String dia = scanner.nextLine();
                                System.out.println("Digite o treino: ");
                                String treino = scanner.nextLine();
                                professor.cadastrarTreinoParaDia(aluno, dia, treino);
                                break;
                            case 2:
                                System.out.println("Digite o dia da semana: ");
                                String day = scanner.nextLine();

                                List<String> listaTreinos = new ArrayList<>();
                                String treinoInput;
                                System.out.println("Digite os treinos e depois digite sair para finalizar: ");

                                while(true){
                                    treinoInput = scanner.nextLine();
                                    if (treinoInput.equalsIgnoreCase("Sair")){
                                        break;
                                    }
                                    listaTreinos.add(treinoInput);
                                }
                                professor.cadastrarMultiplosTreinosParaDia(aluno, day, listaTreinos);
                                break;
                        }

                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                    
                    //caso 3 é para o aluno verificar seus treinos e ou o professor e recepcionista 

                case 3:
                    System.out.println("Digite a matricula do aluno: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine();
                    aluno = alunoRepositorio.buscarPorMatricula(matricula);
                    if(aluno != null){
                        System.out.println("Digite o dia da semana para visualizar os treino: ");
                        String dia = scanner.nextLine();
                        aluno.exibirTreinosPorDia(dia);
                    }else{
                        System.out.println("Aluno não encontrado. ");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema......");
                    scanner.close();
                    return;
            
                default:
                   System.out.println("Opção inválida. ");
            }
            
        }
    }

}
