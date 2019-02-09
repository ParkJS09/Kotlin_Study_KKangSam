package Chapter4

class Chapter4_overloading {

    //여기선 같은 이름의 함수를 매개변수 부분을 다르게하여 여러 개 정의하는 기법인 오버로딩을 볼 것이다!!

    fun some( a :  String){
        println("some (a : String) call")
    }

    fun some( a :  Int){
        println("some (a : Int) call")
    }


    fun some( a :  Int, b : String){
        println("some (a :  Int, b : String) call")
    }


    fun callSome() : Unit {
        some("a")
        some(10)
        some(10, "a")
    }

}