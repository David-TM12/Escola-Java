package application;

import entities.Aluno;
import entities.Pessoa;
import entities.Professor;

import java.util.*;


public class Program {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            List<Aluno> listAlunos = new ArrayList<>();
            List<Professor> listProfessor = new ArrayList<>();

            Pessoa aluno;
            Pessoa professor;
            int op = 0;
            do {

                System.out.println("<---SEJA BEM VINDO AO SISTEMA ESCOLA--->");
                System.out.println("<---DIGITE O NUMERO DA OPCAO QUE DESEJA--->");
                System.out.println("0 - SAIR");
                System.out.println("1 - CADASTRO DE ALUNO");
                System.out.println("2 - LISTAR ALUNOS");
                System.out.println("3 - REMOVER ALUNO");
                System.out.println("4 - PESQUISAR ALUNOS");
                System.out.println("5 - CADASTRO DE PROFESSORES");
                System.out.println("6 - LISTAR PROFESSORES");
                System.out.println("7 - REMOVER PROFESSORES");
                System.out.println("8 - PESQUISAR PROFESSORES");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("<--- CADASTRO DE ALUNO --->");
                        System.out.println("INFORME O NOME DO ALUNO");
                        sc.nextLine();// para consumir a quebra de linha do op
                        String nome = sc.nextLine();
                        System.out.println("INFORME A IDADE DO ALUNO");
                        int idade = sc.nextInt();
                        System.out.println("INFORME A MATRICULA DO ALUNO");
                        int matricula = sc.nextInt();
                        System.out.println("INFORME A SERIE DO ALUNO");
                        sc.nextLine();// para consumir a quebra de linha da matricula do aluno
                        String serie = sc.nextLine();

                        List<Double> notas = new ArrayList<>();
                        for(int i=0; i< 4; i++ ){
                            System.out.println("INFORME A "+ (i+1) +"ª NOTA DO ALUNO");
                            notas.add(sc.nextDouble());
                        }
                        aluno = new Aluno(nome.toUpperCase(), idade, matricula, serie, notas);

                        if(aluno instanceof Pessoa){
                            listAlunos.add((Aluno)aluno);
                        }
                        break;
                    case 2:
                        System.out.println("<--- LISTAGEM DE ALUNOS --->");
                        int i = 0;
                        if(listAlunos.size() > 0){
                            for(Aluno al : listAlunos){
                                System.out.println("Nº "+(++i));
                                System.out.println("Nome: "+al.getNome());
                                System.out.println("Idade: "+al.getIdade());
                                System.out.println("Matricula: "+al.getMatricula());
                                System.out.println("Serie: "+al.getSerie());
                                System.out.println("Notas: "+al.getNotas());
                                al.calcularMedia();
                                System.out.println("Média: "+al.getMedia());
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
                            System.out.println("Nome: "+al.getNome());
                            System.out.println("Idade: "+al.getIdade());
                            System.out.println("Matricula: "+al.getMatricula());
                            System.out.println("Serie: "+al.getSerie());
                            System.out.println("Notas: "+al.getNotas());
                            al.calcularMedia();
                            System.out.println("Média: "+al.getMedia());
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
                                    System.out.println("Nome: "+al.getNome());
                                    System.out.println("Idade: "+al.getIdade());
                                    System.out.println("Matricula: "+al.getMatricula());
                                    System.out.println("Serie: "+al.getSerie());
                                    System.out.println("Notas: "+al.getNotas());
                                    al.calcularMedia();
                                    System.out.println("Média: "+al.getMedia());
                                    System.out.println("--------------------------------");
                                }
                            }
                        break;
                    case 5:
                        System.out.println("<--- CADASTRO DE PROFESSORES --->");
                        System.out.println("INFORME O NOME DO PROFESSOR: ");
                        sc.nextLine();// para consumir a quebra de linha do op
                        String nomeProfessor = sc.nextLine();
                        System.out.println("INFORME A IDADE DO PROFESSOR: ");
                        int idadeProfessor = sc.nextInt();
                        System.out.println("INFORME O RG DO PROFESSOR: ");
                        int rg = sc.nextInt();
                        System.out.println("INFORME O CPF DO PROFESSOR: ");
                        int cpf = sc.nextInt();
                        System.out.println("INFORME O TELEFONE DO PROFESSOR: ");
                        int telefone = sc.nextInt();
                        System.out.println("INFORME O ENDEREÇO DO PROFESSOR: ");
                        String endereco = sc.nextLine();

                        List<String> materias = new ArrayList<>();
                        int opMateria=0;
                        int b = 0;
                        System.out.println("1 - CADASTRAR MATERIA");
                        System.out.println("0 - CONTINUAR");
                        opMateria = sc.nextInt();
                        do{
                            if(opMateria == 1){
                                System.out.println("INFORME A "+(b+1)+" DO PROFESSOR: ");
                                materias.add(sc.nextLine());
                            }
                            System.out.println("1 - CONTINUAR CADASTRANDO OU 0 P/ AVANÇAR");
                            opMateria = sc.nextInt();
                        }while(opMateria != 0);

                        System.out.println("INFORME AS TURMAS QUE O PROFESSOR DA AULA: ");
                        String turmas = sc.nextLine();

                        System.out.println("INFORME AS HORAS DE TRABALHO DO PROFESSOR: ");
                        int horastrabalhadas = sc.nextInt();

                        System.out.println("INFORME QUANTO O PROFESSOR GANHA POR HORA: ");
                        double valorPorHora = sc.nextDouble();

                        List<Double> notas = new ArrayList<>();
                        for(int i=0; i< 4; i++ ){
                            System.out.println("INFORME A "+ (i+1) +"ª NOTA DO ALUNO");
                            notas.add(sc.nextDouble());
                        }

                        professor = new Professor();
                        if(professor instanceof Pessoa){
                            listAlunos.add(professor);
                        }
                        break;
                    case 6:
                        System.out.println("<--- LISTAGEM DE ALUNOS --->");
                        int i = 0;
                        if(listAlunos.size() > 0){
                            for(Aluno al : listAlunos){
                                System.out.println("Nº "+(++i));
                                System.out.println("Nome: "+al.getNome());
                                System.out.println("Idade: "+al.getIdade());
                                System.out.println("Matricula: "+al.getMatricula());
                                System.out.println("Serie: "+al.getSerie());
                                System.out.println("Notas: "+al.getNotas());
                                al.calcularMedia();
                                System.out.println("Média: "+al.getMedia());
                                System.out.println("--------------------------------");
                            }
                        }else{
                            System.out.println("Lista de alunos está vazia!!!");
                        }
                        break;
                    case 7:
                        System.out.println("<--- REMOVER ALUNO --->");
                        System.out.println("<--- LISTAGEM DE ALUNOS --->");
                        int a = 0;
                        for(Aluno al : listAlunos){
                            System.out.println("Nº "+(++a));
                            System.out.println("Nome: "+al.getNome());
                            System.out.println("Idade: "+al.getIdade());
                            System.out.println("Matricula: "+al.getMatricula());
                            System.out.println("Serie: "+al.getSerie());
                            System.out.println("Notas: "+al.getNotas());
                            al.calcularMedia();
                            System.out.println("Média: "+al.getMedia());
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
                    case 8:
                        System.out.println("<--- PESQUISAR ALUNOS --->");
                        System.out.println("INFORME O NOME DO ALUNO PARA PESQUISA: ");
                        sc.nextLine();//para comsumir a quebra de linha deixada pela escolha da opção
                        String nomePesquisa = sc.nextLine();
                        System.out.println("nomePesquisa: "+nomePesquisa);
                        for(Aluno al : listAlunos){
                            if(al.getNome().equals(nomePesquisa.toUpperCase())){
                                System.out.println("<--- RESULTADO ENCONTRADO --->");
                                System.out.println("Nome: "+al.getNome());
                                System.out.println("Idade: "+al.getIdade());
                                System.out.println("Matricula: "+al.getMatricula());
                                System.out.println("Serie: "+al.getSerie());
                                System.out.println("Notas: "+al.getNotas());
                                al.calcularMedia();
                                System.out.println("Média: "+al.getMedia());
                                System.out.println("--------------------------------");
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
