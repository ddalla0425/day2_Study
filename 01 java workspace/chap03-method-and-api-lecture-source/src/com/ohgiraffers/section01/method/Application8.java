package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {  //static 특수한 키워드라고 생각하면 됨.
        //static 메소드를 호출 할 수 있다.

        //밑의 메소드가 static이 아니었다면
        //Application8 app8 = new Application8();
        //app8.sumTwoNumbers();
        //이렇게 호출 했을것

        //static 메소드를 호출하는 방법
        //클래스명.메소드명();

        System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10,20));

        //동일한 클래스 내에서 작성 된 static 메소드는 클래스명 생략이 가능
        System.out.println("10과 20의 합 : " + sumTwoNumbers(10,20)); // main 메소드와 sumTwoNumbers 메소드가 같은 클래스 안에 있기 때문에 Application.생략가능
    }
    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
