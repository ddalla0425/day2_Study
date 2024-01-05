package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement() {
        //while문 단독 사용에 대한 흐름을 히해하고 적용할 수 있다.

        //1부터 10까지 1씩 증가시키면서 10번 출력하는 기본 반복문
        int i = 1;  // 초기식
        while (i <= 10) {  //조건식
            System.out.println(i);
            i++; //증감식     어떻게 빠져나가는지 핸들링 하지 않으면 무한루프함 증감식 빼먹으면 값 1이 무한 출력됨
        }
    }

    public void testWhileExample1() {
        //입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        //while문
//        int index = 0;
//        while (index < str.length()) { //str이라는 문자열이 담긴 변수 길이가 얼만지 반환
//            char ch = str.charAt(index);
//            System.out.println(index + " : " + ch);
//            index++;
//        }

        //for문 위의 while문을 for문으로 변경해보기
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            System.out.println(index + " : " + ch);
        }

        //index는 0 부터 시작하고 마지막 인덱스는 항상 길이보다 한개씩 작은 숫사를 가진다
        //존자하지 않는 인덱스에 접근할 경우 java.lang.StringIndexOutOfBoundsException 이 발생한다.
    }

    public void testWileExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나 입력 : ");
        int num = sc.nextInt();


        //while문으로 작성
        int sum = 0;

        int i = 1;
        while (i <= num) {
//            sum += i;  //
//            i++;       // 이 두줄을 sum += i++; 한줄로 줄일 수 있다.
            sum += i++;
        }
        System.out.println("1부터 입력 받은 정수" + num + "까지의 합은 " + sum + "입니다.");
    }

    public void testWhileExample3() {
        //중첩 while문을 이용한 구구단 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int dan = 2;  //외부 while문 초기식
        while (dan < 10) {
            int su = 1; //내부 while문 초기식
            while (su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                su++; //내부 while문 증감식
            }
            System.out.println(); // 단 끼리 붙어 있어서 띄어주기
            dan++;  //외부 while문 증감식
        }
    }
}
