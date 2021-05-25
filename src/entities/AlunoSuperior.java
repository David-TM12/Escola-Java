package entities;

import java.util.List;

public final class AlunoSuperior extends Aluno{



    public AlunoSuperior(String nome, int idade, int matricula, String serie, List<Double> notas, String tipoAluno) {
        super(nome, idade, matricula, serie, notas, tipoAluno);

    }

    @Override
    public String Situacao(){
        if(this.getMedia() >= 7){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }
}
