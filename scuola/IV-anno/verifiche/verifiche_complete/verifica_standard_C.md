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

Scrivere nella classe `Squadra` il costruttore di copia, in modo che modificare i punti di una copia non modifichi quelli dell'originale.  

```java
class Squadra {
    private String nome;
    private int[] punti;
    Squadra(String nome, int[] punti) { this.nome = nome; this.punti = punti; }
    // scrivere qui il costruttore di copia
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 2

Il seguente codice compila?  

```java
class Figura {
    abstract double area();
}
```

A) Non compila in nessun caso.  
B) Compila così com'è.  
C) Compila con la seguente modifica: ______________________________  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 3

Il seguente codice compila?  

```java
class Persona {
    private String nome;
    public Persona(String nome) { this.nome = nome; }
    ~Persona() { System.out.println("addio"); }
}
```

A) Compila così com'è.  
B) Non compila in nessun caso.  
C) Compila con la seguente modifica: ______________________________  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 4

Il seguente codice compila? In caso negativo indicare il motivo dell'errore e la correzione minima.  

```java
class Animale {
    protected String nome;
    Animale(String nome) { this.nome = nome; }
}
class Gatto {
    Gatto() { super("Tom"); }
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 5

Cosa stampa il seguente frammento?  

```java
class Animale {
    protected String nome;
    public Animale(String nome) { this.nome = nome; }
    public String toString() { return "Animale " + nome; }
}
class Cane extends Animale {
    public Cane(String nome) { super(nome); }
    public String verso() { return "Bau"; }
}
// nel main:
Animale a = new Cane("Rex");
System.out.println(a + "!");
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 6

Cosa stampa il seguente frammento? La classe `Cella` ha i costruttori `Cella(int v)` e `Cella(Cella o)` (costruttore di copia) e i metodi `getValore()` e `setValore(int v)`, che funzionano nel modo atteso.  

```java
static void azzera(Cella x) {
    x = new Cella(0);
}
// nel main:
Cella a = new Cella(3);
Cella b = new Cella(a);
azzera(a);
b.setValore(8);
System.out.println(a.getValore() + " " + b.getValore());
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 7

Cosa stampa il seguente frammento?  

```java
String x = "luna";
String y = new String("luna");
String z = x;
System.out.println((x == y) + " " + (x == z) + " " + (y == z));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 8

Cosa stampa il seguente frammento?  

```java
class Animale {
    String tipo = "generico";
    String verso() { return "..."; }
}
class Cane extends Animale {
    String tipo = "cane";
    String verso() { return "Bau"; }
}
// nel main:
Animale a = new Cane();
System.out.println(a.tipo + " " + a.verso() + " " + ((Cane) a).tipo);
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 9

Cosa accade compilando ed eseguendo il programma?  

```java
abstract class Forma {
    abstract double area();
}
class Cerchio extends Forma {
    int r = 2;
    double area() { return 3 * r * r; }
}
class Quadrato extends Forma {
    int l = 3;
    double area() { return l * l; }
}
public class Prova {
    public static void main(String[] args) {
        Forma[] v = { new Cerchio(), new Quadrato() };
        double tot = 0;
        for (int i = 0; i < v.length; i++) tot += v[i].area();
        System.out.println(tot);
    }
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 10

Il seguente codice compila?  

```java
class Animale {
    private String nome;
    Animale() { }
    public void setNome(String nome) { this.nome = nome; }
}
class Cane extends Animale {
    Cane(String nome) { setNome(nome); }
}
```

A) Compila con la seguente modifica: ______________________________  
B) Compila così com'è.  
C) Non compila in nessun caso.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 11

Cosa stampa il seguente frammento?  

```java
class Punto {
    int x, y;
    Punto(int x, int y) { this.x = x; this.y = y; }
    public boolean equals(Punto p) { return x == p.x && y == p.y; }
}
// nel main:
Punto p1 = new Punto(3, 4);
Object o = new Punto(3, 4);
System.out.println(p1.equals(o) + " " + o.equals(p1));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 12

Cosa accade eseguendo l'istruzione `System.out.println(somma(a, 3));`?  

```java
static int somma(int[] v, int n) {
    int s = 0;
    for (int i = 0; i < n; i++) s += v[i];
    return s;
}
// nel main:
int[] a = {1, 2, 3, 4};
System.out.println(somma(a, 3));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 13

Il seguente codice compila?  

```java
class Forma {
    double area() { return 0; }
}
class Quadrato extends Forma {
    @Overrides
    double area() { return 4; }
}
```

A) Compila con la seguente modifica: ______________________________  
B) Non compila in nessun caso.  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 14

Data la classe `Auto`, il seguente frammento compila?  

```java
class Auto {
    private String marca;
    private int anno;
    public Auto(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }
}
// nel main:
Auto a = Auto("Fiat", 2020);
```

A) Compila così com'è.  
B) Non compila in nessun caso.  
C) Compila con la seguente modifica: ______________________________  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 15

Cosa produce il seguente codice?  

```java
interface Corridore {
    void corre();
}
class Animale {
    public void corre() { System.out.println("corre veloce"); }
}
class Ghepardo extends Animale implements Corridore { }
// nel main:
new Ghepardo().corre();
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 16

Il seguente codice compila?  

```java
class Forma {
    double area() { return 0; }
}
class Cerchio implements Forma {
    double area() { return 3; }
}
```

A) Compila così com'è.  
B) Compila con la seguente modifica: ______________________________  
C) Non compila in nessun caso.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

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
System.out.println(dividi(8, 2));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 18

Cosa produce il seguente frammento?  

```java
try {
    int x = 8 / 0;
    System.out.print("A");
} catch (Exception e) {
    System.out.print("B");
} catch (ArithmeticException e) {
    System.out.print("C");
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


