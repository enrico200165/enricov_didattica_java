## Soluzioni e criteri di correzione, verifica standard, variante B

Modelli di domanda per posizione (numero = modello, uguale in tutte le varianti): 1:10, 2:8, 3:2, 4:5, 5:14, 6:1, 7:9, 8:4, 9:12, 10:3, 11:6, 12:13, 13:7, 14:11, 15:16, 16:15, 17:18, 18:17.  

### Domanda 1

`5 15 15`. `b` è una copia di `a`; `c` è un alias di `b`; `riempi` modifica l'oggetto indicato da `c` (e quindi da `b`), non una copia.  

### Domanda 2

Compila e stampa `10`. L'array di tipo astratto è lecito: contiene riferimenti a sottoclassi concrete.  

### Domanda 3

Errore durante l'esecuzione, nulla viene stampato: per i = 3 l'indice è scorretto. Distrattore: risposta 9.  

### Domanda 4

A. Un metodo abstract non può avere corpo. Modifica attesa: sostituire il corpo con `;`, oppure togliere `abstract` dal metodo.  

### Domanda 5

B. `@override` (minuscolo) non esiste: Java distingue maiuscole e minuscole. Modifica attesa: `@Override` oppure eliminare l'annotazione.  

### Domanda 6

B. Manca `new`: in Java un costruttore si invoca solo con `new` (in C++ la sintassi senza new è lecita). Modifica attesa: `new Libro(...)`.  

### Domanda 7

Playlist(Playlist p) {
    this.nome = p.nome;
    this.brani = new String[p.brani.length];
    for (int i = 0; i < brani.length; i++) brani[i] = p.brani[i];
}
Accettabile anche `p.brani.clone()`. Errore tipico: `this.brani = p.brani;` (aliasing). Gli elementi String si possono condividere.  

### Domanda 8

`false true`. `d2.equals(o)` usa `Object.equals` (tipo statico Object): d2 e d1 sono oggetti distinti. `d2.equals(d1)` usa l'overload `equals(Data)`.  

### Domanda 9

`1 2 1`. Attributo nascosto e metodo static: tipo statico (Base); metodo di istanza: polimorfo (Der). Distrattore: `2 2 2`.  

### Domanda 10

`true false true`. `b` è una copia di `a` (stesso contenuto, oggetto diverso); `c` è un alias di `b`.  

### Domanda 11

`Saldo: Conto 50.0 risparmio`. `toString()` automatica nella concatenazione; il valore double 50 è mostrato come 50.0.  

### Domanda 12

No. `Quadrato` non estende `Figura`: `super(2.0)` cerca un costruttore di `Object` con un double. Correzione: `class Quadrato extends Figura`.  

### Domanda 13

A. `delete[]` non esiste in Java (la memoria è gestita dal garbage collector). Modifica attesa: eliminare l'istruzione.  

### Domanda 14

B. `saldo` è private in Conto, non accessibile da ContoCorrente; il costruttore di Conto non lo inizializza. Modifiche accettabili: `Conto(double saldo)` con `super(100)`, `protected double saldo`, un setter non private.  

### Domanda 15

Non compila: il metodo ereditato `nuota()` di Pesce non è public, mentre i metodi di un'interfaccia sono public (accesso più debole non ammesso).  

### Domanda 16

A. Una classe non può estendere un'interfaccia con `extends`. Modifica attesa: `implements Stampabile`.  

### Domanda 17

Compila e stampa `B`: ordine corretto (sottoclasse prima); l'eccezione aritmetica è catturata dal primo catch.  

### Domanda 18

`EF0`. Indice scorretto: catch stampa E e prepara 0; finally stampa F; println stampa 0.  

