function countLeaves(Tree T)
    if T == NIL then
        return 0
    else if isLeaf(T)
        return T.value
    else
        return countLeaves(T.left) + countLeaves(T.right)


// Conto foglie con BFS
function countLeavesBFS(Tree T)
    int n = 0
    Let Q be a Queue
    if T != NIL then
        enqueue(Q, T)
        while Q.size != 0 do
            x = dequeue(Q)
            if isLeaf(x)
                n = n + x.value
            if x.left != NIL then
                enqueue(Q, x.left)
            if x .right != NIL then
                enqueue(Q, x.right)
    return n