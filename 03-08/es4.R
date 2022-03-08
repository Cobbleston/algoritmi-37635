function removeEvenAndReplace(List L, Int dup) -> List
    if (L == NIL)
        return NIL
    else
        if (L.key % 2 == 0)
            return removeEvenAndReplace(L.next, dup+1)
        else
            L.next = removeEvenAndReplace(L.next, dup)
            while (dup > 0)
                tmp = new List(L.key)
                tmp.next = L
                L = tmp
                dup--
            return L

--------------------------------------------------------------------------

Caso ottimo:    Tutti numeri dispari o tutti numeri pari, while mai eseguito, quindi O(n)

Caso pessimo:   Tutti pari e ultimo dispari
                
                Idealmente (per conti, non possibile) consideriamo che entri dentro al while tutte le volte con dup = numero nodi precedenti
                Ovvero devo sommare tutti i numeri da 1 ad n, cioè O(n^2)

                Un caso realistico analogo è quello in cui alterno numeri pari e numeri dispari, a questo punto dovrei sommare i numeri da 1 a n/2, cioè O(n^2)