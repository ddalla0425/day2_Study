package com.ogiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        //필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다.

        //필드의 이름이나 자료형을 변경하면 사용한 쪽의 코드를 모두 수정해야 한다.
        //이는 유지보수에 악영향을 끼친다
        Monster monster1 = new Monster();
       // monster1.name = "피카츄";
        monster1.hp = 200;

        Monster monster2 = new Monster();
       // monster2.name = "라이츄";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        //monster3.name = "파이리";
        monster3.hp = 400;
    }
}
