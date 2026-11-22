**Verifica di Informatica nr.** ______  **Classe** ______  **Data** ______  **Aula** ______  

**Cognome e nome dello studente:** ______________________________________  

<div style="font-size:1.5em; font-weight:bold">

- Non è necessario rispondere a tutte le domande.  
- Su ogni foglio, in fondo a destra, vanno apposte le iniziali dello studente.  
- Normalmente non è consentito lasciare l'aula durante la verifica.  
- A meno che lo studente non disponga di autorizzazione scritta accettata dalla scuola, la semplice presenza di cellulari o tablet, anche spenti, comporta nota disciplinare.  

</div>

Domande a scelta e domande che chiedono un output: la risposta va spiegata nelle due righe previste. Lo scopo delle spiegazioni è dimostrare che la risposta non è stata scelta a caso: una risposta senza spiegazione vale zero punti.  

Domande aperte e di scrittura del codice: rispondere nello spazio indicato. Il codice è Java; le importazioni necessarie si considerano presenti.  

### Domanda 1

Data la classe `Persona`, il seguente frammento compila?  

```java
class Persona {
    private String nome, cognome;
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
}
// nel main:
Persona p = Persona("Mario", "Bianchi");
```

A) Compila con la seguente modifica: ______________________________  
B) Compila così com'è.  
C) Non compila in nessun caso.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 2

Cosa accade eseguendo l'istruzione `System.out.println(somma(a, 4));`?  

```java
static int somma(int[] v, int n) {
    int s = 0;
    for (int i = 0; i < n; i++) s += v[i];
    return s;
}
// nel main:
int[] a = {1, 2, 3};
System.out.println(somma(a, 4));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 3

Cosa stampa il seguente frammento?  

```java
String s = "ciao";
String t = new String(s);
String u = s;
System.out.println((s == t) + " " + (s == u) + " " + s.equals(t));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 4

Cosa stampa il seguente frammento?  

```java
class Punto {
    int x, y;
    Punto(int x, int y) { this.x = x; this.y = y; }
    public boolean equals(Punto p) { return x == p.x && y == p.y; }
}
// nel main:
Punto p1 = new Punto(1, 2);
Punto p2 = new Punto(1, 2);
Object o = p2;
System.out.println(p1.equals(p2) + " " + p1.equals(o));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 5

Il seguente codice compila?  

```java
abstract class Animale {
    abstract void verso() { System.out.println("..."); }
}
```

A) Compila così com'è.  
B) Non compila in nessun caso.  
C) Compila con la seguente modifica: ______________________________  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 6

Cosa stampa il seguente frammento?  

```java
class Libro {
    private String titolo;
    public Libro(String t) { titolo = t; }
    public String toString() { return "Libro " + titolo; }
}
class Romanzo extends Libro {
    public Romanzo(String t) { super(t); }
    public String toString() { return super.toString() + "!"; }
}
// nel main:
Libro l = new Romanzo("Dune");
System.out.println("Letto: " + l);
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 7

Data la classe `Persona`, il seguente frammento compila?  

```java
class Persona {
    private String nome;
    public Persona(String nome) { this.nome = nome; }
    public void saluta() { System.out.println("Ciao " + nome); }
}
// nel main:
Persona p = new Persona("Anna");
p.saluta();
delete p;
```

A) Non compila in nessun caso.  
B) Compila con la seguente modifica: ______________________________  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 8

Cosa accade compilando ed eseguendo il programma?  

```java
abstract class Forma {
    abstract double area();
}
class Quadrato extends Forma {
    double l = 2;
    double area() { return l * l; }
}
class Rettangolo extends Forma {
    double b = 2, h = 3;
    double area() { return b * h; }
}
public class Prova {
    public static void main(String[] args) {
        Forma[] v = new Forma[2];
        v[0] = new Quadrato();
        v[1] = new Rettangolo();
        double somma = 0;
        for (int i = 0; i < v.length; i++) somma += v[i].area();
        System.out.println(somma);
    }
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 9

Scrivere nella classe `Studente` il costruttore di copia, in modo che modificare i voti di una copia non modifichi i voti dell'originale.  

```java
class Studente {
    private String nome;
    private int[] voti;
    Studente(String nome, int[] voti) { this.nome = nome; this.voti = voti; }
    // scrivere qui il costruttore di copia
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 10

Cosa stampa il seguente frammento? La classe `Contatore` ha i costruttori `Contatore(int v)` e `Contatore(Contatore o)` (costruttore di copia) e i metodi `getValore()` e `setValore(int v)`, che funzionano nel modo atteso.  

```java
static void incrementa(Contatore x) {
    x.setValore(x.getValore() + 1);
}
// nel main:
Contatore a = new Contatore(1);
Contatore b = a;
Contatore c = new Contatore(a);
incrementa(b);
System.out.println(a.getValore() + " " + b.getValore() + " " + c.getValore());
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 11

Il seguente codice compila?  

```java
class Veicolo {
    private int ruote;
    Veicolo() { }
    int getRuote() { return ruote; }
}
class Auto extends Veicolo {
    Auto() { ruote = 4; }
}
```

A) Compila con la seguente modifica: ______________________________  
B) Non compila in nessun caso.  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 12

Cosa stampa il seguente frammento?  

```java
class A {
    String nome = "A";
    String chi() { return "A"; }
    static String tipo() { return "tipoA"; }
}
class B extends A {
    String nome = "B";
    String chi() { return "B"; }
    static String tipo() { return "tipoB"; }
}
// nel main:
A x = new B();
System.out.println(x.nome + x.chi() + x.tipo());
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 13

Il seguente codice compila? In caso negativo indicare il motivo dell'errore e la correzione minima.  

```java
class Veicolo {
    protected int ruote;
    Veicolo(int ruote) { this.ruote = ruote; }
}
class Auto {
    Auto() { super(4); }
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 14

Il seguente codice compila?  

```java
class Animale {
    void verso() { System.out.println("..."); }
}
class Gatto extends Animale {
    @Overload
    void verso() { System.out.println("Miao"); }
}
```

A) Compila così com'è.  
B) Compila con la seguente modifica: ______________________________  
C) Non compila in nessun caso.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 15

Il seguente codice compila?  

```java
class Persona {
    String nome;
}
class Studente implements Persona {
    int matricola;
}
```

A) Non compila in nessun caso.  
B) Compila così com'è.  
C) Compila con la seguente modifica: ______________________________  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 16

Cosa produce il seguente codice?  

```java
interface Volante {
    void vola();
}
class Uccello {
    public void vola() { System.out.println("batte le ali"); }
}
class Aquila extends Uccello implements Volante { }
// nel main:
new Aquila().vola();
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 17

Cosa stampa il seguente frammento?  

```java
static int dividi(int a, int b) {
    try {
        return a / b;
    } catch (ArithmeticException e) {
        System.out.print("E");
        return -1;
    } finally {
        System.out.print("F");
    }
}
// nel main:
System.out.println(dividi(4, 0));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 18

Cosa produce il seguente frammento?  

```java
try {
    int[] v = new int[2];
    v[2] = 1;
    System.out.print("A");
} catch (Exception e) {
    System.out.print("B");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.print("C");
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


