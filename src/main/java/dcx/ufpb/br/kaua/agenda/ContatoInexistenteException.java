package dcx.ufpb.br.kaua.agenda;

public class ContatoInexistenteException extends Exception{
    public ContatoInexistenteException (String msg){
        super(msg);
    }

    public ContatoInexistenteException(){
        super("Contato inexistente");
    }
}
