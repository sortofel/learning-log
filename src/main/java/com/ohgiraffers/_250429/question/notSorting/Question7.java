package com.ohgiraffers._250429.question.notSorting;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //7.
        //
        //정수를 입력받아 1부터 입력받은 정수까지
        //홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
        //
        //-- 입력 예시 --
        //정수를 입력하세요 : 5
        //
        //-- 출력 예시 --
        //토마토마토

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");

        int num = sc.nextInt();
        int i = 1;
        String tomato = "";

        while (i <= num) {

            if(i % 2 != 0) {
                tomato += "토";
            } else if(i % 2 == 0) {
                tomato += "마";
            } //tomato += "토"/"마";  대신 .print("토"/"마")로 바로 출력하는 방법이 있다.

            i++;
        }

        System.out.println(tomato);

    }
}
