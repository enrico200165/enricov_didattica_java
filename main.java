
class Persona {

    void lavora() {
        System.out.println("La persona sta lavorando.");
    }
}

class Studente extends Persona {

    @Override 
    void lavora() {
        System.out.println("Lo studente sta studiando.");
    }
}

public class main {

    public static void main(String[] args) {

        Studente mario = new Studente();
        Persona carlo = new Persona();
        
        Persona persona1 = mario; // persona1 ora "riferisce" l'oggetto Studente riferito da mario

        persona1.lavora();
    }

}
