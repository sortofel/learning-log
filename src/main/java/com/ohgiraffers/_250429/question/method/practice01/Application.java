package com.ohgiraffers._250429.question.method.practice01;

public class Application {

    //// method practice (1)
    //
    //다음과 같은 조건을 만족하는 프로그램을 작성하시오.
    //
    //반환형과 매개변수 유무에 따라 메소드를 작성하고, 이를 호출하거나 출력하시오.
    //
    //1. 구현 클래스 및 구현 내용
    //
    //com.ohgiraffers.practice01.Calculator.java
    //
    //+ checkMethod():void                    // 함수 호출 확인용 메소드
    //+ sum1to10():int                        // 1부터 10까지 수를 더하여 값을 리턴함
    //+ checkMaxNumber(a:int, b:int):void     // 두 수를 입력받아 큰 수를 출력함
    //+ sumTwoNumber(a:int, b:int):int        // 두 수를 입력받아 합을 리턴함
    //+ minusTwoNumber(a:int, b:int):int      // 두 수를 입력받아 차를 리턴함
    //
    //
    //com.ohgiraffers.practice01.Application.java
    //
    //+ main(args:String[]):void              // 모든 메소드는 main 함수에서 호출하여 출력
    //
    //------------------------------------------------------------------------------------
    //
    //2. Application 클래스 작성 내용 - Calculator 클래스에 있는 각 메소드를 호출한다.
    //
    // public class Application {
    //    public static void main(String args[]) {
    //        //메소드 호출 확인용 메소드 호출
    //        //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
    //        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
    //        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
    //        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
    //    }
    // }
    //
    // ------------------------------------------------------------------------------------
    //
    //3. 실행 결과 예시
    //
    //메소드 호출 확인
    //1부터 10까지의 합 : 55
    //두 수 중 큰 수는 20이다.
    //10과 20의 합은 : 30
    //10과 5의 차는 : 5
    public static void main(String[] args) {
        Calculator ca = new Calculator();
        ca.checkMethod();
        ca.sum1to10();
        ca.checkMaxNumber(10, 20);
        ca.sumTwoNumber(10, 20);
        ca.minusTwoNumber(10, 5);
    }

}
