import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TerminalBancarioTest {

    TerminalBancario terminalBancario;
    Conta conta;

    @BeforeEach
    void setUp() {
        terminalBancario = new TerminalBancario();
        conta = new Conta("Maria", 12345);
    }

    @Test
    void deveBloquearConta() {
        Comando bloquearConta = new BloquearContaComando(conta);
        terminalBancario.executarComando(bloquearConta);

        assertEquals("Conta bloqueada", conta.getSituacao());
    }

    @Test
    void deveDesbloquearConta() {
        Comando desbloquearConta = new DesbloquearContaComando(conta);
        terminalBancario.executarComando(desbloquearConta);

        assertEquals("Conta desbloqueada", conta.getSituacao());
    }

    @Test
    void deveCancelarDesbloqueioConta() {
        Comando bloquearConta = new BloquearContaComando(conta);
        Comando desbloquearConta = new DesbloquearContaComando(conta);

        terminalBancario.executarComando(bloquearConta);
        terminalBancario.executarComando(desbloquearConta);

        terminalBancario.cancelarUltimoComando();

        assertEquals("Conta bloqueada", conta.getSituacao());
    }

}
