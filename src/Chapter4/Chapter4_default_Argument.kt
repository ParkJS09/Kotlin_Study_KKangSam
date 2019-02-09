package Chapter4

class Chapter4_default_Argument {


    fun sayHello(name : String){
        println("Hello ${name}")
    }

    fun sayHello1(name : String?){
        if( name == null){
            println("Hello KKang")
        }
        else
        {
            println("Hello ${name}")
        }
    }

    //함수 호출자에서 전달할 값이 없을 떄 기본 인수를 이용하면 조금 더 쉽게 작성이 가능
    //기본인수란 호출자가 값을 대입하지 않을 때 자동으로 적용되는 기본 값이다.
    fun sayHello2( name : String = "JSPark"){
        println("Hello ${name}")
    }

    //매개변수가 여러 개라면 기본 값이 적용되어야 하는 변수를 명확하게 지정해야한다.
    fun sayHello3( name : String = "JS_Park", no : Int){
        println("Hello ${no} , ${name}")
    }

    //호출하는 곳에서
    //1. sayHello3(10)은 에러가 발생 -> 어느 매개 변수에 대입할지 모름
    //2. sayHello3("Lee", 10)
    //3. sayHello3(no = 10)
    //4. sayHello3(name = "KIM", no = 10)
    //1번에서 에러가 발생하는데 이럴떄 필요한 것이 명명된 인수이다. 명명된 인수란 함추 호출 구문에서 이 인수를 대입하 매개변수의 이름을 지정하는 기법이다!

}