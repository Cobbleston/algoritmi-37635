// Variante con paramentro aggiuntivo
// height(T, -1)

function height(Tree T, int n) -> int
    if T == NIL
        return n
    else
        return max(height(T.left, n+1), height(T.right, n+1))



// Soluzione prof con BFS iterativa
// DA FINIRE

function height(Tree T) -> int
    Let Q be a Queue
    int d = 0
    if T == NIL then
        return -1
    else
        enqueue(Q, [T, 0])
        while Q.size != 0 do
            [x, d] = dequeue(Q)
            d = max(D, d)               // DA CONTROLLARE
            if x.left != NIL then
                enqueue(Q, [x.left, d+1])
            if x .right != NIL then
                enqueue(Q, [x.right, d+1])
    return n