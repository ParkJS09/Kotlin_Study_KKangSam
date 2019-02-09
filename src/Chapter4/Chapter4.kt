package Chapter4

// 최상위 레벨 변수 선언 (초기화 X)
// val topData : Int
// var topData2 : Int

//에러 없이 진행을 위해선 초기화를 진행하여야한다 (최상위레벨 (클래스 밖의 변수를 의미))
val topData : Int = 10
var topData2 : Int = 20

class Chapter4Class {

    //4,5번 라인과 아래와 같이 클래스의 멤버 변수로 선언시에도 에러가 발생 why : 모두 선언과 동시에 값을 초기화하지 않아서
    //val objData1 : String
    //var objData2 : String

    //멤버변수 선언과 동시에 초기화
    val objData1 : String = "Member1"
    var objData2 : String = "Member2"


    fun some(){
        //아래와 같이 함수 내부에 변수를 선언하였을때는 선언과 동시에 값을 초기화 하지 않아도 에러가 발생하지 않는다.
        //하지만 함수 내부의 변수들도 자동으로 초기값이 대입되지 않으므로 이 변수들을 이용하려면 반드시 초기화가 필요!
        val localData1 : Int
        var localData2 : String

        //초기화 되지 않은 변수를 사용할 경우 에러 발생
        //println(localData1)
        //함수 내부의 변수도 초기화 필요
        localData1 = 30
        localData2 = "hello"

        println("topData1 : ${topData} , topData2 : ${topData2} , objData1 : ${objData1} , objData2 : ${objData2} , localData1 : ${localData1}, localData2 : ${localData2}")
    }
}