package com.ohgiraffers._250429.question.method.practice01;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {

        int i;
        int sum = 0;

        for(i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지의 합 : " + sum);

        return sum;
    }

    public void checkMaxNumber(int a, int b) {

        int result = 0;

        if (a > b) {
            result = a;
        } else if (b > a) {
            result = b;
        }

        System.out.println("두 수 중 큰 수는 " + result + "이다.");

    }

    public int sumTwoNumber(int a, int b) {

        int result = 0;

        result = a + b;

        System.out.println(a + "과 " + b + "의 합은 : " + result);

        return result;
    }

    public int minusTwoNumber(int a, int b) {

        int result = 0;

        result = a - b;

        System.out.println(a + "과 " + b + "의 차는 : " + result);

        return result;

    }


}
