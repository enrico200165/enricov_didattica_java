
<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---

# ESERCIZI CON SOLUZIONI – LIVELLO 1 (Java)

---
========
---  


# ESERCIZI CON SOLUZIONI – LIVELLO 1 (Java)

Note da esaminare opzionalmente **dopo aver esaurito il libro di testo. Lo studio è basato al 100% sul libro di testo**.

---   


>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 1. Introduzione a Java

## Esercizio 1

Scrivere un programma che stampi una frase.

**Soluzione**

```
public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("Benvenuto in Java!");
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 2

Stampare due frasi su due righe diverse.

**Soluzione**

```
public class Esercizio2 {
    public static void main(String[] args) {
        System.out.println("Prima riga");
        System.out.println("Seconda riga");
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 3

Compilare manualmente con javac ed eseguire con java.

**Soluzione attesa (terminal output)**

* Compilazione: `javac Esercizio3.java`
* Esecuzione: `java Esercizio3`

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 4

Programma che stampa tre istruzioni tipo manuale.

**Soluzione**

```
public class Esercizio4 {
    public static void main(String[] args) {
        System.out.println("1. Accendere il dispositivo");
        System.out.println("2. Attendere il caricamento");
        System.out.println("3. Selezionare una funzione");
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 5

Stampare definizioni di JVM, JRE e JDK.

**Soluzione**

```
public class Esercizio5 {
    public static void main(String[] args) {
        System.out.println("JVM: esegue il bytecode");
        System.out.println("JRE: ambiente per eseguire Java");
        System.out.println("JDK: strumenti di sviluppo, compilatore incluso");
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 2. Ambiente di sviluppo

## Esercizio 1

Verificare le versioni.

**Soluzione attesa**

* `java -version`
* `javac -version`

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 4

Compilare generando file .class in una cartella bin.

**Comandi**

* `javac -d bin src/Esempio.java`
* `java -cp bin Esempio`

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 3. Sintassi di base

## Esercizio 1

Classe con main che stampa un messaggio.

**Soluzione**

```
public class TestSintassi {
    public static void main(String[] args) {
        System.out.println("Messaggio di prova");
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 4

Due metodi statici richiamati dal main.

**Soluzione**

```
public class MetodiStatici {
    public static void saluta() {
        System.out.println("Ciao!");
    }

    public static void addio() {
        System.out.println("Arrivederci!");
    }

    public static void main(String[] args) {
        saluta();
        addio();
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 4. Tipi di dato e variabili

## Esercizio 1

Dichiarare variabili di tutti i tipi primitivi.

**Soluzione**

```
public class TipiPrimitivi {
    public static void main(String[] args) {
        byte a = 10;
        short b = 200;
        int c = 3000;
        long d = 40000L;
        float e = 3.14f;
        double f = 2.71828;
        char g = 'A';
        boolean h = true;

        System.out.println(a + " " + b + " " + c + " " + d);
        System.out.println(e + " " + f + " " + g + " " + h);
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 4

Convertire double in int.

**Soluzione**

```
public class Cast {
    public static void main(String[] args) {
        double x = 12.9;
        int y = (int) x;
        System.out.println(y); // stampa 12
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 5. Operatori

## Esercizio 1

Operazioni aritmetiche.

**Soluzione**

```
public class Operatori1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        System.out.println("Somma: " + (a + b));
        System.out.println("Diff: " + (a - b));
        System.out.println("Prod: " + (a * b));
        System.out.println("Resto: " + (a % b));
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 6

Espressione complessa.

**Soluzione**

```
int risultato = (4 + 5 * 2) - (10 / 2);
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 6. Strutture di selezione

## Esercizio 1

Verificare pari/dispari.

**Soluzione**

```
public class PariDispari {
    public static void main(String[] args) {
        int n = 7;
        if (n % 2 == 0) {
            System.out.println("Pari");
        } else {
            System.out.println("Dispari");
        }
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 4

Calcolare se una persona è maggiorenne.

**Soluzione**

```
public class Maggiorenne {
    public static void main(String[] args) {
        int anno = 2006;
        int eta = 2025 - anno;

        if (eta >= 18) {
            System.out.println("Maggiorenne");
        } else {
            System.out.println("Minorenne");
        }
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 6

Simulare accesso a un servizio.

**Soluzione**

```
public class Accesso {
    public static void main(String[] args) {
        String ruolo = "docente";

        if (ruolo.equals("studente")) {
            System.out.println("Accesso limitato");
        } else if (ruolo.equals("docente")) {
            System.out.println("Accesso a sezioni didattiche");
        } else if (ruolo.equals("amministratore")) {
            System.out.println("Accesso completo");
        } else {
            System.out.println("Ruolo non riconosciuto");
        }
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 7. Strutture iterative

## Esercizio 1

Stampare 1–10.

**Soluzione**

```
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 4

Somma dei primi n numeri.

**Soluzione**

```
int n = 5;
int somma = 0;
for (int i = 1; i <= n; i++) {
    somma += i;
}
System.out.println(somma);
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 6

Triangolo di asterischi.

**Soluzione**

```
for (int r = 1; r <= 5; r++) {
    for (int c = 1; c <= r; c++) {
        System.out.print("*");
    }
    System.out.println();
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 8. Array

## Esercizio 1

Creare array e stamparlo.

**Soluzione**

```
int[] a = {3, 7, 2, 9, 5};
for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 4

Trova massimo.

**Soluzione**

```
int max = a[0];
for (int i = 1; i < a.length; i++) {
    if (a[i] > max) {
        max = a[i];
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 6

Bubble sort semplice.

**Soluzione**

```
for (int i = 0; i < a.length - 1; i++) {
    for (int j = 0; j < a.length - 1 - i; j++) {
        if (a[j] > a[j+1]) {
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
        }
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 9. Metodi

## Esercizio 1

Metodo quadrato.

**Soluzione**

```
static int quadrato(int x) {
    return x * x;
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 5

Metodo che restituisce massimo in un array.

**Soluzione**

```
static int massimo(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }
    return max;
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 6

Metodo che verifica se un numero è primo.

**Soluzione**

```
static boolean primo(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

# 10. Classi e oggetti

## Esercizio 1

Classe Studente.

**Soluzione**

```
public class Studente {
    String nome;
    int eta;
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 4

Costruttore e instanziazione.

**Soluzione**

```
public class Studente {
    String nome;
    int eta;

    public Studente(String n, int e) {
        nome = n;
        eta = e;
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 7

Classe Prodotto con calcolo totale.

**Soluzione**

```
public class Prodotto {
    String nome;
    double prezzo;
    int quantita;

    public Prodotto(String n, double p, int q) {
        nome = n;
        prezzo = p;
        quantita = q;
    }

    public double totale() {
        return prezzo * quantita;
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md

## Esercizio 8

Classe Rettangolo.

**Soluzione**

```
public class Rettangolo {
    double base;
    double altezza;

    public Rettangolo(double b, double h) {
        base = b;
        altezza = h;
    }

    public double area() {
        return base * altezza;
    }

    public double perimetro() {
        return 2 * (base + altezza);
    }
}
```

<<<<<<<< HEAD:010_lezioni/010_base/src/lez_010_base_esercizi.md
---
========
---  

>>>>>>>> d4f1875 (s):010_lezioni/010_base/src/lez_011_base_esercizi.md
