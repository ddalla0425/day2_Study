package com.ohgiraffers.section02.package_and_import;  // 패키지 선언문 > 무조건 패키지가 최상단에 쓰여져야함

import com.ohgiraffers.section01.method.Calculator;  // 패키지 선언문과 클래스 선언문 사이에 작성됨
import static com.ohgiraffers.section01.method.Calculator.maxNumber0f; //static import 구문

//
public class Application2 {                         // 클래스 선언문
    public static void main(String[] args) {
        //임포트에 대해 이해할 수 있다.
        //매번 풀클래스명을 장성하기는 번거로우므로 패키지명을 생략하고 사용할 수 있도록 import 구문을 사용한다.
        //import는 패키지 선언문과 class 선언문 사이에 작성하며 어떤 패키지 내에 있는 클래스를 사용 할 것인지에 대해 미리 선언하는 효과를 가진다


        //1.non-static 메소드 호출
        Calculator calculator = new Calculator();
        int min = calculator.minNumber0f(50,60);
        System.out.println("50과 60중에 작은 값은 ? " + min);

        //static 메소드 호출
        int max = Calculator.maxNumber0f(50,60);
        //static 메소드를 호출 할 때 import static을 아래와 같이 하면 클래스명도 생략하고 호출 할 수 있다.
        int max2 = maxNumber0f(50,60);
    }
}
