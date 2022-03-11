function countEven(Tree T) -> int
    if T == NIL
        return 0
    else if T.val % 2 == 0
        return 1 + countEven(T.first) + countEven(T.next)
    else
        return countEven(T.first) + countEven(T.next)