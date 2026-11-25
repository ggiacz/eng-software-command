package org.example;

public class DesbloquearContaComando implements Comando {

    private Conta conta;

    public DesbloquearContaComando(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.desbloquear();
    }

    public void cancelar() {
        this.conta.bloquear();
    }
}
