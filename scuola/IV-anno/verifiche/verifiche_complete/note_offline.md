## Note off-line per il docente (non distribuire agli studenti)

Documento di accompagnamento alle verifiche di Informatica, Unità 1 e 2 (classi, ereditarietà, polimorfismo, classi astratte, interfacce, eccezioni). Contiene le precauzioni contro lo scambio di domande e risposte e le indicazioni di somministrazione.

### Composizione delle verifiche

- 4 verifiche standard (A, B, C, D): 18 domande ciascuna, 6 semplici, 6 di difficoltà media, 6 medio alte; più domande di quante se ne possano svolgere in 50 minuti, per consentire la scelta.
- 2 verifiche PDP (1 e 2): 12 domande ciascuna, tutte a scelta con suggerimento, 4 per livello di difficoltà; codice di 1-3 righe; tempo 1 ora.
- 1 verifica PEI: 12 domande, con suggerimenti e opzioni esplicative; codice di 1-2 righe; tempo 1 ora.
- Nel testo distribuito non compaiono il tempo disponibile né i punteggi.
- Nelle standard le domande su interfacce (posizioni 15-16) precedono quelle sulle eccezioni (posizioni 17-18); lo stesso vale per PDP e PEI.

### Precauzioni contro lo scambio di domande e risposte

1. **Quattro varianti con gli stessi 18 modelli di domanda.** Ogni modello ha un dettaglio diverso in ogni variante (nomi di classi e variabili, valori, costruzione del codice), quindi la stessa risposta non vale per la stessa domanda. In alcuni casi la risposta cambia natura (per esempio il codice compila in una variante e non compila in un'altra).
2. **Posizioni diverse.** Le 14 domande generali occupano posizioni diverse in ognuna delle 4 varianti. Le domande su interfacce ed eccezioni, che per vincolo stanno in coda, hanno solo due posizioni possibili ciascuna: per questo le varianti si distinguono lì solo per l'ordine alternato e per i dettagli, non per la posizione.
3. **Ordine delle opzioni.** Nelle domande a scelta l'ordine delle tre opzioni cambia fra le varianti e fra le domande, quindi la lettera della risposta corretta non coincide.
4. **Spiegazione obbligatoria.** La spiegazione richiesta in ogni domanda a scelta o sull'output rende inutile copiare una lettera o un valore. Le spiegazioni identiche fra studenti vicini sono un indizio da segnalare.
5. **Più domande del necessario.** Chi copia dovrebbe indovinare quali domande ha scelto il vicino, e le varianti non coincidono.
6. **Fascicolo numerato.** Ogni pagina riporta in basso "Var. X - Pagina n di N" e il riquadro delle iniziali: un foglio scambiato fra studenti si riconosce, e non si possono sostituire pagine fra varianti diverse.
7. **Disposizione dei posti.** Assegnare le varianti in modo che due studenti adiacenti (davanti, dietro, a fianco, in diagonale) non abbiano mai la stessa variante: per esempio schema a scacchiera A-B / C-D ripetuto nelle righe. Distribuire i fascicoli capovolti e farli girare contemporaneamente.
8. **Materiale sul banco.** Sul banco solo penna e fascicolo; zaini e giacche lontano dai banchi; cellulari e tablet, anche spenti, non presenti (salvo autorizzazione scritta accettata dalla scuola).
9. **Uscite dall'aula.** Normalmente non consentite durante la verifica.
10. **Raccolta.** Ritirare i fascicoli alla consegna, controllando che ogni foglio riporti le iniziali.
11. **Trattamento uguale.** Tutte le verifiche hanno lo stesso aspetto: carta uguale, nessun colore diverso fra le varianti.
12. **Verifiche PDP e PEI.** Assegnare PDP 1 e PDP 2 a studenti non vicini fra loro e non vicini a studenti con la stessa verifica; il PEI ha un solo modello.

### Posizione di ogni modello nelle varianti standard

Le righe sono i modelli di domanda (da 1 a 18); le colonne indicano in quale posizione compare nella variante.

| Modello | Var. A | Var. B | Var. C | Var. D |
|---|---|---|---|---|
| 1 | 1 | 6 | 14 | 11 |
| 2 | 2 | 3 | 12 | 9 |
| 3 | 3 | 10 | 7 | 6 |
| 4 | 4 | 8 | 11 | 10 |
| 5 | 5 | 4 | 2 | 13 |
| 6 | 6 | 11 | 5 | 1 |
| 7 | 7 | 13 | 3 | 5 |
| 8 | 8 | 2 | 9 | 3 |
| 9 | 9 | 7 | 1 | 8 |
| 10 | 10 | 1 | 6 | 12 |
| 11 | 11 | 14 | 10 | 2 |
| 12 | 12 | 9 | 8 | 14 |
| 13 | 13 | 12 | 4 | 7 |
| 14 | 14 | 5 | 13 | 4 |
| 15 | 15 | 16 | 16 | 15 |
| 16 | 16 | 15 | 15 | 16 |
| 17 | 17 | 18 | 17 | 18 |
| 18 | 18 | 17 | 18 | 17 |

Elenco dei modelli: 1 costruttore senza `new`; 2 dimensione del vettore passata come parametro; 3 stringhe, copia con costruttore di `String` e alias; 4 `equals` come overload; 5 classi e metodi astratti (sintassi e creazione); 6 `toString()` invocata automaticamente; 7 `delete`, `delete[]` e distruttori C++; 8 array di tipo astratto; 9 scrittura del costruttore di copia; 10 alias, copia e passaggio di parametri; 11 attributi private della superclasse assegnati dalla sottoclasse; 12 polimorfismo, attributi nascosti e overload; 13 ereditarietà implicata dai nomi ma non dichiarata; 14 annotazioni inesistenti; 15 `implements` ed `extends` sbagliati; 16 interfacce e metodi ereditati; 17 `finally` e `return`; 18 ordine dei `catch`.

### Controllo del codice

Tutti i frammenti delle verifiche standard sono stati compilati ed eseguiti con `javac` e `java` e il risultato coincide con la risposta attesa riportata nei file delle soluzioni.
