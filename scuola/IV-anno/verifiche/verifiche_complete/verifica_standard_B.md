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

Cosa stampa il seguente frammento? La classe `Serbatoio` ha i costruttori `Serbatoio(int l)` e `Serbatoio(Serbatoio s)` (costruttore di copia) e i metodi `getLitri()` e `setLitri(int l)`, che funzionano nel modo atteso.  

```java
static void riempi(Serbatoio s) {
    s.setLitri(s.getLitri() + 10);
}
// nel main:
Serbatoio a = new Serbatoio(5);
Serbatoio b = new Serbatoio(a);
Serbatoio c = b;
riempi(c);
System.out.println(a.getLitri() + " " + b.getLitri() + " " + c.getLitri());
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 2

Cosa accade compilando ed eseguendo il programma?  

```java
abstract class Animale {
    abstract int zampe();
}
class Cane extends Animale {
    int zampe() { return 4; }
}
class Uccello extends Animale {
    int zampe() { return 2; }
}
public class Prova {
    public static void main(String[] args) {
        Animale[] v = new Animale[3];
        v[0] = new Cane();
        v[1] = new Uccello();
        v[2] = new Cane();
        int tot = 0;
        for (int i = 0; i < v.length; i++) tot += v[i].zampe();
        System.out.println(tot);
    }
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 3

Cosa accade eseguendo l'istruzione `System.out.println(massimo(a, 5));`?  

```java
static int massimo(int[] v, int n) {
    int m = v[0];
    for (int i = 1; i < n; i++) {
        if (v[i] > m) m = v[i];
    }
    return m;
}
// nel main:
int[] a = {4, 9, 2};
System.out.println(massimo(a, 5));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 4

Il seguente codice compila?  

```java
abstract class Conto {
    abstract double interesse() { return 0; }
}
```

A) Compila con la seguente modifica: ______________________________  
B) Non compila in nessun caso.  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 5

Il seguente codice compila?  

```java
class Conto {
    double interesse() { return 0.01; }
}
class ContoRisparmio extends Conto {
    @override
    double interesse() { return 0.02; }
}
```

A) Non compila in nessun caso.  
B) Compila con la seguente modifica: ______________________________  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 6

Data la classe `Libro`, il seguente frammento compila?  

```java
class Libro {
    private String titolo, autore;
    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }
}
// nel main:
Libro l = Libro("Dune", "Herbert");
```

A) Non compila in nessun caso.  
B) Compila con la seguente modifica: ______________________________  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 7

Scrivere nella classe `Playlist` il costruttore di copia, in modo che aggiungere o cambiare un brano nella copia non modifichi la playlist originale.  

```java
class Playlist {
    private String nome;
    private String[] brani;
    Playlist(String nome, String[] brani) { this.nome = nome; this.brani = brani; }
    // scrivere qui il costruttore di copia
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 8

Cosa stampa il seguente frammento?  

```java
class Data {
    int g, m;
    Data(int g, int m) { this.g = g; this.m = m; }
    public boolean equals(Data d) { return g == d.g && m == d.m; }
}
// nel main:
Data d1 = new Data(1, 5);
Data d2 = new Data(1, 5);
Object o = d1;
System.out.println(d2.equals(o) + " " + d2.equals(d1));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 9

Cosa stampa il seguente frammento?  

```java
class Base {
    int v = 1;
    int f() { return 1; }
    static int g() { return 1; }
}
class Der extends Base {
    int v = 2;
    int f() { return 2; }
    static int g() { return 2; }
}
// nel main:
Base x = new Der();
System.out.println(x.v + " " + x.f() + " " + x.g());
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 10

Cosa stampa il seguente frammento?  

```java
String a = "sole";
String b = new String(a);
String c = b;
System.out.println(a.equals(c) + " " + (a == c) + " " + (b == c));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 11

Cosa stampa il seguente frammento?  

```java
class Conto {
    protected double saldo;
    public Conto(double saldo) { this.saldo = saldo; }
    public String toString() { return "Conto " + saldo; }
}
class ContoRisparmio extends Conto {
    public ContoRisparmio(double saldo) { super(saldo); }
    public String toString() { return super.toString() + " risparmio"; }
}
// nel main:
Conto c = new ContoRisparmio(50);
System.out.println("Saldo: " + c);
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 12

Il seguente codice compila? In caso negativo indicare il motivo dell'errore e la correzione minima.  

```java
class Figura {
    protected double lato;
    Figura(double lato) { this.lato = lato; }
}
class Quadrato {
    Quadrato() { super(2.0); }
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 13

Il seguente codice compila?  

```java
int[] v = new int[5];
v[0] = 3;
delete[] v;
```

A) Compila con la seguente modifica: ______________________________  
B) Compila così com'è.  
C) Non compila in nessun caso.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 14

Il seguente codice compila?  

```java
class Conto {
    private double saldo;
    Conto() { }
    double getSaldo() { return saldo; }
}
class ContoCorrente extends Conto {
    ContoCorrente() { saldo = 100; }
}
```

A) Non compila in nessun caso.  
B) Compila con la seguente modifica: ______________________________  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 15

Cosa produce il seguente codice?  

```java
interface Nuotatore {
    void nuota();
}
class Pesce {
    void nuota() { System.out.println("nuota"); }
}
class Salmone extends Pesce implements Nuotatore { }
// nel main:
new Salmone().nuota();
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 16

Il seguente codice compila?  

```java
interface Stampabile {
    void stampa();
}
class Documento extends Stampabile {
    public void stampa() { System.out.println("documento"); }
}
```

A) Compila con la seguente modifica: ______________________________  
B) Non compila in nessun caso.  
C) Compila così com'è.  

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione della scelta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 17

Cosa produce il seguente frammento?  

```java
try {
    int x = 5 / 0;
    System.out.print("A");
} catch (ArithmeticException e) {
    System.out.print("B");
} catch (RuntimeException e) {
    System.out.print("C");
}
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


### Domanda 18

Cosa stampa il seguente frammento?  

```java
static int leggi(int[] v, int i) {
    try {
        return v[i];
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.print("E");
        return 0;
    } finally {
        System.out.print("F");
    }
}
// nel main:
System.out.println(leggi(new int[]{7, 8}, 5));
```

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Risposta:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span>Spiegazione:&nbsp;</span><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>

<div style="display:flex; align-items:flex-end; margin:1.1em 0 0 0"><span style="flex:1; border-bottom:2px dotted #000; height:1.3em"></span></div>


