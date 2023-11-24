package org.example;

import java.util.Observable;
public class Empresa extends Observable {
    private String nomeFuncionario;
    private String desempenho;

    public Empresa (String nomeFuncionario, String desempenho) {
        this.nomeFuncionario = nomeFuncionario;
        this.desempenho = desempenho;
    }
    public void relatarDesempenho() {
        setChanged();
        notifyObservers();
    }
    @Override
    public String toString() {
        return "Status { " + "Funcionario: " + nomeFuncionario + ", Status: " + this.desempenho + " }";
    }
}
