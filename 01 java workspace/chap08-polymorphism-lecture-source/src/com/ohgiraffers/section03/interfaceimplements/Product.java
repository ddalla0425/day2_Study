package com.ohgiraffers.section03.interfaceimplements;

//인터페이스는 '구현한다'라는 의미로 implements라는 키워드를 사용
//또한, 다중 상속이 간으한데, implements뒤에 인터페이스를 나열 하면 된다.
//클래스 상속을 하면서 인터페이스 구현도 가능하다.
//extends 키워드를 먼저 작성하고 implementts를 뒤에 작성한다.
public class Product extends Object implements InterProduct, java.io.Serializable{

    //InterProduct의 추상 메소드는 반드시 구현해야 한다.(오버라이딩 강제화)
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 한 메소드 호출...");
    }

    @Override
    public void abstMthod() {
        System.out.println("InterProduct의 absMethod 오버라이딩 한 메소드 호출...");
    }
    //static 메소드는 오버라이딩 할 수 없다.
//    @Override
//    public  static void staticMethod() {}

    //default 키워드는 인터페이스 내에서만 작성 가능하다.
//    @Override
//    public default void defaultMethod() {}

    // default 키워드를 제외하면 오버라이딩 가능하다.
    //단, 오버라이딩이 강제화 되어 있지 않다.
    //선택적 으로 가능하다.
    @Override
    public void defaultMethod() {
        System.out.println("Product 클래스의  defaultMethod 오버라이딩 한 메소드 호출...");
    }

}
