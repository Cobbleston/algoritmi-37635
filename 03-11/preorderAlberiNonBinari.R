// Visita per alberi generici
function preorder(Tree T)
    if T != NIL then
        visit(T)
        tmp = T.first
        while(tmp != NIL)
            preorder(tmp)
            tmp = tmp.next

// Variante più veloce
function preorderFast(Tree T)
    if T != NIL then
        visit(T)
        preorderFast(T.first)
        preorderFast(T.next)