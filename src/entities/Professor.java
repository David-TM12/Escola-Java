package entities;

import java.util.List;

public class Professor extends Pessoa{

    private List<String> materias;
    private List<String> turmas;
    private int horas;
    private Double valorPorHora;
    private double salario;

    public Professor(String nome, int idade, int rg, int cpf, String telefone, String endereco, List<String> materias, List<String> turmas, int horas, Double valorPorHora) {
        super(nome, idade, rg, cpf, telefone, endereco);
        this.materias = materias;
        this.turmas = turmas;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public List<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<String> turmas) {
        this.turmas = turmas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getSalario() {
        return salario;
    }

}
