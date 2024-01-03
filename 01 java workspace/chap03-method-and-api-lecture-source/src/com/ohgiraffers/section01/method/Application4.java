package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        //여러 개의 전달 인자를 이용한 메소드 호출을 할 수 있다.
        Application4 app4 = new Application4();
        app4.testMethod("이장님",62,'남'); /*메소드 호출*/
       // app4.testMethod(62,"이장님",'남'); 오류뜸/ 아규먼트 순서를 지키지 않았기 때문, 아규먼트 수가 모자라도 오류뜸

        //변수에 저장 된 값을 전달하며 호출
        String name = "유관순";
        int age = 20;
        char gender ='여';

        app4.testMethod(name, age, gender);
    }
    /* 여기부터*/
    public void testMethod(String name, int age, final char gender) { //3개의 매개벼수가 정의 되어 있는 메소드


        //매개변수도 일종의 지역 변수로 분류된다. final 키워드도 사용 가능하다.
        //단, final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다.
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");


    }/*여기까지 메소드의 선언*/
}
