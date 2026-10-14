package it.scuola.persone;

public class Studente extends Persona {

    private String classe;
    private double media;

    public Studente(String nome, int eta, String classe, double media) {
        super(nome, eta);
        this.classe = classe;
        this.media = media;
    }

    @Override
    public String descrivi() {
        return super.descrivi() + ", classe: " + classe + ", media: " + media;
    }
    
    boolean promosso() {
        return media >= 6;
    }

}
