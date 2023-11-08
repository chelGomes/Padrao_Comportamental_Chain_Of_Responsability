import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolicitarEmprestimoTest {
    FuncionarioPresidente presidente;
    FuncionarioDiretor diretor;
    FuncionarioGerente gerente;
    FuncionarioAtendente atendente;


    @BeforeEach
    void setUp() {
        presidente = new FuncionarioPresidente(null);
        diretor = new FuncionarioDiretor(presidente);
        gerente = new FuncionarioGerente(diretor);
        atendente = new FuncionarioAtendente(gerente);
    }

    @Test
    void deveRetornarAtendenteParaAssinaturaEmprestimoBoleto() {
        assertEquals("Atendente", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoBoleto.getTipoEmprestimoBoleto())));
    }

    @Test
    void deveRetornarGerenteParaAssinaturaEmprestimoConsignado() {
        assertEquals("Gerente", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoConsignado.getTipoEmprestimoConsignado())));
    }

    @Test
    void deveRetornarDiretorParaAssinaturaEmprestimoPessoal() {
        assertEquals("Diretor", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoPessoal.getTipoEmprestimoPessoal())));
    }

    @Test
    void deveRetornarPresidenteParaAssinaturaEmprestimoFinanciamento() {
        assertEquals("Presidente", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoFinanciamento.getTipoEmprestimoFinanciamento())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaBoleto() {
        assertEquals("Sem assinatura", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoBoleto.getTipoEmprestimoBoleto())));
    }

}
