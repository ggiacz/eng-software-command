package org.example;

public class Conta {

    private String titular;
    private int numero;
    private String situacao;

    public Conta(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void bloquear() {
        this.situacao = "Conta bloqueada";
    }

    public void desbloquear() {
        this.situacao = "Conta desbloqueada";
    }
}
