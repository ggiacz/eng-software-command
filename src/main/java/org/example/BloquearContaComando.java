package org.example;

public class BloquearContaComando implements Comando {

    private Conta conta;

    public BloquearContaComando(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.bloquear();
    }

    public void cancelar() {
        this.conta.desbloquear();
    }
}
