package Chapter4


/*
가변인수 : 함수를 정의할때 매개변수를 다르게 하여 같은 이름의 함수를
           여러개 정의 할 수 있다.
 */

class Chapter4_vararg {
    fun <T> varargsFun ( a1 : Int , vararg array : T) {
        for ( a in array ){
            println("Chapter4_vararg ${a}")
        }
    }
}