package Chapter4

class Chapter4_const {
    //val을 상수로 사용하면 된다 생각하겠지만 로직과 관련하여 값이 다르게 나올 수 있다 예를 들면 아래와같다
    var myBool = false
    val myVal : String = "hello"

    get(){
        if(myBool){
            myBool = false
            return field
        }
        else
        {
            myBool = true
            return field.toUpperCase()
        }
        println(myVal)
    }

    //위의 코드는 get을 통하여 hello가 HELLO로 대문자로 변경되어 출력된다 그렇다면 어떻게 상수를 선언할 수 있을까
    //const 키워드를 사용하면 된다
    //상수변수, 즉 처음에 대입한 값을 변경할 수 없고 항ㅅ아 초깃값만 반환하도록 보장하는 변수는 아래와 같이 만들 수 있따
    // const val myConst : Int = 10
    // const var myConst1 : Int = 20 <- var 변수에느 const 키워드를 사용할 수 없다.
    //클래스 내에서, 함수 내에서 const로 변수를 선언할 수 없다. const는 최상위 레벨 변수 혹은 object로 선언한 클래스에서만 사용할 수 있따.
    //최상위 레벨의 경우에는 패키지 내에서 전역변수처럼 이용될 수 있따!


}