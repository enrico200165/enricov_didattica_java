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

Cosa fa questa riga di codice?  

```java
Persona p = new Persona("Anna");
```

Suggerimento: La parola `new` crea un oggetto.  

A) Crea un oggetto Persona e la variabile `p` lo indica.  
B) Cancella un oggetto Persona.  
C) Non fa nulla: è solo un commento.  


### Domanda 2

Quale è il costruttore corretto della classe Cane?  

Suggerimento: Il costruttore ha lo stesso nome della classe e non ha `void` davanti.  

A) `public void Cane(String nome)`  (con void non è un costruttore)  
B) `public cucciolo(String nome)`  (il nome è diverso da quello della classe)  
C) `public Cane(String nome)`  (stesso nome della classe, senza void)  


### Domanda 3

Quanti oggetti Contatore ci sono dopo queste due righe?  

```java
Contatore a = new Contatore(3);
Contatore b = a;
```

Suggerimento: La parola `new` compare una sola volta.  

A) Due oggetti: uno per ogni variabile.  
B) Un solo oggetto: `a` e `b` sono due nomi dello stesso oggetto.  
C) Nessun oggetto.  


### Domanda 4

Quale riga confronta il contenuto di due stringhe `s` e `t`?  

Suggerimento: `==` confronta i riferimenti, `equals` confronta il contenuto.  

A) `s == t`  (confronta i riferimenti, cioè se sono lo stesso oggetto)  
B) `s = t`  (assegna `t` a `s`, non confronta)  
C) `s.equals(t)`  (confronta il contenuto delle stringhe)  


### Domanda 5

La classe Libro ha un metodo `toString()` che restituisce il titolo "Dune". Cosa stampa questa riga?  

```java
System.out.println(l);
```

Suggerimento: `println` chiama da solo il metodo `toString()`.  

A) Dune  
B) Libro  
C) Un errore  


### Domanda 6

Quale riga crea una copia dell'oggetto `a`?  

Suggerimento: In Java la copia non è automatica: per copiare si usa `new`.  

A) `Contatore b = a;`  (b è solo un altro nome per lo stesso oggetto)  
B) `Contatore b = copia(a);`  (il metodo `copia` non esiste)  
C) `Contatore b = new Contatore(a);`  (costruttore di copia: crea un nuovo oggetto uguale ad `a`)  


### Domanda 7

Cosa significa `extends` in questa riga?  

```java
class Cane extends Animale
```

Suggerimento: `extends` vuol dire "estende", cioè "eredita da".  

A) Cane eredita da Animale (Cane è un tipo di Animale).  
B) Animale eredita da Cane.  
C) Cane e Animale non hanno nessun rapporto.  


### Domanda 8

`Animale.verso()` stampa "..." e `Cane.verso()` stampa "Bau". Cosa stampa questo codice?  

```java
Animale a = new Cane();
a.verso();
```

Suggerimento: Conta l'oggetto creato con `new`, cioè Cane.  

A) ...  
B) Un errore  
C) Bau  


### Domanda 9

Animale è una classe `abstract`. Perché questa riga non compila?  

```java
Animale a = new Animale();
```

Suggerimento: Una classe `abstract` è incompleta: non si può creare con `new`.  

A) Manca un punto e virgola.  
B) Una classe `abstract` non si può istanziare con `new`.  
C) Il nome Animale è troppo corto.  


### Domanda 10

Cane estende Animale, che ha l'attributo `private String nome`. Può Cane usare `nome` direttamente?  

Suggerimento: `private` significa visibile solo dentro la classe che lo dichiara.  

A) Sì, sempre.  
B) Sì, ma solo con `new`.  
C) No: `private` è visibile solo in Animale; serve un metodo `public` come `getNome()`.  


### Domanda 11

Quale parola si usa quando una classe realizza un'interfaccia?  

```java
class Aquila ______ Volante
```

Suggerimento: `extends` si usa fra classi; per le interfacce si usa un'altra parola.  

A) `extends`  
B) `implements`  
C) `abstract`  


### Domanda 12

A cosa serve il blocco `catch`?  

```java
try {
    // istruzioni
} catch (Exception e) {
    // gestione dell'errore
}
```

Suggerimento: `try` prova ad eseguire il codice, `catch` gestisce l'errore.  

A) A creare una nuova classe.  
B) A gestire l'errore, se si verifica nel blocco `try`.  
C) A cancellare il programma.  


