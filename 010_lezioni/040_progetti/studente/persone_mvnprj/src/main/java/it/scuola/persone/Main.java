package it.scuola.persone;

public class Main {

    public static void main(String[] args) {
        Persona[] persone = {
            new Persona("Mario", 45),
            new Studente("Anna", 16, "3B", 7.5),
            new Studente("Luca", 17, "4A", 5.2)
        };

        for (Persona p : persone) {
            System.out.println(p.descrivi());
            if (p instanceof Studente) {
                Studente s = (Studente) p; // Cast esplicito
                System.out.println("Promosso: " + s.promosso());
            }
        }
    }
}
