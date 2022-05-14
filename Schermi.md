# Notazione asintotica

## Definizione (O-grande)
Data una funzione di costo $g(n)$ definiamo l'insieme di funzioni che rappresentano un **limite asintotico superiore** per $g(n)$ come
$$ O(g(n)) = \{ f(n) \mid \exists c > 0, n_0 \geq 0 \text{ t.c. } \forall n \geq n_0, f(n) \leq cg(n) \} $$

## Definizione ($\Omega$-grande)
Data una funzione di costo $g(n)$ definiamo l'insieme di funzioni che rappresentano un **limite asintotico inferiore** per $g(n)$ come
$$ \Omega(g(n)) = \{ f(n) \mid \exists c > 0, n_0 \geq 0 \text{ t.c. } \forall n \geq n_0, f(n) \geq cg(n) \} $$

## Definizione ($\Theta$)
Data una funzione di costo $g(n)$ definiamo l'insieme di funzioni **asintoticamente equivalenti** a $g(n)$ come
$$ \Theta(g(n)) = \{ f(n) \mid \exists c_1, c_2 > 0, n_0 \geq 0 \text{ t.c. } \forall n \geq n_0, c_1 g(n) \leq f(n) \leq c_2 g(n) \} $$

## Teorema
$$ f(n) = \Theta(g(n)) \iff f(n) = O(g(n)) \land f(n) = \Omega (g(n))$$

## Definizione (o-piccolo)
Data una funzione di costo $g(n)$ definiamo l'insieme di funzioni che sono **domiante asintoticamente** da $g(n)$ come
$$ o(g(n)) = \{ f(n) \mid \forall c > 0, \exists n_0 \geq 0 \text{ t.c. } \forall n \geq n_0, f(n) < cg(n) \} $$

## Definizione ($\omega$-piccolo)
Data una funzione di costo $g(n)$ definiamo l'insieme di funzioni che **dominano asintoticamente** $g(n)$ come
$$ \omega(g(n)) = \{ f(n) \mid \forall c > 0, \exists n_0 \geq 0 \text{ t.c. } \forall n \geq n_0, f(n) > cg(n) \} $$

## Analisi ammortizzata
Differisce dal costo medio perchè **calcola la media del costo di una sequenza di operazioni**

### Metodo dell'aggregazione
Determiniamo un limite superiore al costo totale di una sequenza di $n$ operazioni e dividiamo per $n$

        INSERIRE ESEMPIO

### Metodo degli accantonamenti
- Assegnamo un _costo ammortizzato_ ad ogni operazione
- Ogni operazione viene addebitata con il suo costo ammortizzato
- Salviamo come _credito_ la differenza tra il suo costo ammortizzato e il costo reale
- Se il costo reale è più alto, usiamo il credito
- Il costo ammortizzato è corretto se il **credito non è mai negativo**

        INSERIRE ESEMPIO


# Equazioni di ricorrenza

## Metodo dell'iterazione

Aproccio di tipo bruteforce, iteriamo fino a che non vediamo un pattern per il passo $i$ e da lì calcoliamo il costo in base a quando termina

        INSERIRE ESEMPIO

## Metodo della sostituzione

Usato per _validare_ un'ipotesi
- Ipotizziamo una soluzione
- Usiamo al definizione di $O, \Omega, \Theta$ per verificarla induttivamente

        INSERIRE ESEMPIO

## Metodo dell'albero di ricorsione

È la versione su albero del metodo iterativo
- Generiamo l'albero di ricorsione dall'equzione di ricorrenza
- Calcoliamo il numero di nodi ad ogni livello dell'albero
- Identifichiamo qualche schema ricorrente legato al livello dell'albero

## Master Theorem

Risolve equazioni di ricorrenza nella forma

$$ T(n) = aT(n/b) + f(n) \qquad \text{con }a \geq 1, b > 1 \text{ costanti e } f(n) \text{ asintoticamente positiva} $$

Si consideri la seguente equazione di ricorrenza

$$ DA INSERIRE $$

