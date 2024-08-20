package dcx.ufpb.br.kaua.agenda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AgendaAyla implements Agenda{
    private Map<String, Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla(){
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    public void salvarDados(){

    }
    public void recuperarDados(){

    }
    public boolean cadastraContato(String nome, int dia, int mes){
        Contato novo = new Contato (nome, dia, mes);
        contatos.put(novo.getNome(), novo);
        if (contatos.containsValue(novo)){
            return true;
        }
        return false;

    }

    public Collection<Contato>  pesquisaAniversariantes (int dia, int mes){
        Collection<Contato> contatoBuscado = new ArrayList<>();
        for (Contato c : contatos.values()){
            if (c.getDiaAniversario() == dia && c.getMesAniversario() == mes){
                contatoBuscado.add(c);
            }
        }
        return contatoBuscado;
    }
    public boolean removeContato(String nome) throws ContatoInexistenteException{
        if (!contatos.containsKey(nome)){
            throw new ContatoInexistenteException("Contato não existe");
        } else {
            contatos.remove(nome);
            return true;
        }
    }
}
