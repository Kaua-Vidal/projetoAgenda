package dcx.ufpb.br.kaua.agenda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContatoTest {

    @Test
    public void testaConstrutor(){
        Contato c1 = new Contato("Kauã", 04, 05);

        assertEquals("Kauã", c1.getNome());
        assertEquals(5, c1.getMesAniversario());
        assertEquals(4, c1.getDiaAniversario());

    }
}
