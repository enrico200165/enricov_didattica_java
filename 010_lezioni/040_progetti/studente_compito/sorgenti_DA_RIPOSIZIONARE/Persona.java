package it.scuola.persone;

public class Persona {

    protected String nome;
    protected int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String descrivi() {
        return "Nome: " + nome + ", età: " + eta;
    }
}
