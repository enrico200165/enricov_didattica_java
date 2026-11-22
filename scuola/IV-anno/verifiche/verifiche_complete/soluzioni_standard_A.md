## Soluzioni e criteri di correzione, verifica standard, variante A

Modelli di domanda per posizione (numero = modello, uguale in tutte le varianti): 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:10, 11:11, 12:12, 13:13, 14:14, 15:15, 16:16, 17:17, 18:18.  

### Domanda 1

A. Manca `new`: in Java un costruttore si invoca solo con `new` (in C++ la sintassi senza new è lecita). Modifica attesa: `new Persona(...)`.  

### Domanda 2

Errore durante l'esecuzione, nulla viene stampato. Il parametro n è ridondante in Java (esiste `v.length`) ed è incoerente con l'array: per i = 3 l'indice è scorretto. Distrattori: risposta 6; valore imprevedibile (idea C++). Non servono conoscenze sulle eccezioni.  

### Domanda 3

`false true true`. `new String(s)` è il costruttore di copia di String: crea un nuovo oggetto (`s == t` false) con lo stesso contenuto (`equals` true); `u` è solo un alias di `s` (true).  

### Domanda 4

`true false`. `equals(Punto)` è un overload, non un override di `equals(Object)`. Con argomento di tipo statico Punto si usa l'overload (true); con tipo statico Object si usa `Object.equals`, che confronta i riferimenti (false).  

### Domanda 5

C. Un metodo abstract non può avere corpo. Modifica attesa: sostituire il corpo con `;` (non `= 0`, che è sintassi C++), oppure togliere `abstract` dal metodo.  

### Domanda 6

`Letto: Libro Dune!`. Nella concatenazione `toString()` è invocata automaticamente, e con polimorfismo si usa la versione di Romanzo, che richiama quella di Libro con `super`.  

### Domanda 7

B. In Java non esistono `delete` né i distruttori. Modifica attesa: eliminare l'istruzione `delete p;`.  

### Domanda 8

Compila e stampa `10.0`. `new Forma[2]` crea un array di riferimenti (legittimo anche per tipi astratti), non istanzia Forma; ogni elemento punta a una sottoclasse concreta. Distrattore: errore di compilazione per `new` su classe abstract.  

### Domanda 9

Studente(Studente s) {
    this.nome = s.nome;
    this.voti = new int[s.voti.length];
    for (int i = 0; i < voti.length; i++) voti[i] = s.voti[i];
}
Accettabile anche `this.voti = s.voti.clone();`. Errore tipico: `this.voti = s.voti;` (copia superficiale, aliasing). Altri errori: tipo di ritorno `void` davanti al costruttore, uso di `new Studente(...)` dentro il costruttore.  

### Domanda 10

`2 2 1`. `b` è un alias di `a`; `c` è una copia esplicita (il costruttore di copia si invoca solo con `new`). Il passaggio del parametro non invoca mai il costruttore di copia (confounder C++): `incrementa` modifica l'oggetto originale.  

### Domanda 11

A. Il costruttore di Auto assegna un attributo private della superclasse, non accessibile; il costruttore di Veicolo non lo inizializza (resterebbe 0). Modifiche accettabili: costruttore `Veicolo(int ruote)` con `super(4)` in Auto (soluzione preferibile), oppure `protected int ruote`, oppure un metodo setter public/protected in Veicolo.  

### Domanda 12

`ABtipoA`. Gli attributi (nascosti) e i metodi static si risolvono sul tipo statico (A); i metodi di istanza sono polimorfi (B). Distrattore C++: `BBtipoB` per chi assume tutto virtual.  

### Domanda 13

No. `Auto` non estende `Veicolo` (nessuna ereditarietà, nonostante i nomi): `super(4)` invoca un costruttore di `Object` con un int, che non esiste. Correzione: `class Auto extends Veicolo`.  

### Domanda 14

B. `@Overload` non esiste. Modifica attesa: `@Override` oppure eliminare l'annotazione.  

### Domanda 15

C. `implements` tra due classi è un errore di compilazione. Modifica attesa: `extends` al posto di `implements`.  

### Domanda 16

Compila e stampa `batte le ali`: il metodo public ereditato da Uccello soddisfa il contratto dell'interfaccia.  

### Domanda 17

`EF-1`. Il catch stampa E e prepara -1; il finally stampa F prima del ritorno; infine println stampa -1.  

### Domanda 18

Non compila: un catch di una sottoclasse dopo il catch della superclasse è irraggiungibile.  

