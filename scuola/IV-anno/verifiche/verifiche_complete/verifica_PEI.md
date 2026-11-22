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

Cosa fa la parola `new`?  

```java
Cane c = new Cane();
```

Suggerimento: `new` in inglese significa "nuovo".  

A) Crea un nuovo oggetto.  
B) Cancella un oggetto.  
C) Stampa un messaggio.  


### Domanda 2

Il costruttore ha lo stesso nome della classe. Quale è il costruttore della classe Auto?  

Suggerimento: Cerca la riga con il nome `Auto`.  

A) `public vai()`  
B) `public Auto()`  (ha il nome della classe)  
C) `public stampa()`  


### Domanda 3

Quanti oggetti ci sono dopo queste due righe?  

```java
Contatore a = new Contatore(3);
Contatore b = a;
```

Suggerimento: La parola `new` compare una sola volta.  

A) Uno solo: `a` e `b` sono due nomi dello stesso oggetto.  
B) Due.  
C) Nessuno.  


### Domanda 4

Quale riga confronta il contenuto di due stringhe `s` e `t`?  

Suggerimento: `equals` in inglese significa "è uguale a".  

A) `s = t`  (assegna, non confronta)  
B) `s == t`  (confronta se sono lo stesso oggetto)  
C) `s.equals(t)`  (confronta il contenuto)  


### Domanda 5

Il metodo `toString()` della classe Libro restituisce "Dune". Cosa stampa questa riga?  

```java
System.out.println(l);
```

Suggerimento: `println` chiama da solo `toString()`.  

A) toString  
B) Dune  
C) Niente  


### Domanda 6

Quale riga crea una copia dell'oggetto `a`?  

Suggerimento: Per copiare si usa `new` con `a` fra parentesi.  

A) `Contatore b = new Contatore(a);`  (crea una copia)  
B) `Contatore b = a;`  (b è un altro nome per lo stesso oggetto)  
C) `Contatore b = 0;`  (non è una copia)  


### Domanda 7

Cosa significa `extends` in questa riga?  

```java
class Cane extends Animale
```

Suggerimento: `extends` vuol dire "eredita da".  

A) Animale è un tipo di Cane.  
B) Cane è un tipo di Animale: eredita i suoi metodi.  
C) Cane e Animale sono la stessa cosa.  


### Domanda 8

`Cane.verso()` stampa "Bau". Cosa stampa questo codice?  

```java
Animale a = new Cane();
a.verso();
```

Suggerimento: L'oggetto creato con `new` è un Cane.  

A) Niente  
B) Bau  
C) Un errore  


### Domanda 9

Un attributo `private` si può usare direttamente fuori dalla sua classe?  

Suggerimento: `private` in inglese significa "privato".  

A) Sì, sempre.  
B) Sì, ma solo con `new`.  
C) No: si può usare solo dentro la sua classe.  


### Domanda 10

Si può creare un oggetto di una classe `abstract` con `new`?  

Suggerimento: Una classe `abstract` è incompleta.  

A) No: una classe abstract è incompleta.  
B) Sì, sempre.  
C) Sì, ma solo se ha un costruttore.  


### Domanda 11

Quale parola si usa quando una classe realizza un'interfaccia?  

```java
class Aquila ______ Volante
```

Suggerimento: È la parola che inizia con la lettera i.  

A) `extends`  
B) `abstract`  
C) `implements`  


### Domanda 12

A cosa servono `try` e `catch`?  

```java
try {
    // istruzioni
} catch (Exception e) {
    // gestione dell'errore
}
```

Suggerimento: `try` in inglese significa "prova".  

A) A gestire un errore senza fermare il programma.  
B) A stampare dei numeri.  
C) A creare delle classi.  


