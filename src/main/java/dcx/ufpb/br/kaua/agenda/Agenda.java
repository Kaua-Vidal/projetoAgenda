package dcx.ufpb.br.kaua.agenda;

import java.util.Collection;

public interface Agenda {

    public void salvarDados();
    public void recuperarDados();
    public boolean cadastraContato(String nome, int dia, int mes);public Collection<Contato> pesquisaAniversario (int dia, int mes);
    public boolean removeContato(String nome);

}
