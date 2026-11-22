## Soluzioni e criteri di correzione, verifica standard, variante D

Modelli di domanda per posizione (numero = modello, uguale in tutte le varianti): 1:6, 2:11, 3:8, 4:14, 5:7, 6:3, 7:13, 8:9, 9:2, 10:4, 11:1, 12:10, 13:5, 14:12, 15:15, 16:16, 17:18, 18:17.  

### Domanda 1

`n.7 Adan.7 Ada`. `toString()` è invocata automaticamente due volte e, per polimorfismo, è la versione di Matricola.  

### Domanda 2

C. `pagine` è private in Libro: `this.pagine` non è accessibile da Romanzo (non è ereditato in modo accessibile). Modifiche accettabili: `Libro(int pagine)` con `super(300)`, `protected int pagine`, un setter non private.  

### Domanda 3

Compila e stampa `[Dune][Focus]`. Una classe abstract può avere metodi concreti che usano metodi abstract (polimorfismo); l'array di tipo astratto è lecito.  

### Domanda 4

C. `@Overwrite` non esiste. Modifica attesa: `@Override` oppure eliminare l'annotazione.  

### Domanda 5

C. `delete` non esiste in Java. Modifica attesa: eliminare l'istruzione `delete a;`.  

### Domanda 6

`true false false`. Due copie esplicite (new) sono oggetti distinti dall'originale e fra loro, ma con lo stesso contenuto.  

### Domanda 7

No. `ContoRisparmio` non estende `Conto`: `super(100)` cerca un costruttore di `Object` con un int. Correzione: `class ContoRisparmio extends Conto`.  

### Domanda 8

Ricetta(Ricetta r) {
    this.titolo = r.titolo;
    this.quantita = new double[r.quantita.length];
    for (int i = 0; i < quantita.length; i++) quantita[i] = r.quantita[i];
}
Errore tipico: `this.quantita = r.quantita;` (aliasing).  

### Domanda 9

Errore durante l'esecuzione, nulla viene stampato: per i = 3 l'indice è scorretto. Distrattore: risposta 3.  

### Domanda 10

`false true`. `o1.equals(c2)`: tipo statico Object, quindi `Object.equals` (riferimenti diversi, false). `c1.equals(c2)`: overload `equals(Cerchio)` (true).  

### Domanda 11

A. Manca `new`: in Java un costruttore si invoca solo con `new` (in C++ la sintassi senza new è lecita). Modifica attesa: `new Cane(...)`.  

### Domanda 12

`2 2 4`. `a` e `b` sono alias dello stesso oggetto; `c` è una copia; `raddoppia` modifica l'oggetto di `c`.  

### Domanda 13

B. Una classe abstract non si può istanziare. Modifica attesa: `new Quadrato()` al posto di `new Forma()`.  

### Domanda 14

`ABA`. `f(B)` in B è un overload, non un override di `f(A)`. `a.f(b)`: tipo statico A, esiste solo `f(A)`. `b.f(b)`: sceglie `f(B)` (più specifico). `b.f(a)`: argomento di tipo A, quindi `f(A)`.  

### Domanda 15

A. Una classe abstract è comunque una classe: serve `extends`, non `implements`. Modifica attesa: `extends Persona`.  

### Domanda 16

Non compila: `vola(int)` ha una firma diversa da `vola()`, quindi Aquila non realizza il metodo dell'interfaccia.  

### Domanda 17

Compila e stampa `C`: l'eccezione di indice non è aritmetica, quindi è catturata dal secondo catch.  

### Domanda 18

`TEF-1`. T stampata prima della divisione, poi catch (E), poi finally (F), infine println stampa -1.  

