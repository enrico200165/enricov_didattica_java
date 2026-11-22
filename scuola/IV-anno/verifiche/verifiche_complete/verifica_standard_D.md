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

Cosa stampa il seguente frammento?  

```java
class Studente {
    protected String nome;
    public Studente(String nome) { this.nome = nome; }
    public String toString() { return nome; }
}
class Matricola extends Studente {
    private int num;
    public Matricola(String nome, int num) { super(nome); this.num = num; }
    public String toString() { return "n." + num + " " + super.toString(); }
}
// nel main:
Studente s = new Matricola("Ada", 7);
String r = "" + s + s;
System.out.println(r);
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 2

Il seguente codice compila?  

```java
class Libro {
    private int pagine;
    Libro() { }
}
class Romanzo extends Libro {
    Romanzo() { this.pagine = 300; }
}
```

A) Compila così com'è.  
B) Non compila in nessun caso.  
C) Compila con la seguente modifica: ______________________________  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 3

Cosa accade compilando ed eseguendo il programma?  

```java
abstract class Documento {
    abstract String titolo();
    String stampa() { return "[" + titolo() + "]"; }
}
class Libro extends Documento {
    String titolo() { return "Dune"; }
}
class Rivista extends Documento {
    String titolo() { return "Focus"; }
}
public class Prova {
    public static void main(String[] args) {
        Documento[] v = new Documento[2];
        v[0] = new Libro();
        v[1] = new Rivista();
        System.out.println(v[0].stampa() + v[1].stampa());
    }
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 4

Il seguente codice compila?  

```java
class Persona {
    String descrivi() { return "persona"; }
}
class Studente extends Persona {
    @Overwrite
    String descrivi() { return "studente"; }
}
```

A) Non compila in nessun caso.  
B) Compila così com'è.  
C) Compila con la seguente modifica: ______________________________  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 5

Data la classe `Auto`, il seguente frammento compila?  

```java
class Auto {
    void avvia() { System.out.println("via"); }
}
// nel main:
Auto a = new Auto();
a.avvia();
delete a;
```

A) Non compila in nessun caso.  
B) Compila così com'è.  
C) Compila con la seguente modifica: ______________________________  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 6

Cosa stampa il seguente frammento?  

```java
String p = "cielo";
String q = new String(p);
String r = new String(q);
System.out.println(p.equals(r) + " " + (p == q) + " " + (q == r));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 7

Il seguente codice compila? In caso negativo indicare il motivo dell'errore e la correzione minima.  

```java
class Conto {
    protected double saldo;
    Conto(double saldo) { this.saldo = saldo; }
}
class ContoRisparmio {
    ContoRisparmio() { super(100); }
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 8

Scrivere nella classe `Ricetta` il costruttore di copia, in modo che modificare le quantità di una copia non modifichi quelle dell'originale.  

```java
class Ricetta {
    private String titolo;
    private double[] quantita;
    Ricetta(String titolo, double[] quantita) { this.titolo = titolo; this.quantita = quantita; }
    // scrivere qui il costruttore di copia
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 9

Cosa accade eseguendo l'istruzione `System.out.println(contaPari(a, 4));`?  

```java
static int contaPari(int[] v, int n) {
    int c = 0;
    for (int i = 0; i < n; i++) {
        if (v[i] % 2 == 0) c++;
    }
    return c;
}
// nel main:
int[] a = {2, 4, 6};
System.out.println(contaPari(a, 4));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 10

Cosa stampa il seguente frammento?  

```java
class Cerchio {
    int r;
    Cerchio(int r) { this.r = r; }
    public boolean equals(Cerchio c) { return r == c.r; }
}
// nel main:
Cerchio c1 = new Cerchio(2);
Cerchio c2 = new Cerchio(2);
Object o1 = c1;
System.out.println(o1.equals(c2) + " " + c1.equals(c2));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 11

Data la classe `Cane`, il seguente frammento compila?  

```java
class Cane {
    private String nome;
    private int eta;
    public Cane(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
}
// nel main:
Cane c = Cane("Rex", 3);
```

A) Compila con la seguente modifica: ______________________________  
B) Non compila in nessun caso.  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 12

Cosa stampa il seguente frammento? La classe `Cella` ha i costruttori `Cella(int v)` e `Cella(Cella o)` (costruttore di copia) e i metodi `getValore()` e `setValore(int v)`, che funzionano nel modo atteso.  

```java
static void raddoppia(Cella x) {
    x.setValore(x.getValore() * 2);
}
// nel main:
Cella a = new Cella(2);
Cella b = a;
Cella c = new Cella(b);
raddoppia(c);
System.out.println(a.getValore() + " " + b.getValore() + " " + c.getValore());
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 13

Il seguente frammento compila?  

```java
abstract class Forma {
    abstract double area();
}
class Quadrato extends Forma {
    double area() { return 4; }
}
// nel main:
Forma f = new Forma();
```

A) Compila così com'è.  
B) Compila con la seguente modifica: ______________________________  
C) Non compila in nessun caso.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 14

Cosa stampa il seguente frammento?  

```java
class A {
    void f(A x) { System.out.print("A"); }
}
class B extends A {
    void f(B x) { System.out.print("B"); }
}
// nel main:
A a = new B();
B b = new B();
a.f(b);
b.f(b);
b.f(a);
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 15

Il seguente codice compila?  

```java
abstract class Persona {
    abstract void presenta();
}
class Studente implements Persona {
    void presenta() { System.out.println("studente"); }
}
```

A) Compila con la seguente modifica: ______________________________  
B) Compila così com'è.  
C) Non compila in nessun caso.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 16

Cosa produce il seguente codice?  

```java
interface Volante {
    void vola();
}
class Uccello {
    public void vola(int quota) { System.out.println("vola a " + quota); }
}
class Aquila extends Uccello implements Volante { }
// nel main:
new Aquila().vola();
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 17

Cosa produce il seguente frammento?  

```java
try {
    int[] v = new int[2];
    v[2] = 1;
    System.out.print("A");
} catch (ArithmeticException e) {
    System.out.print("B");
} catch (Exception e) {
    System.out.print("C");
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 18

Cosa stampa il seguente frammento?  

```java
static int dividi(int a, int b) {
    try {
        System.out.print("T");
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


