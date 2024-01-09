package com.ogiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        //static 키워드에 대해 이해할 수 있다.

        //1.static 키워드를 필드에서 사용
        StaticFieldTest sft1 = new StaticFieldTest();

        System.out.println("non-static field : " + sft1.getNonStaticCount());
        System.out.println("static field : " + sft1.getStaticCount());

        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("non-static field : " + sft1.getNonStaticCount());
        System.out.println("static field : " + sft1.getStaticCount());

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println("non-static field : " + sft2.getNonStaticCount());
        System.out.println("static field : " + sft2.getStaticCount());

        //인스턴스 변수 -> non-static
        //인스턴스 변수(non-static)의 경우 sft1와 sft2 두개의 인스턴스가 생성 될 때마다 새로운 공간이 heap 영역에 할당 되어
        //0으로 초기화 된다. static 변수의 경우 sft1과 sft2가 모두 static 영역에 할당 된 하나의 공간을 공유하므로
        //증가 된 값 1로 출력된다.

        //2. static 메소드 호출
        StaticMethodTest.staticMethod();
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

    }
}
