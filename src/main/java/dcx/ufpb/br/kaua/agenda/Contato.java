package dcx.ufpb.br.kaua.agenda;

import java.util.Objects;

public class Contato {

    private String nome;
    private int diaAniversario;
    private int mesAniversario;

    public Contato(String nome, int diaAniversario, int mesAniversario) {
        this.nome = nome;
        this.diaAniversario = diaAniversario;
        this.mesAniversario = mesAniversario;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contato contato = (Contato) o;

        if (diaAniversario != contato.diaAniversario) return false;
        if (mesAniversario != contato.mesAniversario) return false;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + diaAniversario;
        result = 31 * result + mesAniversario;
        return result;
    }

    @Override
    public String toString() {
        return "Contato de nome" + nome + "\n" +
                "com aniversário: " + diaAniversario + "\n" +
                "de mês: " + mesAniversario;
    }
}


