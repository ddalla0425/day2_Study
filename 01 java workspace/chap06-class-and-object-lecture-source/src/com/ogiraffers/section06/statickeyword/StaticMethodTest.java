package com.ogiraffers.section06.statickeyword;

public class StaticMethodTest {

    private  int count;

    public void nonStaticMethod() {
        this.count++;
        System.out.println("nonStaticMethod 호출 됨...");
    }

    public static void staticMethod(){
        //static 메소드는 인스턴스를 생성하지 않고 상요하는 메소드 이기 때문에 this에 주소가 담길 수 없다.
//        this.count++;
        System.out.println("StaticMethod 호출 됨...");
    }

}
