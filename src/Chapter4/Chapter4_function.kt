package Chapter4

class Chapter4_function {
    //Kotlin에서 함수 선언은 fun이라는 예약어를 사용한다
    //형식 : fun 함수명 (매개변수명 : 타입 ) : 반환 타입 { }
    fun sum ( a : Int , b : Int ) : Int  {
        return  a + b
    }

    //함수 선언시 주의사항
    //1 : 매개변수 부분에 var, val을 선언할 수 없다. ( 함수의 매개변수는 무조건 val로 적용이 된다.)
    //2 : 함수 선언에서 의미있는 반환값이 없을 때는 Unit으로 명서 ( 생략 가능, 반환 타입이 없을떄는 기본으로 Unit으로 적용됨.)
    fun sumUnit( a : Int , b : Int ) : Unit{
        println("${a} + ${b} = ${a + b}")
    }

    //Unit을 명시하지 않은 함수
    fun sumNonUnit( a : Int , b : Int ) {
        println("${a} + ${b} = ${a + b}")
    }

    //코틀린의 기능 중 하나 함수 내의 함수!
    fun funinfun( a : Int , b : Int ) : Int {

        var sum = 0

        //함수 내의 선언된 함수는 그 함수의 지역 변수와 비슷한 개념으로 이용할 수 있다! (그렇지만 외부에서는 이 함수를 호출 할 수 없으머, 생성된 함수 내에서만 함수 호출이 가능!
        fun calSum(){
            for ( i in a .. b ){
                println("함수 내의 함수 ${i}")
                sum  += i
            }
        }
        calSum()
        return sum
    }
}