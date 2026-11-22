**Verifica di Informatica nr.** ______  **Classe** ______  **Data** ______  **Aula** ______  

**Cognome e nome dello studente:** ______________________________________  

<div style="font-size:1.5em; font-weight:bold">

- Non è necessario rispondere a tutte le domande.  
- Su ogni foglio, in fondo a destra, vanno apposte le iniziali dello studente.  
- Normalmente non è consentito lasciare l'aula durante la verifica.  
- A meno che lo studente non disponga di autorizzazione scritta accettata dalla scuola, la semplice presenza di cellulari o tablet, anche spenti, comporta nota disciplinare.  

</div>

Per ogni domanda segnare con una crocetta una sola risposta. Il codice è Java.  

### Domanda 1

Quale affermazione è vera?  

```java
class Gatto extends Animale
```

Suggerimento: `extends` vuol dire "eredita da".  

A) Animale eredita da Gatto.  
B) `extends` serve a creare un nuovo oggetto.  
C) Gatto eredita i metodi di Animale.  


### Domanda 2

Quale riga stampa `true` se le stringhe `a` e `b` hanno lo stesso contenuto?  

Suggerimento: `equals` confronta il contenuto; `==` confronta i riferimenti.  

A) `System.out.println(a == b);`  (confronta i riferimenti)  
B) `System.out.println(a.equals(b));`  (confronta il contenuto)  
C) `System.out.println(a = b);`  (assegna, non confronta)  


### Domanda 3

Quale è il costruttore corretto della classe Auto?  

Suggerimento: Il costruttore ha lo stesso nome della classe e non ha `void` davanti.  

A) `public Auto(String marca)`  (stesso nome della classe, senza void)  
B) `public void Auto(String marca)`  (con void non è un costruttore)  
C) `public vai(String marca)`  (il nome è diverso da quello della classe)  


### Domanda 4

Quanti litri ha `a` dopo queste righe?  

```java
Serbatoio a = new Serbatoio(5);
Serbatoio b = a;
b.setLitri(9);
```

Suggerimento: `a` e `b` indicano lo stesso oggetto.  

A) 5  
B) 0  
C) 9  


### Domanda 5

Cosa fa questa riga di codice?  

```java
Libro l = new Libro("Dune");
```

Suggerimento: La parola `new` crea un oggetto.  

A) Cancella un oggetto Libro.  
B) Crea un oggetto Libro e la variabile `l` lo indica.  
C) Non fa nulla: è solo un commento.  


### Domanda 6

`Animale.verso()` stampa "..." e `Gatto.verso()` stampa "Miao". Cosa stampa questo codice?  

```java
Animale a = new Gatto();
a.verso();
```

Suggerimento: Conta l'oggetto creato con `new`, cioè Gatto.  

A) Miao  
B) ...  
C) Un errore  


### Domanda 7

La classe Gatto ha un metodo `toString()` che restituisce il nome "Tom". Cosa stampa questa riga?  

```java
System.out.println(g);
```

Suggerimento: `println` chiama da solo il metodo `toString()`.  

A) Tom  
B) Gatto  
C) Un errore  


### Domanda 8

Quale riga NON crea un nuovo oggetto?  

Suggerimento: Un nuovo oggetto si crea solo con `new`.  

A) `Auto b = new Auto("Fiat");`  (nuovo oggetto)  
B) `Auto b = new Auto(a);`  (costruttore di copia: nuovo oggetto)  
C) `Auto b = a;`  (b è solo un altro nome per lo stesso oggetto)  


### Domanda 9

Animale ha l'attributo `private String nome`. Il metodo `f` di Cane (che estende Animale) compila?  

```java
class Cane extends Animale {
    void f() { nome = "Rex"; }
}
```

Suggerimento: `private` non si vede nelle sottoclassi.  

A) No: `nome` è private in Animale.  
B) Sì, sempre.  
C) Sì, ma solo se `f` è `public`.  


### Domanda 10

Quale metodo `abstract` è scritto correttamente?  

Suggerimento: Un metodo `abstract` non ha corpo e finisce con `;`.  

A) `abstract void verso() = 0;`  (questa è sintassi del C++)  
B) `abstract void verso() { }`  (ha un corpo)  
C) `abstract void verso();`  (senza corpo, termina con `;`)  


### Domanda 11

Quale riga è corretta per una classe Pesce che realizza l'interfaccia Nuotatore?  

Suggerimento: `extends` si usa fra classi; per le interfacce si usa `implements`.  

A) `class Pesce implements Nuotatore`  (parola corretta per le interfacce)  
B) `class Pesce extends Nuotatore`  (extends è per le classi)  
C) `class Pesce interface Nuotatore`  (questa riga non è valida)  


### Domanda 12

Quando viene eseguito il blocco `finally`?  

```java
try {
    // istruzioni
} finally {
    // alla fine
}
```

Suggerimento: `finally` significa "alla fine", in ogni caso.  

A) Solo se c'è un errore.  
B) Sempre: sia se c'è un errore sia se non c'è.  
C) Mai.  


