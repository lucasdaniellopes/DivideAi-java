package src;
import java.util.ArrayList;
import java.util.Scanner; public class Main {
    public static void main(String[] args) {

        AdmResidencia admin = new AdmResidencia("Mikael");

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Adicionar/Visualizar Participantes:");
            System.out.println("2 - Adicionar/Visualizar Tarefas:");
            System.out.println("3 - Adicionar/Visualizar Despesas:");
            int opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n 1 - Adicionar Membros: \n 2 - Visualizar Membro:: \n 3 - Sair ");
                    int opcaoMenu = s.nextInt();
                    s.nextLine();


                    if (opcaoMenu == 1) {
                        while (true) {
                            System.out.println("Digite o nome do novo membro ou 'Sair' para Sair:");
                            String nomeMembro = s.nextLine();

                            if (nomeMembro.equalsIgnoreCase("Sair")) {
                                System.out.println("Membros:");
                                for (Morador morador : admin.getMoradores()) {
                                    System.out.println(morador.getNome());
                                }
                                break;
                            }
                            MoradorSimples novoMorador = new MoradorSimples(nomeMembro);
                            admin.adicionarMorador(novoMorador);
                            System.out.println("Membro: " + nomeMembro + " adicionado.");
                        }
                    } else if (opcaoMenu == 2) {
                        System.out.println("Membros:");
                        for (Morador morador : admin.getMoradores()) {
                            System.out.println(morador.getNome());
                        }
                    } else if (opcaoMenu == 3) {
                        break;
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;


                case 2:

                    System.out.println("\n 1 - Adicionar Tarefas: \n 2 - Visualizar Tarefa:: \n 3 - Sair ");
                    int opcaoMen = s.nextInt();
                    s.nextLine();

                    if (opcaoMen == 1) {
                        while (true) {
                            System.out.println("Digite a tarefa para adicionar ou 'Sair' para Sair:");
                            String nomeTarefa = s.nextLine();

                            if (nomeTarefa.equalsIgnoreCase("Sair")) {
                                System.out.println("Tarefas:");
                                for (Tarefa tarefas : admin.getTarefasCompartilhadas()) {
                                    System.out.println(tarefas.getNome());

                                }
                                break;
                            }
                            TarefaSimples novaTarefa = new TarefaSimples(nomeTarefa);
                            admin.adicionarTarefa(novaTarefa);
                            System.out.println("Tarefa: " + nomeTarefa + " adicionado.");
                        }

                        } else if (opcaoMen == 2) {
                            System.out.println("Tarefas:");
                            for (Tarefa tarefa : admin.getTarefasCompartilhadas()) {
                                System.out.println(tarefa.getNome());
                            }
                        } else if (opcaoMen == 3) {
                            break;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                        break;
                    }break;
            }
        }
    }
}