function removeEven(List L) -> List
    if (L == NIL)   // Lista vuota
        return NIL
    else            // Lista non vuota
        if L.key % 2 == 0       // Nodo con valore pari
            return removeEven(L.next)
        else                    // Nodo con valore dispari
            L.next = removeEven(L.next)
            return L

--------------------------------------------------------------------------

        | 1             n = 0
T(n) =  |
        | T(n-1) + 1    n > 0