package Chapter4

infix fun Int.myFun( x : Int ) : Int {
    return x * x
}

class FunClass{
    infix fun infixFun( a :  Int ) {
        println("infixFun call")
    }
}

