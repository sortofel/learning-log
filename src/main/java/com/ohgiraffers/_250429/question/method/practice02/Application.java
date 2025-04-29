package com.ohgiraffers._250429.question.method.practice02;

public class Application {
    public static void main(String[] args) {

        SimpleOperations sop = new SimpleOperations();
        sop.printMessage();
        sop.sumNumbers(1, 10);
        sop.isEvenNumber(10);
        sop.countCharacter("Hello World", 'o'); //= int result

        //return 값을 활용할 것. return값은 메소드->호출 함수에 저장된다.
        //따라서 result 변수를 사용하지 않고 호출 함수에 입력값을 넣어 코드를 작성하면 된다.

    }

}
