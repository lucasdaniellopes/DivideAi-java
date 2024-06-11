package src;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        AdmResidencia admin = new AdmResidencia("Mikael");
        Scanner s = new Scanner(System.in);
        int proximoIdTarefa = 1;

        while (true) {
            System.out.println("---ORGANIZADOR JAVA---");
            System.out.println("_________________________");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Adicionar/Visualizar Participantes:");
            System.out.println("2 - Adicionar/Visualizar Tarefas:");
            System.out.println("3 - Adicionar/Visualizar Despesas:");
            System.out.println("_________________________");
            
            try {
                int opcao = Integer.parseInt(s.nextLine());
        
                switch (opcao) {
                    case 1:
                        while (true) {
                            System.out.println("----- MENU MEMBROS-----");
                            System.out.println("_________________________");
                            System.out.println("\n1 - Adicionar Membros:");
                            System.out.println("2 - Visualizar Membros:");
                            System.out.println("3 - Voltar ao Menu Principal");
                            System.out.println("_________________________");
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
                    }
                    break;
                    case 2:
                    while (true) {
                        System.out.println("----- MENU TAREFA-----");
                        System.out.println("_________________________");
                        System.out.println("\n1 - Adicionar Tarefa:");
                        System.out.println("2 - Visualizar Tarefas:");
                        System.out.println("3 - Remover Tarefas:");
                        System.out.println("4 - Voltar ao Menu Principal");
                        System.out.println("_________________________");
                        int opcaoMen = s.nextInt();
                        s.nextLine();

                        if (opcaoMen == 1) {
                            while (true) {
                                System.out.println("Digite a tarefa para adicionar ou 'Sair' para Sair:");
                                String nomeTarefa = s.nextLine();

                                if (nomeTarefa.equalsIgnoreCase("Sair")) {
                                    break;
                                }
                                TarefaSimples novaTarefa = new TarefaSimples(proximoIdTarefa, nomeTarefa);
                                admin.adicionarTarefa(novaTarefa);
                                System.out.println("Tarefa: " + nomeTarefa + " adicionada com ID " + proximoIdTarefa);
                                proximoIdTarefa++;
                            }
                        } else if (opcaoMen == 2) {
                            System.out.println("Tarefas:");

                            for (Tarefa tarefa : admin.getTarefasCompartilhadas()) {
                                System.out.println("ID: " + tarefa.getId() + ", tarefa: " + tarefa.getNome());
                            }
                        } else if (opcaoMen == 3) {
                            System.out.println("Digite o ID da tarefa para remover ou 'Sair' para voltar:");
                            String idTarefa = s.nextLine();
                            if (idTarefa.equalsIgnoreCase("Sair")) {
                                break;
                            }
                            try {
                                int id = Integer.parseInt(idTarefa);
                                admin.removerTarefa(id);
                                System.out.println("Tarefa com ID " + id + " removida.");
                            } catch (NumberFormatException e) {
                                System.out.println("ID inválido. Por favor, digite um número.");
                            }
                        } else if (opcaoMen == 4) {
                            break;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;
                    
                    case 3:
                    while (true) {
                        System.out.println("----- MENU DESPESAS-----");
                        System.out.println("_________________________");
                        System.out.println("\n1 - Adicionar Despesa:");
                        System.out.println("2 - Visualizar Despesas:");
                        System.out.println("3 - Remover Despesa:");
                        System.out.println("4 - Voltar ao Menu Principal");
                        System.out.println("_________________________");
                        int opcaoDespesas = s.nextInt();
                        s.nextLine();
                
                        if (opcaoDespesas == 1) {
                            while (true) {
                                System.out.println("Digite a descrição da despesa ou 'Sair' para Sair:");
                                String descricao = s.nextLine();
                
                                if (descricao.equalsIgnoreCase("Sair")) {
                                    break;
                                }
                
                                System.out.println("Digite o valor da despesa:");
                                double valor = s.nextDouble();
                                s.nextLine(); 
                
                                System.out.println("Digite a data da despesa (formato: dd/mm/aaaa):");
                                String data = s.nextLine();
                
                                int idDespesa = admin.getDespesasCompartilhadas().size() + 1; 
                
                                DespesaConcreta novaDespesa = new DespesaConcreta(idDespesa, descricao, valor, data);
                                admin.registrarDespesa(novaDespesa);
                                System.out.println("Despesa: " + descricao + " adicionada com ID " + idDespesa);
                            }
                        } else if (opcaoDespesas == 2) {
                            System.out.println("Despesas:");
                
                            for (Despesa despesa : admin.getDespesasCompartilhadas()) {
                                despesa.visualizar();
                            }
                        } else if (opcaoDespesas == 3) {
                            System.out.println("Digite o ID da despesa para remover ou 'Sair' para voltar:");
                            String idDespesaStr = s.nextLine();
                            if (idDespesaStr.equalsIgnoreCase("Sair")) {
                                break;
                            }
                            try {
                                int idDespesa = Integer.parseInt(idDespesaStr);
                                admin.removerDespesa(idDespesa);
                                System.out.println("Despesa com ID " + idDespesa + " removida.");
                            } catch (NumberFormatException e) {
                                System.out.println("ID inválido. Por favor, digite um número.");
                            }
                        } else if (opcaoDespesas == 4) {
                            break;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;
            
                    default:
                        System.out.println("Opção inválida. Por favor, digite um número entre 1 e 3.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("digite uma opção valida. ");
                
            }
        }
    }
}        