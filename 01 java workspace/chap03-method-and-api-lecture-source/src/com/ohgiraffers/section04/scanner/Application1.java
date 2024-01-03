package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        //java.util.Scanner 를 이용한 다양한 자료형 값 입력 받기

        //1.Scanner 객체 생성
        Scanner sc = new Scanner(System.in); //방식이 제한적이라 ()소활호쪽 빨간줄 생길 수 있으니 > (System.in) 소괄호 안에 넣어줌

        //2. 자료형별 값 입력 받기
        //2-1. 문자열 입력 받기 : nextLine() - 입력 받은 값을 문자열로 반환
        /*System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine(); // 입력대기 상태
         콘솔창에 적은 값을 가져옴 > 그래서 처음 콘솔창에 입력하기 전까진 위의 "이름을 입력하세요 : " 까지만 뜸
        System.out.println("입력하신 이름은 " + name + "입니다.");*/

        //2-2. 정수형 입력 받기 : nextInt() - 입력 받은 값을 int형으로 반환
        //숫자가 아닌 값을 입력하면 java.util.InputMismatchException (런타임에러) 인풋이 메치 되지 않는다.
        //int 범위를 초과한 값을 입력하게 되어도 java.util.InputMismatchException 이 발생한다.
        /*System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");*/

        //nextLong() - 입력 받은 값을 long형으로 반환
        //nextInt와 에러가 발생하는 이유는 동일하다.
        /*System.out.print("금액을 입력하세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + "원 입니다.");*/

        //2-3. 실수형 값 입력 받기 - nextFloat() ; 입력 받은 값을 float 형으로 반환한다.
        //정수 형태로 입력하면 실수로 변환 후 정상 동작 되나 숫자 형태가 아닌 값은 InputMismatchException 발생
        /*System.out.print("키를 입력하세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm입니다.");*/

        //2-4. 논리형 값 입력 받기 - nextBoolean() : 입력 받은 값을 boolean 형으로 반환한다.
        //true or false 외의 다른 값을 입력하면 InputMismatchException 발생
        /*System.out.print("참과 거짓 중 하나를 true or false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + " 입니다.");*/

        //2-5. 문자형 값 입력 받기
        //문자를 직접 입력 받는 기능은 제공하지 않으므로 문자열로 입력 받은 뒤 원하는 문자를 분리해서 사용한다.
        //java.lang.String의 charAt(int index)를 사용한다.
        //index는 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용하는 방식이다.
        //만약 존재하지 않는 인덱스를 입력하게 되면 java.lang.StringIndexOutOfBoundsException이 발생
        System.out.print("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(10);
        System.out.println("입력하신 문자는 " + ch + " 입니다.");

    }
}
