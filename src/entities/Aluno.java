package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{


    private int matricula;
    private String serie;
    private double media;
    private String tipoAluno;
    private List<Double> notas = new ArrayList<>();


    public Aluno(){
        super();
    }

    public Aluno(String nome, int idade, int matricula, String serie, List<Double> notas, String tipoAluno) {
        super(nome, idade);
        this.matricula = matricula;
        this.serie = serie;
        this.notas = notas;
        this.tipoAluno = tipoAluno;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getMedia() {
        return media;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public String getTipoAluno() {
        return tipoAluno;
    }

    public void setTipoAluno(String tipoAluno) {
        this.tipoAluno = tipoAluno;
    }

    public void calcularMedia(){
        double somatorio = 0.0;
        int total = notas.size();

        for(double n: notas){
            somatorio += n;
        }

        this.media = somatorio/total;
    }

    public String Situacao(){
        //para aluno medio a media e de 5 e para aluno superior a media é 7
        return "";
    }
}
