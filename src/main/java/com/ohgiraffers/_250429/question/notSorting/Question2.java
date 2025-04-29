package com.ohgiraffers._250429.question.notSorting;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //2.
        //
        //정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요.
        //
        //-- 입력 예시 --
        //정수를 입력하세요 : 5
        //
        //-- 출력 예시 --
        //1부터 5까지의 합 : 15

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");

        int num = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= num) {

            sum += i;
            i++;

        }

        System.out.print("1부터 5까지의 합 : " + sum);

    }
}
