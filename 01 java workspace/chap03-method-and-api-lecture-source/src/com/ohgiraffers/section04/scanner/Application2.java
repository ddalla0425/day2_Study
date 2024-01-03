package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* Scanner의 nextLine(), next()를 구분해서 사용할 수 있다.*/
        //nextLine() : 공백을 포함한 한줄 입력을 위해 개행문자 전까지 읽어서 문자열로 반환
        //next() : 공백문자나 개형문자 전까지 읽어서 문자열로 반환
        //enter도 공백 인것 > 그걸 개행문자라 함
        Scanner sc = new Scanner(System.in); //스캐너 객체 생성

        System.out.print("인사말을 입력해주세요 : ");
        String greeting1 = sc.nextLine();
        System.out.println(greeting1);

        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println(greeting2);
    }
}
