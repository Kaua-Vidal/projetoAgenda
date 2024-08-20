package dcx.ufpb.br.kaua.agenda;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaAylaTest {

    @Test
    public void testaCadastroPesquisaRemocao(){
        AgendaAyla agenda = new AgendaAyla();
        Collection<Contato> contatosAchados = agenda.pesquisaAniversariantes(20, 8);
        assertTrue(contatosAchados.size()==0);
        agenda.cadastraContato("Romildo", 31, 1);
        agenda.cadastraContato("Andersom", 17, 11);
        contatosAchados = agenda.pesquisaAniversariantes(31, 1);
        assertEquals (1, contatosAchados.size());
        Contato romildo = new Contato("Romildo", 31, 1);
        assertTrue(contatosAchados.contains(romildo));
        Contato andersom = new Contato("Andersom", 17, 11);
        contatosAchados = agenda.pesquisaAniversariantes(17, 11);
        assertTrue(contatosAchados.contains(andersom));
        try {
            boolean removeu = agenda.removeContato("Romildo");
            assertTrue(removeu);
        } catch (ContatoInexistenteException e){
            fail("Lançou exceção quando não deveria");
        }

    }
}
