package entities;

import java.util.List;

public class Professor extends Pessoa{

    private List<String> materias;
    private List<String> turmas;
    private int horas;
    private double valorPorHora;
    private double salario;

    public Professor(String nome, int idade, String rg, String cpf, String telefone, String endereco, List<String> materias, List<String> turmas, int horas, double valorPorHora) {
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

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void calculaSalario(){
        this.salario = horas * valorPorHora;
    }
}
