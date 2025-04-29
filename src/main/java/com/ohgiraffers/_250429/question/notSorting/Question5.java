package com.ohgiraffers._250429.question.notSorting;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //5.
        //
        //문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.
        //
        //-- 입력 예시 --
        //문자열을 입력하세요 : apple
        //
        //-- 출력 예시 --
        //0 : a
        //1 : p
        //2 : p
        //3 : l
        //4 : e

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        int i;

        for(i = 0; i < str.length(); i++) {      //i <= str.length(); error

            char ch = str.charAt(i);

            System.out.println(i + ":" + ch);

        }

    }
}
