package dcx.ufpb.br.kaua.agenda;

import java.util.Collection;
import java.util.Map;

public class AgendaAyla implements Agenda{
    private Map<String, Contato> contatos;

    public AgendaAyla(){

    }

    public void salvarDados(){

    }
    public void recuperarDados(){

    }
    public boolean cadastraContato(String nome, int dia, int mes){
        return false;
    }

    public Collection<Contato>  pesquisaAniversario (int dia, int mes){

    }
    public boolean removeContato(String nome){
        return false;
    }
}
