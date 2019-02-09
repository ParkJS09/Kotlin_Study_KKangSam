package Chapter8

//프로퍼티 초기화

//초기화 블럭에서 초기화 init
// 클래스의 프로퍼티를 선어하면서 동시에 초깃값을 대입하지 않고, 초기화 블록에서 프로퍼티를 초기화해서 사용할 수 있다.

class User {
    var name : String
    val age : Int

    init {
        name = "ParkJongSoon"
        age = 30
        println("init block name : $name, age : $age")
    }
}