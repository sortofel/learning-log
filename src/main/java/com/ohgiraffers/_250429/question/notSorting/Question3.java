package com.ohgiraffers._250429.question.notSorting;

public class Question3 {
    public static void main(String[] args) {

        //3.
        //
        //반복문을 사용하여 7단 구구단을 출력하세요.

        int i;
        int j;

        for(i = 1; i <= 7; i++) {

            for(j = 1; j <= 9; j++) {

                System.out.println(i + "*" + j + "=" + (i * j));

            }

            System.out.println();

        }

    }
}
