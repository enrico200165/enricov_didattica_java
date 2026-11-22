## Soluzioni e criteri di correzione, verifica standard, variante C

Modelli di domanda per posizione (numero = modello, uguale in tutte le varianti): 1:9, 2:5, 3:7, 4:13, 5:6, 6:10, 7:3, 8:12, 9:8, 10:11, 11:4, 12:2, 13:14, 14:1, 15:16, 16:15, 17:17, 18:18.  

### Domanda 1

Squadra(Squadra s) {
    this.nome = s.nome;
    this.punti = new int[s.punti.length];
    for (int i = 0; i < punti.length; i++) punti[i] = s.punti[i];
}
Errore tipico: `this.punti = s.punti;` (copia superficiale).  

### Domanda 2

C. Una classe con un metodo abstract deve essere dichiarata abstract. Modifica attesa: `abstract class Figura`, oppure dare un corpo al metodo togliendo `abstract`.  

### Domanda 3

C. In Java non esistono i distruttori `~Persona()`. Modifica attesa: eliminare il metodo.  

### Domanda 4

No. `Gatto` non estende `Animale`: `super("Tom")` non trova un costruttore di `Object` con una String. Correzione: `class Gatto extends Animale`.  

### Domanda 5

`Animale Rex!`. Cane non ridefinisce `toString()`: si usa quella ereditata, invocata automaticamente dalla concatenazione.  

### Domanda 6

`3 8`. In `azzera` l'assegnazione a `x` cambia solo il riferimento locale: `a` non viene modificato. `b` è una copia indipendente.  

### Domanda 7

`false true false`. `new` crea un oggetto distinto; `z` è un alias di `x`.  

### Domanda 8

`generico Bau cane`. `a.tipo` usa il tipo statico Animale; `verso()` è polimorfo; con il cast a Cane si legge l'attributo di Cane.  

### Domanda 9

Compila e stampa `21.0` (12.0 + 9.0). Array di tipo astratto con inizializzatore: lecito; i valori int sono convertiti in double.  

### Domanda 10

B. Compila: Cane non accede direttamente all'attributo private, ma usa il metodo public `setNome` ereditato (che può accedervi).  

### Domanda 11

`false false`. In entrambe le chiamate l'argomento ha tipo statico Object (`o.equals(p1)`: il metodo cercato è `equals(Object)`), quindi vale `Object.equals`, che confronta i riferimenti; `equals(Punto)` non è un override.  

### Domanda 12

Stampa `6`: il parametro n è minore della dimensione dell'array, il quarto elemento non viene sommato. Distrattore: 10.  

### Domanda 13

A. `@Overrides` non esiste. Modifica attesa: `@Override` oppure eliminare l'annotazione.  

### Domanda 14

C. Manca `new`: in Java un costruttore si invoca solo con `new` (in C++ la sintassi senza new è lecita). Modifica attesa: `new Auto(...)`.  

### Domanda 15

Compila e stampa `corre veloce`: il metodo public ereditato soddisfa l'interfaccia.  

### Domanda 16

B. `implements` tra due classi è un errore. Modifica attesa: `extends Forma`.  

### Domanda 17

`F4`. Nessuna eccezione: il catch non viene eseguito; il finally viene comunque eseguito (F) prima che println stampi 4.  

### Domanda 18

Non compila: il secondo catch è irraggiungibile (Exception precede ArithmeticException).  

