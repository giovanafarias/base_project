package br.edu.ifpr.pgua.eic.tads.models;
import br.edu.ifpr.pgua.eic.tads.Main;
import freemarker.core.ReturnInstruction.Return;

public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato (String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void adicionarContato (Contato contato) {
        Main.databaseContato.add(contato);
    }

    public String toString () {
        return "Nome: " + this.nome
        + "\nEmail: " + this.email
        + "\nTelefone: " + this.telefone;
    }

}
