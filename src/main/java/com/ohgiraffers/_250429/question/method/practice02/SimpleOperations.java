package com.ohgiraffers._250429.question.method.practice02;

public class SimpleOperations {

    public void printMessage() { // 메소드 호출 확인용 메소드 호출
        System.out.println("메소드 호출 확인");
    }

    public int sumNumbers(int start, int end) { // start부터 end까지의 숫자들의 합을 출력하는 메소드 호출

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(start + "부터 " + end + "까지의 합은 " + sum + "입니다.");

        return sum;
    }

    public boolean isEvenNumber(int num){ // 주어진 숫자가 짝수인지 판별하는 메소드 호출 후 결과 출력

        boolean result;

        if (num % 2 == 0) {
            result = true;
            System.out.println(num + "은 짝수입니다.");
        } else {
            result = false;
            System.out.println(num + "은 짝수가 아닙니다.");
        }

        return true;
    }

    public int countCharacter(String input, char ch) { //주어진 문자열에서 특정 문자의 개수를 출력하는 메소드 호출

        int i = 0;
        int result = 0;

        while (i < input.length()) { //문자열 숫자

            if (input.charAt(i) == ch) {
                result++;
            }

            i++;

        }

        System.out.println(input + "에서 " + ch + "의 개수는 : " + result);

        return result;
    }
}
