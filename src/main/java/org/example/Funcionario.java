package org.example;

import java.util.Observer;
import java.util.Observable;
public class Funcionario implements Observer {
    private String funcionario;
    private String resultado;

    public Funcionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getDesempenho() {
        return this.resultado;
    }

    public void adicionar(Empresa empresa) {
        empresa.addObserver(this);
    }
    public void update(Observable empresa, Object arg1) {
        this.resultado = this.funcionario + ", resultado de desempeno: " + empresa.toString();
    }
}
