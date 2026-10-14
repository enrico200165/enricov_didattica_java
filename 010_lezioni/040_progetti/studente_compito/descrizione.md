
La codifica seguente, e l'esecuzione, va eseguita prima nel modo piu' semplice (ragionare su quale è), 
poi rendendola un po' piu' realistica mettendo ogni classe in un file dedicato (come eseguire?)

Codifica

Creare tre classi: Persona, Studente, Main.

Classe Persona  
attributi protected: nome (String), eta (int)
costruttore con i due parametri
metodo descrivi() che restituisce una stringa nel formato:
Nome: Mario, età: 45

Classe Studente (sottoclasse di Persona)  
attributi private: classe (String, es. “3B”), media (double)
costruttore con quattro parametri, che usa super(...) per inizializzare nome ed età
override di descrivi(): riusa il metodo della superclasse con super.descrivi() e aggiunge classe e media, formato:
Nome: Anna, età: 16, classe: 3B, media: 7.5
metodo promosso() che restituisce true se la media è maggiore o uguale a 6

Classe Main
crea una Persona e due Studente (uno con media sufficiente, uno insufficiente)
li inserisce in un array di tipo Persona[]
con un ciclo stampa descrivi() di ciascun elemento
per ogni studente stampa anche se è promosso o no (suggerimento: instanceof)
Output atteso
Nome: Mario, età: 45
Nome: Anna, età: 16, classe: 3B, media: 7.5
Promosso: true
Nome: Luca, età: 17, classe: 4A, media: 5.2
Promosso: false
Commenti sul corso