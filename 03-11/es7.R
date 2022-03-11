// Variante che non "guarda avanti"

function delLeaves(Tree T)
    if(T != NIL)
        if(isLeaf(T) and isLeftChild(T) and T.value == T.father.value)
            T.father.left = NIL
            delete(T)
        else
            delLeaves(T.left)
            delLeaves(T.right)