package application;

import entities.*;

import java.util.*;


public class Program {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            List<Aluno> listAlunos = new ArrayList<>();

            Aluno aluno;
            int op = 0;
            do {

                System.out.println("<---SEJA BEM VINDO AO SISTEMA ESCOLA--->");
                System.out.println("<---DIGITE O NUMERO DA OPCAO QUE DESEJA--->");
                System.out.println("0 - SAIR");
                System.out.println("1 - CADASTRO DE ALUNO");
                System.out.println("2 - LISTAR ALUNOS");
                System.out.println("3 - REMOVER ALUNO");
                System.out.println("4 - PESQUISAR ALUNOS");
                System.out.println("5 - ATUALIZAR ALUNO");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("<--- CADASTRO DE ALUNO --->");
                        System.out.println("ALUNO ENSINO SUPERIOR (s/n)?");
                        char tipoAluno = sc.next().charAt(0);
                        System.out.println("INFORME O NOME DO ALUNO");
                        sc.nextLine();// para consumir a quebra de linha do op
                        String nome = sc.nextLine();
                        System.out.println("INFORME A IDADE DO ALUNO");
                        int idade = sc.nextInt();
                        System.out.println("INFORME A MATRICULA DO ALUNO");
                        int matricula = sc.nextInt();


                        List<Double> notas = new ArrayList<>();
                        for(int i=0; i< 4; i++ ){
                            System.out.println("INFORME A "+ (i+1) +"ª NOTA DO ALUNO");
                            notas.add(sc.nextDouble());
                        }
                        String serie;

                        if( tipoAluno == 'n'){
                            System.out.println("INFORME A SERIE DO ALUNO");
                            sc.nextLine();// para consumir a quebra de linha da matricula do aluno
                            serie = sc.nextLine();

                            aluno = new AlunoMedio(nome.toUpperCase(), idade, matricula, serie, notas, "MEDIO");

                            listAlunos.add(aluno);

                        }

                        if(tipoAluno == 's'){
                            System.out.println("INFORME O PERIODO DO ALUNO");
                            sc.nextLine();// para consumir a quebra de linha da matricula do aluno
                            serie = sc.nextLine();

                            aluno = new AlunoSuperior(nome.toUpperCase(), idade, matricula, serie, notas, "SUPERIOR");

                            listAlunos.add(aluno);

                        }
                        break;
                    case 2:
                        System.out.println("<--- LISTAGEM DE ALUNOS --->");
                        int i = 0;
                        if(listAlunos.size() > 0){
                            for(Aluno al : listAlunos){
                                System.out.println("Nº "+(++i));
                                System.out.println("Tipo Aluno: "+al.getTipoAluno());
                                System.out.println("Nome: "+al.getNome());
                                System.out.println("Idade: "+al.getIdade());
                                System.out.println("Matricula: "+al.getMatricula());
                                System.out.println("Serie: "+al.getSerie());
                                System.out.println("Notas: "+al.getNotas());
                                al.calcularMedia();
                                System.out.println("Média: "+String.format("%.2f",al.getMedia()));
                                System.out.println("Situação aluno: "+al.Situacao());
                                System.out.println("--------------------------------");

                            }
                        }else{
                            System.out.println("Lista de alunos está vazia!!!");
                        }
                        break;
                    case 3:
                        System.out.println("<--- REMOVER ALUNO --->");
                        System.out.println("<--- LISTAGEM DE ALUNOS --->");
                        int a = 0;
                        for(Aluno al : listAlunos){
                            System.out.println("Nº "+(++a));
                            System.out.println("Tipo Aluno: "+al.getTipoAluno());
                            System.out.println("Nome: "+al.getNome());
                            System.out.println("Idade: "+al.getIdade());
                            System.out.println("Matricula: "+al.getMatricula());
                            System.out.println("Serie: "+al.getSerie());
                            System.out.println("Notas: "+al.getNotas());
                            al.calcularMedia();
                            System.out.println("Média: "+String.format("%.2f",al.getMedia()));
                            System.out.println("Situação aluno: "+al.Situacao());
                            System.out.println("--------------------------------");
                        }
                        System.out.println("INFORME O NOME DO ALUNO PARA EXCLUIR: ");
                        sc.nextLine();//para comsumir a quebra de linha deixada pela escolha da opção
                        String nomeRemover = sc.nextLine();

                        for(Aluno al : listAlunos){

                            if(al.getNome().equals(nomeRemover.toUpperCase())) {
                                System.out.println("<--- RESULTADO ENCONTRADO --->");
                                System.out.println("Nome: " + al.getNome());
                                listAlunos.remove(al);
                                System.out.println("<--- ALUNO REMOVIDO!!! --->");
                                break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("<--- PESQUISAR ALUNOS --->");
                        System.out.println("INFORME O NOME DO ALUNO PARA PESQUISA: ");
                        sc.nextLine();//para comsumir a quebra de linha deixada pela escolha da opção
                        String nomePesquisa = sc.nextLine();
                        System.out.println("nomePesquisa: "+nomePesquisa);
                            for(Aluno al : listAlunos){
                                if(al.getNome().equals(nomePesquisa.toUpperCase())){
                                    System.out.println("<--- RESULTADO ENCONTRADO --->");
                                    System.out.println("Tipo Aluno: "+al.getTipoAluno());
                                    System.out.println("Nome: "+al.getNome());
                                    System.out.println("Idade: "+al.getIdade());
                                    System.out.println("Matricula: "+al.getMatricula());
                                    System.out.println("Serie: "+al.getSerie());
                                    System.out.println("Notas: "+al.getNotas());
                                    al.calcularMedia();
                                    System.out.println("Média: "+String.format("%.2f",al.getMedia()));
                                    System.out.println("Situação aluno: "+al.Situacao());
                                    System.out.println("--------------------------------");
                                }
                            }
                        break;
                    case 5:
                        System.out.println("<--- EDITAR ALUNOS --->");
                        int c = 0;
                            for(Aluno al : listAlunos){
                                System.out.println("Nº "+(++c));
                                System.out.println("Tipo Aluno: "+al.getTipoAluno());
                                System.out.println("Nome: "+al.getNome());
                                System.out.println("Idade: "+al.getIdade());
                                System.out.println("Matricula: "+al.getMatricula());
                                System.out.println("Serie: "+al.getSerie());
                                System.out.println("Notas: "+al.getNotas());
                                al.calcularMedia();
                                System.out.println("Média: "+String.format("%.2f",al.getMedia()));
                                System.out.println("Situação aluno: "+al.Situacao());
                                System.out.println("--------------------------------");
                            }

                        System.out.println("INFORME A MATRICULA DO ALUNO");
                        int mat = sc.nextInt();
                        for(Aluno al : listAlunos){
                            int index = listAlunos.indexOf(al);
                          if(al.getMatricula() == mat){
                              System.out.println("<--- EDITANDO ALUNO --->");
                              System.out.println("ALUNO ENSINO SUPERIOR (s/n)?");
                              char tipoAlunoAltera = sc.next().charAt(0);
                              System.out.println("INFORME O NOME DO ALUNO");
                              sc.nextLine();// para consumir a quebra de linha do op
                              String nomeAltera = sc.nextLine();
                              System.out.println("INFORME A IDADE DO ALUNO");
                              int idadeAltera = sc.nextInt();

                              List<Double> notasAltera = new ArrayList<>();

                              for(int d=0; d< 4; d++ ){
                                  System.out.println("INFORME A "+ (d+1) +"ª NOTA DO ALUNO");
                                  notasAltera.add(sc.nextDouble());
                              }
                              String serieAltera;
                              if( tipoAlunoAltera == 'n'){
                                  System.out.println("INFORME A SERIE DO ALUNO");
                                  sc.nextLine();// para consumir a quebra de linha da matricula do aluno
                                  serieAltera = sc.nextLine();

                                  aluno = new AlunoMedio(nomeAltera.toUpperCase(), idadeAltera, al.getMatricula(), serieAltera, notasAltera, "MEDIO");

                                  listAlunos.set(index, aluno);

                              }

                              if(tipoAlunoAltera == 's'){
                                  System.out.println("INFORME O PERIODO DO ALUNO");
                                  sc.nextLine();// para consumir a quebra de linha da matricula do aluno
                                  serieAltera = sc.nextLine();

                                  aluno = new AlunoSuperior(nomeAltera.toUpperCase(), idadeAltera, al.getMatricula(), serieAltera, notasAltera, "SUPERIOR");

                                  listAlunos.set(index, aluno);

                              }
                              System.out.println("<--- ALUNO ATUALIZADO COM SUCESSO --->");
                          }
                        }

                        break;
                    default:
                        break;
                }
                if(op != 0){
                    System.out.println("DIGITE 1 P/ CONTINUAR OU 0 P/ SAIR");
                    op = sc.nextInt();
                }

            }while(op != 0);

        }
}
