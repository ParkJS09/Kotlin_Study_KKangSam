package Chapter4

class Chapter4_null{
    //STATE : 변수값을 초기에 대입할 수 없는경우!!

    //HOW : 초기값을 null로 선언!!!

    //주의사항 : 코틀린서는 null 값을 대입하려면 명시적으로 null이 될 수 있는 변수로 선언해야한다.

    //변수를 선언시 타입에 ?(null 연산자라고 칭하겠음)를 이용하여 명시적으로 null이 될 수 있는 변수로 선언!

    //null 연산자를 사용하지 않은 변수를 null로 초기값을 정할 수 없다!
    // val nonNullData : String = null
    //아래의 nullableData1은 null 연산자를 사용하여 null을 대입할 수 있지만 val로 선언하였기에 읽기 전용으로 밖에 사용 못한다.
    val nullableData1: String? = null
    //var로 선언되었고 null 연산자를 사용한 변수는 null로 초기화 이후 값을 대입 할 수 있따.
    var nullableData2 : String? = null

    fun callNullData(){
        //val로 선언된 변수이기에 읽기 전용으로 밖에 사용 못하므로 값을 대입할 경우 에러가 발생
        //nonNullData1 = "Hello"
        nullableData2 = "Hello"
        println("nullableData2 : ${nullableData2}")
    }

}